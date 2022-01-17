package com.example.colorPalette.vo;

import java.util.Date;

public class ColorVO {

	private int colorId;
	private int boxId;
	private String hex;
	private Date regDate;
	
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ColorVO [colorId=" + colorId + ", boxId=" + boxId + ", hex=" + hex + ", regDate=" + regDate + "]";
	}
	
	
}
