package com.example.security.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.security.domain.AuthUsers;
import java.lang.String;


public interface AuthUsersRepository extends CrudRepository<AuthUsers,Integer>{
	
	
	@Query("Select au from AuthUsers au where au.userName=:userName")
	AuthUsers findByUserName(@Param("userName") String userName);

}
