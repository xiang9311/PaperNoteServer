package com.xiang.dao.user;

/**
 * PnUser entity. @author MyEclipse Persistence Tools
 */

public class PnUser implements java.io.Serializable {

	// Fields

	private String id;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public PnUser() {
	}

	/** full constructor */
	public PnUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}