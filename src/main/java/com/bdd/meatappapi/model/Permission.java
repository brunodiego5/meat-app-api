package com.bdd.meatappapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "permission")
public class Permission {
	
	@Id
	private String id;
	
	private String description;
	
	public Permission () {}

	public Permission(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", description=" + description + "]";
	}
	
	

}
