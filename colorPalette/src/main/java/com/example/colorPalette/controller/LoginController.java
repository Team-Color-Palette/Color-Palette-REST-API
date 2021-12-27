package com.example.colorPalette.controller;



import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/")
	public String insert(@RequestBody UserVO vo) {
		service.insert(vo);
		return "joinSuccess";
	}
}
