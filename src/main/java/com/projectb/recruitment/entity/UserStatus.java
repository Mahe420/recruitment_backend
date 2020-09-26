package com.projectb.recruitment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserStatus {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String userName;
@OneToOne(cascade = {CascadeType.PERSIST})
private User user;
private boolean resumeStatus;
private boolean appTaken;
private boolean appsStatus;
private boolean techTaken;
private boolean techAppsStatus;

public UserStatus() {
}

public int getId() {
	return id;
}

public String getUserName() {
	return userName;
}

public User getUser() {
	return user;
}

public boolean isResumeStatus() {
	return resumeStatus;
}

public boolean isAppTaken() {
	return appTaken;
}

public boolean isAppsStatus() {
	return appsStatus;
}

public boolean isTechTaken() {
	return techTaken;
}

public boolean isTechAppsStatus() {
	return techAppsStatus;
}

public void setId(int id) {
	this.id = id;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public void setUser(User user) {
	this.user = user;
}

public void setResumeStatus(boolean resumeStatus) {
	this.resumeStatus = resumeStatus;
}

public void setAppTaken(boolean appTaken) {
	this.appTaken = appTaken;
}

public void setAppsStatus(boolean appsStatus) {
	this.appsStatus = appsStatus;
}

public void setTechTaken(boolean techTaken) {
	this.techTaken = techTaken;
}

public void setTechAppsStatus(boolean techAppsStatus) {
	this.techAppsStatus = techAppsStatus;
}

public UserStatus(int id, String userName, User user, boolean resumeStatus, boolean appTaken, boolean appsStatus,
		boolean techTaken, boolean techAppsStatus) {
	super();
	this.id = id;
	this.userName = userName;
	this.user = user;
	this.resumeStatus = resumeStatus;
	this.appTaken = appTaken;
	this.appsStatus = appsStatus;
	this.techTaken = techTaken;
	this.techAppsStatus = techAppsStatus;
}

public UserStatus(String userName, User user, boolean resumeStatus, boolean appTaken, boolean appsStatus,
		boolean techTaken, boolean techAppsStatus) {
	super();
	this.userName = userName;
	this.user = user;
	this.resumeStatus = resumeStatus;
	this.appTaken = appTaken;
	this.appsStatus = appsStatus;
	this.techTaken = techTaken;
	this.techAppsStatus = techAppsStatus;
}

@Override
public String toString() {
	return "UserStatus [id=" + id + ", userName=" + userName + ", user=" + user + ", resumeStatus=" + resumeStatus
			+ ", appTaken=" + appTaken + ", appsStatus=" + appsStatus + ", techTaken=" + techTaken + ", techAppsStatus="
			+ techAppsStatus + "]";
}




	
}
