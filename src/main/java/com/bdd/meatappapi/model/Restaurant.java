package com.bdd.meatappapi.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurant")
public class Restaurant {
	
	@Id
	private String id;
	
	@TextIndexed
	private String name;
	
	@TextIndexed
	private String category;
	
	@TextIndexed
	private String deliveryEstimate;
	
	private BigDecimal rating;
	
	@TextIndexed
	private String imagePath;
	
	@TextIndexed
	private String about;
	
	@TextIndexed
	private String hours;
	
	public Restaurant () {}

	public Restaurant(String name, String category, String deliveryEstimate, BigDecimal rating, String imagePath,
			String about, String hours) {
		this.name = name;
		this.category = category;
		this.deliveryEstimate = deliveryEstimate;
		this.rating = rating;
		this.imagePath = imagePath;
		this.about = about;
		this.hours = hours;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDeliveryEstimate() {
		return deliveryEstimate;
	}

	public void setDeliveryEstimate(String deliveryEstimate) {
		this.deliveryEstimate = deliveryEstimate;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", category=" + category + ", deliveryEstimate="
				+ deliveryEstimate + ", rating=" + rating + ", imagePath=" + imagePath + ", about=" + about + ", hours="
				+ hours + "]";
	}
	
	
	
	

}
