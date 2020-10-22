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
import com.projectb.recruitment.entity.TechApti;
import com.projectb.recruitment.service.AptitudeService;
import com.projectb.recruitment.service.TechAptiService;

@RestController
@CrossOrigin
@RequestMapping(value = "/techapps")
public class TechAptitudeController {

	@Autowired
	TechAptiService techAptiService;
	
	@PostMapping
	public ResponseEntity<?> addTechApps(@RequestBody TechApti techApti){
		try {
			TechApti techAptitude =techAptiService.addTech(techApti);
			return ResponseEntity.status(HttpStatus.OK).body(techAptitude);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAllTechApps(){
		try {
			List<TechApti> techAptitudeList =techAptiService.getAll();
			return ResponseEntity.status(HttpStatus.OK).body(techAptitudeList);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<?> deleteTechApps(@PathVariable int id){
		try {
		techAptiService.deleteTechApti(id);
			return ResponseEntity.status(HttpStatus.OK).body("Successfull deleted");
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

}
