package com.projectb.recruitment.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.Login;
import com.projectb.recruitment.service.EmailService;
import com.projectb.recruitment.service.LoginService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	LoginService loginService;

	@Autowired
	private JavaMailSender jms;

	@Override
	public void select(HashMap details) throws Exception {
		List<Login> loginList = loginService.getAllLogin();
		Login login = loginList.stream()
				.filter(log -> log.getUser().getId() == Integer.valueOf(details.get("id").toString())).findFirst()
				.orElseThrow(()->new Exception("error in stream"));
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(details.get("email").toString());
		msg.setSubject("Result");
		msg.setText(
				"Hey,\n\nYou have cleared. Please login to take the next test\n\nUserName: "+login.getUsername()+"\nPassword: "+login.getPassword()+"\n\nThanks & Regards\nRecruitment Team");
		jms.send(msg);
		
	}

	@Override
	public void reject(String email) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Test Result");
		msg.setText("Hey,\n\nSorry, you haven't cleared the test.\nAll the best four your future endeavors.\n\nThanks & Regards\nRecruitment Team");
		jms.send(msg);
	}

	@Override
	public void success(String email) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Result");
		msg.setText("Hey,\n\nCongratulations, you have successfully cleared the Technical Test.\nYou will be called up soon.\n\nThanks & Regards\nRecruitment Team");
		jms.send(msg);
		
	}

}
