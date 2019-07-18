package com.tedu.entity;

import java.io.Serializable;

public class TUser implements Serializable{
	
	private static final long serialVersionUID = 1902115445776326856L;
	private Integer id;
	private String username;
	private String password;
	private String phone;
	private Integer TEmpId;	
	
	
	public TUser(int id, String username, String password, String phone, int tEmpId) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		TEmpId = tEmpId;
	}
	
	public TUser() {
		super();
	}

	@Override
	public String toString() {
		return "TUser [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
				+ ", TEmpId=" + TEmpId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getTEmpId() {
		return TEmpId;
	}
	public void setTEmpId(int tEmpId) {
		TEmpId = tEmpId;
	}
	
	
	
	
}
