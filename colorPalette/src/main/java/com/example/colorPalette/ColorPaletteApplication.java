package com.example.colorPalette;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackageClasses = ColorPaletteApplication.class)
@SpringBootApplication
public class ColorPaletteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorPaletteApplication.class, args);
	}
	

}
