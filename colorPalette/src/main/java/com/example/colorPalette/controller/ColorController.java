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
@CrossOrigin(origins = "*", allowedHeaders = "*") 
@RequestMapping("/color")
public class ColorController {

	@Autowired
	ColorService service;
	
	@PostMapping("/")
	public String insert(@RequestBody ColorVO vo) {
		int i = service.checkHex(vo.getHex());
		if(i > 0) {
			return "insertFail";
		}
		else {
			service.insert(vo);
			return "insertSuccess";
		}
	}
	
	@PutMapping("/")
	public String update(@RequestBody ColorVO vo) {
		service.update(vo);
		return "updateSuccess";
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "deleteSuccess";
	}
	
	@GetMapping("/")
	public List<ColorVO> selectAll() {
		return service.selectAll();
	}
	
	
	@GetMapping("/{id}")
	public ColorVO select(@PathVariable int id) {
		
		return service.select(id);
	}
	
}
