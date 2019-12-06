package com.bdd.meatappapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.Review;
import com.bdd.meatappapi.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	public List<Review> findByName(String name) {
		return reviewRepository.findByName(name);
	}
	
	public List<Review> findByRestaurantId(String restaurantId) {
		return reviewRepository.findByRestaurantId(restaurantId);
	}
	
	public Optional<Review> findById(String id) {
		return reviewRepository.findById(id);
	}
		
}
