package com.projectb.recruitment.service;

import java.util.HashMap;

public interface EmailService {

	public void select(HashMap details) throws Exception;
	public void reject(String email); 
	public void success(String email);
}
