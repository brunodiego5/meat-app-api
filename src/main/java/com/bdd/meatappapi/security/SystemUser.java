package com.bdd.meatappapi.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.bdd.meatappapi.model.UserApp;

public class SystemUser extends User {
	
	private static final long serialVersionUID = 1L;
	
	private UserApp userApp;

	public SystemUser(UserApp userApp, Collection<? extends GrantedAuthority> authorities) {
		super(userApp.getEmail(), userApp.getPassword(), authorities);
		this.userApp =userApp;
	}
	
	public com.bdd.meatappapi.model.UserApp getUser() {
		return userApp;
	}

	

}
