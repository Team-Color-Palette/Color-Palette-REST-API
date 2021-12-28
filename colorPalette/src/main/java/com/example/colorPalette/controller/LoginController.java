package com.example.colorPalette.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.colorPalette.service.LoginService;
import com.example.colorPalette.vo.UserVO;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired 
	LoginService service;
	
	//회원가입
	@PostMapping("/")
	public String insert(@RequestBody UserVO vo) {
		int i = service.checkId(vo.getId());
		if(i > 0) {
			service.insert(vo);		
			return "joinSuccess";
		} else {
			return "joinFail";
		}
		
	}
	
	//회원탈퇴
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		return "deleteSuccess";
	}
	
	//회원조회
	@GetMapping("/{id}")
	public UserVO select(@PathVariable String id ) {
		
		return service.select(id);
	}
	
	//로그인
	@PostMapping("/loginCheck")
	public String login(@RequestBody UserVO input , HttpSession session) {
		UserVO vo = service.select(input.getId());
		if(vo != null) {
			if(vo.getPassword().equals(input.getPassword())) {
				session.setAttribute("login", vo);
				return "loginSuccess";
			}else {
				return "pwFail";
			}
		}else {
			return "idFail";
		}
	}
	
	//로그아웃
	@PostMapping("/logout")
	public String logout(HttpSession session) {
		UserVO vo = (UserVO)session.getAttribute("login");
		if(vo!=null) {
			session.removeAttribute("login");
			session.invalidate();
			return "logoutSuccess";
		}
		return "logoutFail";
		
	}
}
