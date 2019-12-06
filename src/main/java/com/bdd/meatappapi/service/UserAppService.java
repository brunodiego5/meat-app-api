package com.bdd.meatappapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.UserApp;
import com.bdd.meatappapi.repository.UserAppRepository;

@Service
public class UserAppService {
	
	@Autowired
	private UserAppRepository userAppRepository;
	
	public List<UserApp> findAll() {
		return userAppRepository.findAll();
	}
	
	public void save(UserApp userApp) {
		userAppRepository.save(userApp);
	}	
	

}
