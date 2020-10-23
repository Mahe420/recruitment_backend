package com.projectb.recruitment.service;

import com.projectb.recruitment.entity.Email;

public interface EmailService {

	public void select(Email details) throws Exception;
	public void reject(String email); 
	public void success(String email);
}
