package com.bdd.meatappapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.stereotype.Service;

import com.bdd.meatappapi.model.Restaurant;
import com.bdd.meatappapi.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRespository; 
	
	public List<Restaurant> findByName(String name) {
		return restaurantRespository.findByName(name);
	}
	
	

	public Optional<Restaurant> findById(String id) {
		return restaurantRespository.findById(id);
	}
	
	public List<Restaurant> findAllOrAllBy(String term) {
		if (term.equals("")) {
			return findAll();
		} else {
			return findAllBy(term);
		}		
	}		
	
	public List<Restaurant> findAll() {
		return restaurantRespository.findAll();
	}
	
	public List<Restaurant> findAllBy(String term) {
	    TextCriteria search = TextCriteria.forDefaultLanguage().caseSensitive(Boolean.FALSE).matching(term);
	    return restaurantRespository.findAllBy(search);
	}
}
