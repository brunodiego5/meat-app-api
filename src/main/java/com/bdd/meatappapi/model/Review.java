package com.bdd.meatappapi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "review")
public class Review {
	
	@Id
	private String id;
	private String name;	
	private LocalDate date;
	private BigDecimal rating;
	private String comments;
	private String restaurantId;
	
	public Review() {}

	public Review(String name, LocalDate date, BigDecimal rating, String comments, String restaurantId) {
		this.name = name;
		this.date = date;
		this.rating = rating;
		this.comments = comments;
		this.restaurantId = restaurantId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "Review [name=" + name + ", id=" + id + ", date=" + date + ", rating=" + rating + ", comments="
				+ comments + ", restaurantId=" + restaurantId + "]";
	}

}
