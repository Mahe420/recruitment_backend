package com.projectb.recruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectb.recruitment.entity.TechApti;
import com.projectb.recruitment.repository.TechAptiRespository;
import com.projectb.recruitment.service.TechAptiService;

@Service
public class TechAptiServiceImpl implements TechAptiService {

	@Autowired
	TechAptiRespository techRepo;
	@Override
	public List<TechApti> getAll() {
		List<TechApti> listTechApp=techRepo.findAll();
		return listTechApp;
	}

	@Override
	public TechApti addTech(TechApti techApti) {
		TechApti techApt=techRepo.save(techApti);
		return techApt;
	}

	@Override
	public void deleteTechApti(int id) {
		techRepo.deleteById(id);
	}

	

}
