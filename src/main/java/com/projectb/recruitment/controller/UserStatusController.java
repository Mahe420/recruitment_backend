package com.projectb.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectb.recruitment.entity.UserStatus;
import com.projectb.recruitment.service.UserStatusService;

@RestController
@CrossOrigin
@RequestMapping(value="/status")
public class UserStatusController {

	@Autowired
	private UserStatusService userStatusService; 
	@GetMapping
	public ResponseEntity<List<UserStatus>> getAllStatus(){
		List<UserStatus> userStatusList=userStatusService.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(userStatusList);	
	}
	
	@GetMapping(value="/{userId}")
	public ResponseEntity<UserStatus> getStatusByUser(int userId){
		UserStatus userStatus= userStatusService.getStatusByUser(userId);
		return ResponseEntity.status(HttpStatus.OK).body(userStatus);
	}
	
	@PutMapping
	public ResponseEntity<UserStatus> updateStatus(@RequestBody UserStatus userStatus){
		UserStatus userStatusData=userStatusService.updateStatus(userStatus);
		return ResponseEntity.status(HttpStatus.OK).body(userStatusData);	
			
	}



}
