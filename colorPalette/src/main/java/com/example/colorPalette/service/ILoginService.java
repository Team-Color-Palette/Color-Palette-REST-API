package com.example.colorPalette.service;

import com.example.colorPalette.vo.UserVO;

public interface ILoginService {

	 //회원가입
	 public void insert(UserVO vo);
	 
	 //회원탈퇴
	 public void delete(int id);
	 
	 //회원수정
	 public void update(UserVO vo);
	 
	 //특정 회원 조회
	 public UserVO select(String email);
	 
	 //아이디로 특정 회원 조회
	 public UserVO selectId(int id);
	 
	 //아이디 중복확인
	 public int checkId(String email);
}
