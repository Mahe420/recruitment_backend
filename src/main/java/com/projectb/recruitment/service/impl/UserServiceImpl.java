package com.projectb.recruitment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.User;
import com.projectb.recruitment.entity.UserStatus;
import com.projectb.recruitment.exception.UserRegisteredException;
import com.projectb.recruitment.repository.UserRepository;
import com.projectb.recruitment.repository.UserStatusRepository;
import com.projectb.recruitment.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserStatusRepository userStatusRepository;

	@Override
	public User addUser(User user) throws UserRegisteredException {
		User userfind = userRepository.findByEmailAndPhoneNumber(user.getEmail(), user.getPhoneNumber());
		if (Optional.ofNullable(userfind) == null)
			throw new UserRegisteredException("user is already register");
		else {
			User userdata = userRepository.save(user);
			UserStatus userStatus = new UserStatus(userdata.getUserName(), userdata,false,false,false, false, false);
			userStatusRepository.save(userStatus);
			return userdata;
		}
	}

	@Override
	public List<User> getAllUser() {
		List<User> userList = userRepository.findAll();
		return userList;
	}

}
