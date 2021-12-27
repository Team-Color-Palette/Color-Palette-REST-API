package com.example.colorPalette.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.colorPalette.vo.UserVO;

@Mapper
public interface ILoginMapper {

	 //회원가입
	 public void insert(UserVO vo);
	 
	 //회원탈퇴
	 public void delete(String id);
	 
	 //회원수정
	 public void update(UserVO vo);
	 
	 //특정 회원 조회
	 public UserVO select(String id);
	 
	 //아이디 중복확인
	 public int checkId(String id);

}
