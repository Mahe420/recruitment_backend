package com.projectb.recruitment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.Login;
import com.projectb.recruitment.repository.LoginRepository;
import com.projectb.recruitment.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Boolean loginUser(Login login) {
		Login loginData=loginRepository.findByUsernameAndPassword(login.getUsername(),login.getPassword());
		if(Optional.ofNullable(loginData)==null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Login> getAllLogin() {
		return loginRepository.findAll();
	}

	

}
