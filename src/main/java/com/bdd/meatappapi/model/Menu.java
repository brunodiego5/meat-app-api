package com.bdd.meatappapi.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "menu")
public class Menu {

	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	private String imagePath;
	private String restaurantId;
	
	public Menu() {}

	public Menu(String name, String description, BigDecimal price, String imagePath, String restaurantId) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.imagePath = imagePath;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", imagePath=" + imagePath + ", restaurantId=" + restaurantId + "]";
	}
	
	
	
	
	
}
