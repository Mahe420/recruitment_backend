package com.projectb.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectb.recruitment.entity.TechApti;

@Repository
public interface TechAptiRespository extends JpaRepository<TechApti, Integer> {

}
