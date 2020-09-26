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

import com.projectb.recruitment.entity.User;
import com.projectb.recruitment.exception.UserRegisteredException;
import com.projectb.recruitment.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<?> addUser(@RequestBody User user) {
		User userData;
		try {
			userData = userService.addUser(user);
			return ResponseEntity.status(HttpStatus.OK).body(userData);

		} catch (UserRegisteredException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> userList=userService.getAllUser();
		return ResponseEntity.status(HttpStatus.OK).body(userList);
	}

}
