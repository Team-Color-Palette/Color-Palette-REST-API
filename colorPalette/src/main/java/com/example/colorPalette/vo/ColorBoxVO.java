package com.example.colorPalette.vo;

import java.util.Date;

public class ColorBoxVO {

	private int boxId;
	private int id;
	private String title;
	private Date regDate;
	private int boxLike;
	private boolean favorites;
	
	
	
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getBoxLike() {
		return boxLike;
	}
	public void setBoxLike(int boxLike) {
		this.boxLike = boxLike;
	}

	public boolean isFavorites() {
		return favorites;
	}
	public void setFavorites(boolean favorites) {
		this.favorites = favorites;
	}
	@Override
	public String toString() {
		return "ColorBoxVO [boxId=" + boxId + ", id=" + id + ", title=" + title + ", regDate=" + regDate + ", boxLike="
				+ boxLike + ", favorites=" + favorites + "]";
	}

	
	
	
	
	
	
	
	
}
