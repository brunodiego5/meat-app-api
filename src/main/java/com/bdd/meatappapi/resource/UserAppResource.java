package com.bdd.meatappapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.meatappapi.model.UserApp;
import com.bdd.meatappapi.service.UserAppService;


@RestController
@RequestMapping("/usersApp")
public class UserAppResource {

	@Autowired
	private UserAppService userAppService;
	
	@GetMapping
	public List<UserApp> findAll() {
		
		/*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		List<Permission> permissions = new ArrayList<Permission>();
		
		Optional<Permission> permissionOp = permissionService.findByDescription("ROLE_USER");
		
		Permission permission = permissionOp.get();
		
		permissions.add(permission);
		
		UserApp userApp = new UserApp("MARIA", "maria@meat.com", encoder.encode("maria"), permissions);
		
		userAppService.save(userApp);*/
		
		return userAppService.findAll();
	}

}	
