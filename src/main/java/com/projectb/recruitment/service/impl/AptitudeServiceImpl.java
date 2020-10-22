package com.projectb.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.Aptitude;
import com.projectb.recruitment.repository.AptitudeRepository;
import com.projectb.recruitment.service.AptitudeService;

@Service
public class AptitudeServiceImpl implements AptitudeService{

	@Autowired
	AptitudeRepository aptiRepo;
	@Override
	public List<Aptitude> getAll() {
		List<Aptitude> aptitudeList=aptiRepo.findAll();
		return aptitudeList;
	}

	@Override
	public Aptitude addAptitude(Aptitude aptitude) {
		Aptitude apti=aptiRepo.save(aptitude);
		return apti;
	}

	@Override
	public void deleteAptitude(int id) {
		aptiRepo.deleteById(id);
	}

	

}
