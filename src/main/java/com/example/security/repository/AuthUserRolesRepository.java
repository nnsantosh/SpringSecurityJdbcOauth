package com.example.security.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.security.domain.AuthUserRoles;
import java.lang.Integer;
import java.util.List;

public interface AuthUserRolesRepository extends CrudRepository<AuthUserRoles,Integer>{
	
	
	@Query("Select aur from AuthUserRoles aur where aur.userId=:userId")
	List<AuthUserRoles> findByUserId(@Param("userId") Integer userId);

}
