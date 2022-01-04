package com.example.colorPalette.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.colorPalette.dao.ILoginMapper;
import com.example.colorPalette.vo.UserVO;

@Service
public class LoginService implements ILoginService {

	@Autowired	
	ILoginMapper mapper;
	
	@Override
	public void insert(UserVO vo) {
		BCryptPasswordEncoder endcoder = new BCryptPasswordEncoder();
		String securePw = endcoder.encode(vo.getPassword()); 
		vo.setPassword(securePw);
		mapper.insert(vo);
	}

	@Override
	public void delete(String id) {
		
		mapper.delete(id);
	}

	@Override
	public void update(UserVO vo) {
	
		mapper.update(vo);
	}

	@Override
	public UserVO select(String email) {
		
		return mapper.select(email);
	}

	@Override
	public int checkId(String email) {
		
		return mapper.checkId(email);
	}

}
