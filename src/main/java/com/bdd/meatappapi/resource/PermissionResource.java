package com.bdd.meatappapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.meatappapi.model.Permission;
import com.bdd.meatappapi.service.PermissionService;


@RestController
@RequestMapping("/permissions")
public class PermissionResource {

	@Autowired
	private PermissionService permissionService;
	
	@GetMapping
	public List<Permission> findAll() {
		return permissionService.findAll();
	}

}	
