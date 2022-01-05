package com.example.colorPalette.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.colorPalette.vo.ColorVO;

@Mapper
public interface IColorMapper {

	//색상코드 추가
	public void insert(ColorVO vo);
	
	//색상코드 수정
	public void update(ColorVO vo);
	
	//색상코드 삭제
	public void delete(int id);
	
	//색상코드 전체 조회
	public List<ColorVO> selectAll();
	
	//특정 색상코드 조회
	public ColorVO select(int id);
	
	//중복된 색상코드 확인
	public int checkHex(String hex);


}
