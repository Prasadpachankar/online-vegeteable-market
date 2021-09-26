package com.app.ovm.dto;

import javax.persistence.Column;

public class LoginRequest {
	private String userName;
	private String password;

	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}

	public LoginRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest [userName=" + userName + ", password=" + password + "]";
	}

}
