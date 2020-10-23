package com.projectb.recruitment.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectb.recruitment.service.EmailService;

@RestController
@CrossOrigin
@RequestMapping(value = "/email")
public class EmailController {
	@Autowired
	EmailService emailService;
	
	@PostMapping(value="/select")
	public void select(@RequestBody HashMap details) throws Exception {
	emailService.select(details);	
	}
	
	@PostMapping(value="/reject")
	public void reject(@RequestBody String email) {
		emailService.reject(email);
	}
	
	@PostMapping(value="/success")
	public void success(@RequestBody String email) {
		emailService.success(email);
	}

}
