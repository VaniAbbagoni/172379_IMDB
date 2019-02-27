package com.imdb;

public class RegistrationPojo {
	
	private String name;
	private String psw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	public RegistrationPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegistrationPojo(String name, String psw) {
		super();
		this.name = name;
		this.psw = psw;	
	}	
}
