package com.example.colorPalette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.colorPalette.service.ColorService;
import com.example.colorPalette.vo.ColorVO;

@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class ColorController {

	@Autowired
	ColorService service;
	
	//색상 코드 추가
	@PostMapping("/")
	public String insertHex(@RequestBody ColorVO vo) {
		System.out.println(vo);
		service.insertHex(vo);
		return "insertHexSuccess";
	}
		
	//색상 코드 수정
	@PutMapping("/")
	public String updateHex(@RequestBody ColorVO vo) {
		service.updateHex(vo);
		return "updateHexSuccess";
	}
		
	//색상 코드 삭제
	@DeleteMapping("/{colorId}")
	public String deleteHex(@PathVariable int colorId) {
		service.deleteHex(colorId);
		return "deleteHexSuccess";
	}
		
	//컬러박스의 색상 코드 전체 삭제
	@DeleteMapping("/{boxId}/1")
	public String deleteAllHex(@PathVariable int boxId) {
		service.deleteAllHex(boxId);
		return "deleteAllHex";
	}
		
	//컬러박스별 색상코드들 조회
	@GetMapping("/{boxId}")
	public List<ColorVO> selectHex(@PathVariable int boxId){
		return service.selectHex(boxId);
	}
		
	//컬러박스 안에서 색상 코드 검색
	@GetMapping("/")
	public List<ColorVO> searchHex(@RequestBody ColorVO vo){
	       return service.searchHex(vo);
	}
	
}
