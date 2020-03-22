
package com.example.security.dto;

import org.springframework.security.core.GrantedAuthority;

public class GrantedRole implements GrantedAuthority {

	private static final long serialVersionUID = 805724631760768052L;

	private String roleName;

	public GrantedRole(String roleName) {
		super();
		this.roleName = roleName;
	}

	@Override
	public String getAuthority() { // TODO Auto-generated method stub
		return roleName;
	}

}
