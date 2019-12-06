package com.bdd.meatappapi.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.meatappapi.model.Order;
import com.bdd.meatappapi.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderResource {
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_USER') and #oauth2.hasScope('write')")
	public Order save(@Valid @RequestBody Order order) {
		Order orderSaved = orderService.save(order);
		return orderSaved;
	}

}
