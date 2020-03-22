package com.example.security.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuthUserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer userId;
	private Integer roleId;
	private Date creationDate;
	private Date lastUpdatedDate;
	
	

	public AuthUserRoles() {
		super();
	}

	public AuthUserRoles(Integer id, Integer userId, Integer roleId, Date creationDate, Date lastUpdatedDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		return "AuthUserRoles [id=" + id + ", userId=" + userId + ", roleId=" + roleId + ", creationDate="
				+ creationDate + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

}
