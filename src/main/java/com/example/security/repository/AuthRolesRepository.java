package com.example.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.security.domain.AuthRoles;


public interface AuthRolesRepository extends CrudRepository<AuthRoles, Integer> {

}
