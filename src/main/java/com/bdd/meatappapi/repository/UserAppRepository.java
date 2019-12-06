package com.bdd.meatappapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.UserApp;

public interface UserAppRepository extends MongoRepository<UserApp, String> {
	
	public Optional<UserApp> findByEmail(String email);

}
