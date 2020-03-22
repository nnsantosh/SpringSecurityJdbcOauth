package com.example.security.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuthRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String roleName;
	private Date creationDate;
	private Date lastUpdatedDate;
	
	

	public AuthRoles() {
		super();
	}

	public AuthRoles(Integer id, String roleName, Date creationDate, Date lastUpdatedDate) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		return "AuthRoles [id=" + id + ", roleName=" + roleName + ", creationDate=" + creationDate
				+ ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
