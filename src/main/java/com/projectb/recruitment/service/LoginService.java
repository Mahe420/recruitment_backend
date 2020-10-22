package com.projectb.recruitment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.Login;

@Service
public interface LoginService {

	Login loginUser(Login login);

	List<Login> getAllLogin();

}
