package com.projectb.recruitment.service;

import java.util.List;

import com.projectb.recruitment.entity.User;
import com.projectb.recruitment.exception.UserRegisteredException;

public interface UserService {
	User addUser(User user) throws UserRegisteredException;
	List<User> getAllUser();
}
