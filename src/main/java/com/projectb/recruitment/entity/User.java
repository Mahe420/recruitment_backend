package com.projectb.recruitment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String userName;
private String lastName;
private String dob;
private String gender;
private String email;
private long phoneNumber;
private String state;
private String district;
private float mark10;
private String percent10;
private float mark12;
private String percent12;
private float markug;
private String percentug;
private float markPg;
private String percentPg;
private String extraCurriculam;
private long adhaarNo;
private String others;

public User() {
}

public User(int id, String userName, String lastName, String dob, String gender, String email, long phoneNumber,
		String state, String district, float mark10, String percent10, float mark12, String percent12, float markug,
		String percentug, float markPg, String percentPg, String extraCurriculam, long adhaarNo, String others) {
	super();
	this.id = id;
	this.userName = userName;
	this.lastName = lastName;
	this.dob = dob;
	this.gender = gender;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.state = state;
	this.district = district;
	this.mark10 = mark10;
	this.percent10 = percent10;
	this.mark12 = mark12;
	this.percent12 = percent12;
	this.markug = markug;
	this.percentug = percentug;
	this.markPg = markPg;
	this.percentPg = percentPg;
	this.extraCurriculam = extraCurriculam;
	this.adhaarNo = adhaarNo;
	this.others = others;
}
public int getId() {
	return id;
}
public String getUserName() {
	return userName;
}
public String getLastName() {
	return lastName;
}
public String getDob() {
	return dob;
}
public String getGender() {
	return gender;
}
public String getEmail() {
	return email;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public String getState() {
	return state;
}
public String getDistrict() {
	return district;
}
public float getMark10() {
	return mark10;
}
public String getPercent10() {
	return percent10;
}
public float getMark12() {
	return mark12;
}
public String getPercent12() {
	return percent12;
}
public float getMarkug() {
	return markug;
}
public String getPercentug() {
	return percentug;
}
public float getMarkPg() {
	return markPg;
}
public String getPercentPg() {
	return percentPg;
}
public String getExtraCurriculam() {
	return extraCurriculam;
}
public long getAdhaarNo() {
	return adhaarNo;
}
public String getOthers() {
	return others;
}
public void setId(int id) {
	this.id = id;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setDob(String dob) {
	this.dob = dob;
}
public void setGender(String gender) {
	this.gender = gender;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public void setState(String state) {
	this.state = state;
}
public void setDistrict(String district) {
	this.district = district;
}
public void setMark10(float mark10) {
	this.mark10 = mark10;
}
public void setPercent10(String percent10) {
	this.percent10 = percent10;
}
public void setMark12(float mark12) {
	this.mark12 = mark12;
}
public void setPercent12(String percent12) {
	this.percent12 = percent12;
}
public void setMarkug(float markug) {
	this.markug = markug;
}
public void setPercentug(String percentug) {
	this.percentug = percentug;
}
public void setMarkPg(float markPg) {
	this.markPg = markPg;
}
public void setPercentPg(String percentPg) {
	this.percentPg = percentPg;
}
public void setExtraCurriculam(String extraCurriculam) {
	this.extraCurriculam = extraCurriculam;
}
public void setAdhaarNo(long adhaarNo) {
	this.adhaarNo = adhaarNo;
}
public void setOthers(String others) {
	this.others = others;
}

@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", lastName=" + lastName + ", dob=" + dob + ", gender="
			+ gender + ", email=" + email + ", phoneNumber=" + phoneNumber + ", state=" + state + ", district="
			+ district + ", mark10=" + mark10 + ", percent10=" + percent10 + ", mark12=" + mark12 + ", percent12="
			+ percent12 + ", markug=" + markug + ", percentug=" + percentug + ", markPg=" + markPg + ", percentPg="
			+ percentPg + ", extraCurriculam=" + extraCurriculam + ", adhaarNo=" + adhaarNo + ", others=" + others
			+ "]";
}



}
