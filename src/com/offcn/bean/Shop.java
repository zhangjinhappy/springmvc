package com.offcn.bean;

public class Shop {
    private Integer id;
    private String username;
    private Integer password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
    
}
