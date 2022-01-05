package com.example.colorPalette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colorPalette.dao.IColorMapper;
import com.example.colorPalette.vo.ColorVO;


@Service
public class ColorService implements IColorService {

	@Autowired
	IColorMapper mapper;
	
	@Override
	public void insert(ColorVO vo) {
		mapper.insert(vo);

	}

	@Override
	public void update(ColorVO vo) {
		mapper.update(vo);

	}

	@Override
	public void delete(int id) {
		mapper.delete(id);

	}

	@Override
	public List<ColorVO> selectAll() {
		
		return mapper.selectAll();
	}

	@Override
	public ColorVO select(int id) {
		
		return mapper.select(id);
	}

	@Override
	public int checkHex(String hex) {
		
		return mapper.checkHex(hex);
	}

}
