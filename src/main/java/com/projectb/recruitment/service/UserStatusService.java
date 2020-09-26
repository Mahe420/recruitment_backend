package com.projectb.recruitment.service;

import java.util.List;

import com.projectb.recruitment.entity.UserStatus;

public interface UserStatusService {
	List<UserStatus> getAll();
	UserStatus updateStatus(UserStatus status);
	UserStatus getStatusByUser(int userId);
}
