package com.example.colorPalette.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.colorPalette.vo.UserVO;

@Mapper
public interface ILoginMapper {

	 //회원가입
	 public void insert(UserVO vo);
	 
	 //회원탈퇴
	 public void delete(int id);
	 
	 //회원수정
	 public void update(UserVO vo);
	 
	 //이메일로 특정 회원 조회
	 public UserVO select(String email);
	 
	 //아이디로 특정 회원 조회
	 public UserVO selectId(int id);
	 
	 //이메일중복확인
	 public int checkId(String email);
	 
	 

}
