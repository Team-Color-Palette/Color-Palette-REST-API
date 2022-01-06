package com.example.colorPalette.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.colorPalette.service.ColorService;

@RestController
@RequestMapping("/color")
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class ColorController {

	@Autowired
	ColorService service;
	
}
