package com.projectb.recruitment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aptitude {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	String answer5;
	String answer6;
	String answer7;
	String answer8;
	String answer9;
	String answer10;
	@OneToOne
	UserStatus userStatus;

	public Aptitude() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer1() {
		return answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public String getAnswer4() {
		return answer4;
	}

	public String getAnswer5() {
		return answer5;
	}

	public String getAnswer6() {
		return answer6;
	}

	public String getAnswer7() {
		return answer7;
	}

	public String getAnswer8() {
		return answer8;
	}

	public String getAnswer9() {
		return answer9;
	}

	public String getAnswer10() {
		return answer10;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}

	public void setAnswer5(String answer5) {
		this.answer5 = answer5;
	}

	public void setAnswer6(String answer6) {
		this.answer6 = answer6;
	}

	public void setAnswer7(String answer7) {
		this.answer7 = answer7;
	}

	public void setAnswer8(String answer8) {
		this.answer8 = answer8;
	}

	public void setAnswer9(String answer9) {
		this.answer9 = answer9;
	}

	public void setAnswer10(String answer10) {
		this.answer10 = answer10;
	}

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(UserStatus userStatus) {
		this.userStatus = userStatus;
	}
	
	

}
