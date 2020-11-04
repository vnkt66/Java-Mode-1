package com.pack.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	@NotEmpty(message="Not empty")
    private String name;
    @Password
    private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
