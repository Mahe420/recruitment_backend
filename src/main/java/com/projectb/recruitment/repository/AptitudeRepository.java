package com.projectb.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectb.recruitment.entity.Aptitude;

@Repository
public interface AptitudeRepository extends  JpaRepository<Aptitude, Integer>{

}
