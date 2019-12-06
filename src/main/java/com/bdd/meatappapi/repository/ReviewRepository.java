package com.bdd.meatappapi.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdd.meatappapi.model.Review;

public interface ReviewRepository extends MongoRepository<Review, String> {
		
	List<Review> findByName(String name);
	
	List<Review> findByRestaurantId(String restaurantId);
		
}
