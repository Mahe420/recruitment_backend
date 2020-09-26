package com.projectb.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectb.recruitment.entity.Login;
import com.projectb.recruitment.service.LoginService;

@RestController
@CrossOrigin
@RequestMapping(value="login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping
	public ResponseEntity<?> loginUser(@RequestBody Login login){
		Boolean value=loginService.loginUser(login);
		return ResponseEntity.status(HttpStatus.OK).body(value);
	}
	
	@GetMapping
	public ResponseEntity<List<Login>> getAllLogin(){
		List<Login> loginList=loginService.getAllLogin();
		return ResponseEntity.status(HttpStatus.OK).body(loginList);
	}
	
}
