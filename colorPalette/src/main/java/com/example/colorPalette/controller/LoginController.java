package com.example.colorPalette.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
		System.out.println(vo);
		int i = service.checkId(vo.getEmail());
		if(i > 0) {
			return "joinFail";
		} else {
			service.insert(vo);		
			return "joinSuccess";
		}
		
	}
	
	//회원탈퇴
	@DeleteMapping("/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "deleteSuccess";
	}
	
	//회원조회
	@GetMapping("/{id}")
	public UserVO select(@PathVariable String id) {
		System.out.println("========================");
		System.out.println(id);
		UserVO vo = service.select(id);
		System.out.println(vo);
		return vo;
	}
	
	//로그인
	@PostMapping("/loginCheck")
	public String login(@RequestBody UserVO input , HttpSession session) {
		System.out.println(input);
		UserVO vo = service.select(input.getEmail());
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		if(vo != null) {
			if(encoder.matches(input.getPassword(),vo.getPassword())) {
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
