package com.bdd.meatappapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userapp")
public class UserApp {

	@Id
	private String id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	@DBRef(lazy = true)
	private List<Permission> permissions;
	
	public UserApp () {}

	public UserApp(String name, String email, String password, List<Permission> permissions) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.permissions = permissions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", permissions="
				+ permissions + "]";
	}
	
}
