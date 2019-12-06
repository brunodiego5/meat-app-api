package com.bdd.meatappapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.Permission;
import com.bdd.meatappapi.repository.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	public List<Permission> findAll() {
		return permissionRepository.findAll();
	}
	
	public void save(Permission permission) {
		permissionRepository.save(permission);
	}	
	
	public Optional<Permission> findByDescription(String description) {
		return permissionRepository.findByDescription(description);
	}
	

}
