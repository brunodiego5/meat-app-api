package com.bdd.meatappapi.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.Restaurant;

public interface RestaurantRepository  extends MongoRepository<Restaurant, String> {
	
	List<Restaurant> findByName(String name);
	
	List<Restaurant> findAllBy(TextCriteria criteria);

}
