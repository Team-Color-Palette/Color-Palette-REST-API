package com.example.colorPalette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colorPalette.dao.IColorMapper;
import com.example.colorPalette.vo.ColorBoxVO;
import com.example.colorPalette.vo.ColorVO;


@Service
public class ColorService implements IColorService {

	@Autowired
	IColorMapper mapper;

	@Override
	public void insertBox(ColorBoxVO vo) {
		mapper.insertBox(vo);
		
	}

	@Override
	public void updateBox(ColorBoxVO vo) {
		mapper.updateBox(vo);
		
	}

	@Override
	public void deleteBox(int boxId) {
		mapper.deleteBox(boxId);
		
	}
	
	@Override
	public void deleteAllBox(int id) {
		mapper.deleteAllBox(id);
		
	}

	@Override
	public List<ColorBoxVO> selectAllBox() {
		
		return mapper.selectAllBox();
	}

	@Override
	public List<ColorBoxVO> selectBox(int id) {
		
		return mapper.selectBox(id);
	}

	@Override
	public ColorBoxVO searchBox(String title) {
		
		return mapper.searchBox(title);
	}

	@Override
	public void plusBoxLike(int boxId) {
		mapper.plusBoxLike(boxId);
		
	}
	
	@Override
	public void enrollment(int boxId) {
		mapper.enrollment(boxId);
		
	}

	@Override
	public void release(int boxId) {
		mapper.release(boxId);
		
	}

	@Override
	public List<ColorBoxVO> favoritesList(int id) {
		
		return mapper.favoritesList(id);
	}

	@Override
	public List<ColorBoxVO> boxLikeDesc() {
		
		return mapper.boxLikeDesc();
	}


	
	@Override
	public void insertHex(ColorVO vo) {
		mapper.insertHex(vo);
		
	}

	@Override
	public void updateHex(ColorVO vo) {
		mapper.updateHex(vo);
		
	}

	@Override
	public void deleteHex(int colorId) {
		mapper.deleteHex(colorId);
		
	}
	
	@Override
	public void deleteAllHex(int boxId) {
		mapper.deleteAllHex(boxId);
		
	}

	
	@Override
	public List<ColorVO> selectHex(int boxId) {
		
		return mapper.selectHex(boxId);
	}
	

	@Override
	public List<ColorVO> searchHex(ColorVO vo) {
		
		return mapper.searchHex(vo);
	}

	
	
	
	

	

}
