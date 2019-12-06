package com.bdd.meatappapi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.Permission;

public interface PermissionRepository extends MongoRepository<Permission, String> {
	
	Optional<Permission> findByDescription(String description);
}
