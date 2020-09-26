package com.projectb.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectb.recruitment.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	User findByEmailAndPhoneNumber(String email, long phoneNumber);

}
