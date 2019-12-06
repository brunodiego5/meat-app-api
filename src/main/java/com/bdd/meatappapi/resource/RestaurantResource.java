package com.bdd.meatappapi.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.meatappapi.model.Menu;
import com.bdd.meatappapi.model.Restaurant;
import com.bdd.meatappapi.model.Review;
import com.bdd.meatappapi.service.MenuService;
import com.bdd.meatappapi.service.RestaurantService;
import com.bdd.meatappapi.service.ReviewService;


@RestController
@RequestMapping("/restaurants")
public class RestaurantResource {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private ReviewService reviewService;
	
	@Autowired
	private MenuService menuService;
	
	/*@GetMapping
	public List<Restaurant> findAll() {
		return restaurantService.findAll();
	}*/
	
	@PreAuthorize("hasAuthority('ROLE_USER') and #oauth2.hasScope('read')")
	@GetMapping("/{id}")
	public ResponseEntity<Restaurant> findById(@PathVariable String id) {
		 Optional<Restaurant> restaurant = restaurantService.findById(id);
		 return restaurant.isPresent() ? ResponseEntity.ok(restaurant.get()) : ResponseEntity.notFound().build();
	}
	
	@PreAuthorize("hasAuthority('ROLE_USER') and #oauth2.hasScope('read')")
	@GetMapping("/{restaurantId}/reviews")
	public List<Review> findReviewsByRestaurantId(@PathVariable String restaurantId) {
		return reviewService.findByRestaurantId(restaurantId);
	}
	
	@PreAuthorize("hasAuthority('ROLE_USER') and #oauth2.hasScope('read')") 
	@GetMapping("/{restaurantId}/menu")
	public List<Menu> findMenuByRestaurantId(@PathVariable String restaurantId) {
		return menuService.findByRestaurantId(restaurantId);
	}
	
	/*@PreAuthorize("#oauth2.hasScope('read')")*/
	@GetMapping
	public List<Restaurant> findAllOrAllBy(@RequestParam(required = false, defaultValue = "") String search) {
		return restaurantService.findAllOrAllBy(search);
	}

}
