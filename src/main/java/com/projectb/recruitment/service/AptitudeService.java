package com.projectb.recruitment.service;

import java.util.List;

import com.projectb.recruitment.entity.Aptitude;

public interface AptitudeService {

	public List<Aptitude> getAll();
	public Aptitude addAptitude(Aptitude aptitude);
	public void deleteAptitude(int id);
}
