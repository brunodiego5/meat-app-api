package com.bdd.meatappapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.Menu;
import com.bdd.meatappapi.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> findByName(String name) {
		return menuRepository.findByName(name);
	}
	
	public List<Menu> findByRestaurantId(String restaurantId) {
		return menuRepository.findByRestaurantId(restaurantId);
	}
	
	public Optional<Menu> findById(String id) {
		return menuRepository.findById(id);
	}

}
