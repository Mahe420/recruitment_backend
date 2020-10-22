package com.projectb.recruitment.service;

import java.util.List;

import com.projectb.recruitment.entity.TechApti;

public interface TechAptiService {

	public List<TechApti> getAll();
	public TechApti addTech(TechApti techApti);
	public void deleteTechApti(int id);
}
