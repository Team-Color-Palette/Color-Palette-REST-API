package com.example.colorPalette.service;

import java.util.List;

import com.example.colorPalette.vo.ColorBoxVO;
import com.example.colorPalette.vo.ColorVO;

public interface IColorService {

		//컬러박스 추가
		public void insertBox(ColorBoxVO vo);
		
		//컬러박스 이름 수정
		public void updateBox(ColorBoxVO vo);
		
		//컬러박스 삭제
		public void deleteBox(int boxId);
		
		//회원 컬러박스 전체 삭제
		public void deleteAllBox(int id);
		
		//컬러박스 전체 조회
		public List<ColorBoxVO> selectAllBox();
		
		//회원 컬러박스들 조회
		public List<ColorBoxVO> selectBox(int id);
		
		//컬러박스 검색
		public ColorBoxVO searchBox(String title);
		
		//컬러박스 좋아요 추가
		public void plusBoxLike(int boxId);
		
		//컬러박스 즐겨찾기 등록
		public void enrollment(int boxId); 
		
		//컬러박스 즐겨찾기 해제
		public void release(int boxId);
		
		//즐겨찾기를 등록한 회원의 컬러박스 리스트
		public List<ColorBoxVO> favoritesList(int id);
		
		//컬러박스 좋아요 많은 순으로 전체 조회
		public List<ColorBoxVO> boxLikeDesc();
		
		
		
		//색상 코드 추가
		public void insertHex(ColorVO vo);
		
		//색상 코드 수정
		public void updateHex(ColorVO vo);
		
		//색상 코드 삭제
		public void deleteHex(int colorId);
		
		//컬러박스의 색상 코드 전체 삭제
		public void deleteAllHex(int boxId);
		
		//컬러박스별 색상코드들 조회
		public List<ColorVO> selectHex(int boxId);
		
		//컬러박스 안에서 색상 코드 검색
		public List<ColorVO> searchHex(ColorVO vo);
		

}
