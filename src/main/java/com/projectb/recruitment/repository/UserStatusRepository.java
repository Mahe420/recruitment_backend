package com.projectb.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projectb.recruitment.entity.UserStatus;

@Repository
public interface UserStatusRepository extends JpaRepository<UserStatus,Integer> {

	@Query(value= "select * from user_status where user_id=?;" , nativeQuery=true)
	UserStatus getByUserId(int userId);

}
