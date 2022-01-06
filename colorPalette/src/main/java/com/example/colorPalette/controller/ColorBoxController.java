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
import com.example.colorPalette.vo.ColorBoxVO;
import com.example.colorPalette.vo.ColorVO;

@RestController
@RequestMapping("/colorBox")
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class ColorBoxController {

	@Autowired
	ColorService service;
	
	//컬러박스 추가
	@PostMapping("/")
	public String insertBox(@RequestBody ColorBoxVO vo) {
		
		ColorBoxVO box = service.searchBox(vo.getTitle());
		System.out.println(box);
		if(box != null) {
			box = null;
			System.out.println(box);
			return "insertBoxFail";
		}
		else{
			service.insertBox(vo);
			return "insertBoxSuccess";
		}
	}
	
	//컬러박스 이름 수정
	@PutMapping("/")
	public String updateBox(@RequestBody ColorBoxVO vo) {
		ColorBoxVO box = service.searchBox(vo.getTitle());
		if(box != null) {
			box = null;
			System.out.println(box);
			return "updatetBoxFail";
		}
		else{
			service.updateBox(vo);
			return "updateBoxSuccess";
		}
	}
	
	//컬러박스 삭제
	@DeleteMapping("/{boxId}")
	public String delete(@PathVariable int boxId) {
		service.deleteBox(boxId);
		return "deleteBoxSuccess";
	}
	
	//회원 컬러박스 전체 삭제
	@DeleteMapping("/{id}/1")
	public String deleteAllBox(@PathVariable int id) {
		service.deleteAllBox(id);
		return "deleteAllBoxSuccess";
	}
	
	//컬러박스 전체 조회
	@GetMapping("/")
	public List<ColorBoxVO> selectAllBox() {
		
		return service.selectAllBox();
	}
	
	//회원 컬러박스들 조회
	@GetMapping("/{id}/1")
	public List<ColorBoxVO> selectBox(@PathVariable int id) {
		
		return service.selectBox(id);
	}
	
	//컬러박스 검색
	@GetMapping("/{title}")
	public ColorBoxVO searchBox(@PathVariable String title){
		return service.searchBox(title);
	}
	
}
