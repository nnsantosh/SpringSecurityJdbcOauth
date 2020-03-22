
package com.example.security.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.security.domain.AuthRoles;
import com.example.security.domain.AuthUserRoles;
import com.example.security.domain.AuthUsers;
import com.example.security.dto.GrantedRole;
import com.example.security.dto.UserDetailsDTO;
import com.example.security.repository.AuthRolesRepository;
import com.example.security.repository.AuthUserRolesRepository;
import com.example.security.repository.AuthUsersRepository;

@Component
public class CustomUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AuthUsersRepository authUsersRepository;

	@Autowired
	private AuthUserRolesRepository authUserRolesRepository;

	@Autowired
	private AuthRolesRepository authRolesRepository;

	@Override
	public UserDetailsDTO loadUserByUsername(String username) {
		Set<GrantedRole> grantedRoles = null;
		AuthUsers authUser = authUsersRepository.findByUserName(username);
		System.out.println("CustomUserDetailsServiceImpl.loadUserByUsername() found user for username: " + username);
		if (authUser == null) {
			throw new UsernameNotFoundException("Invalid username");
		} else {
			List<AuthUserRoles> authUserRoles = authUserRolesRepository.findByUserId(authUser.getId());
			if (null != authUserRoles && !authUserRoles.isEmpty()) {
				System.out
						.println("CustomUserDetailsServiceImpl.loadUserByUsername() authUserRoles found for username: "
								+ username);
				grantedRoles = new HashSet<GrantedRole>();
				for (AuthUserRoles authUserRole : authUserRoles) {
					Optional<AuthRoles> authRoles = authRolesRepository.findById(authUserRole.getRoleId());
					GrantedRole role = new GrantedRole(authRoles.get().getRoleName());
					grantedRoles.add(role);
				}
			}
		}

		return new UserDetailsDTO(username, authUser.getPassword(), grantedRoles);
	}

}
