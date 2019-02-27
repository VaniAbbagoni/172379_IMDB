package com.imdb;

public class LoginPojo {
	
	private String name;
	private String password;

	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public LoginPojo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}
