package com.projectb.recruitment.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.Login;
import com.projectb.recruitment.entity.UserStatus;
import com.projectb.recruitment.repository.LoginRepository;
import com.projectb.recruitment.repository.UserStatusRepository;
import com.projectb.recruitment.service.UserStatusService;

@Service
public class UserStatusServiceImpl implements UserStatusService {

	@Autowired
	private UserStatusRepository userStatusRepository;

	@Autowired
	private LoginRepository loginRespository;

	@Override
	public List<UserStatus> getAll() {
		List<UserStatus> statusList = userStatusRepository.findAll();
		return statusList;
	}

	@Override
	public UserStatus updateStatus(UserStatus status) {
		UserStatus userStatus = userStatusRepository.save(status);
		if (!userStatus.isAppsStatus()) {
			Login login = new Login();
			login.setUsername(userStatus.getUserName());
			login.setPassword(passwordGeneration(userStatus.getUserName() + userStatus.getUser().getDob()));
			login.setUser(userStatus.getUser());
			loginRespository.save(login);
		}
		return userStatus;
	}

	
	@Override
	public UserStatus getStatusByUser(int userId) {
		return userStatusRepository.getByUserId(userId);
	}
	public static String passwordGeneration(String word) {
		ArrayList<Character> chars = new ArrayList<Character>(word.length());
		for (char c : word.toCharArray()) {
			chars.add(c);
		}
		Collections.shuffle(chars);
		char[] shuffled = new char[chars.size()];
		for (int i = 0; i < shuffled.length; i++) {
			shuffled[i] = chars.get(i);
		}
		String shuffledWord = new String(shuffled);
		return shuffledWord;
	}

	

}
