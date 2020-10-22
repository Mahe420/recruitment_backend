package com.projectb.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectb.recruitment.entity.Aptitude;
import com.projectb.recruitment.service.AptitudeService;

@RestController
@CrossOrigin
@RequestMapping(value = "/apps")
public class AptitudeController {

	@Autowired
	AptitudeService aptitudeService;
	
	@PostMapping
	public ResponseEntity<?> addApps(@RequestBody Aptitude apti){
		try {
			Aptitude aptitude =aptitudeService.addAptitude(apti);
			return ResponseEntity.status(HttpStatus.OK).body(aptitude);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAllApps(){
		try {
			List<Aptitude> aptitudeList =aptitudeService.getAll();
			return ResponseEntity.status(HttpStatus.OK).body(aptitudeList);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<?> deleteApps(@PathVariable int id){
		try {
			aptitudeService.deleteAptitude(id);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull deleted");
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
