package com.projectb.recruitment.entity;

public class Email {

	int id;
	String email;
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Email(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

}
