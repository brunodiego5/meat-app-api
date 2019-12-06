package com.bdd.meatappapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.Order;
import com.bdd.meatappapi.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order save(Order order) {
		return orderRepository.save(order);
	}

}
