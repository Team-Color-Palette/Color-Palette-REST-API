package com.example.colorPalette.vo;

import java.util.Date;

public class UserVO {

	private int id;
	private String email;
	private String password;
	private String name;
	private Date joinDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", joinDate="
				+ joinDate + "]";
	}
	
	
	
	
}
