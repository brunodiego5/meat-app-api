package com.bdd.meatappapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.Menu;

public interface MenuRepository extends MongoRepository<Menu, String> {
	List<Menu> findByName(String name);
	
	List<Menu> findByRestaurantId(String restaurantId);
}
