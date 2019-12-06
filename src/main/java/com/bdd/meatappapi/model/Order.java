package com.bdd.meatappapi.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {

	@Id
	private String id;
	private String name;
	private String email;
	private String emailConfirmation;
	private String address;
	private int number;
	private String optionalAddress;
	private String paymentOption;
	private List<OrderItem> orderItems;
	
	public Order() {}

	public Order(String name, String email, String emailConfirmation, String address, int number,
			String optionalAddress, String paymentOption, List<OrderItem> orderItems) {
		this.name = name;
		this.email = email;
		this.emailConfirmation = emailConfirmation;
		this.address = address;
		this.number = number;
		this.optionalAddress = optionalAddress;
		this.paymentOption = paymentOption;
		this.orderItems = orderItems;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailConfirmation() {
		return emailConfirmation;
	}

	public void setEmailConfirmation(String emailConfirmation) {
		this.emailConfirmation = emailConfirmation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOptionalAddress() {
		return optionalAddress;
	}

	public void setOptionalAddress(String optionalAddress) {
		this.optionalAddress = optionalAddress;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", email=" + email + ", emailConfirmation=" + emailConfirmation
				+ ", address=" + address + ", number=" + number + ", optionalAddress=" + optionalAddress
				+ ", paymentOption=" + paymentOption + ", orderItems=" + orderItems + "]";
	}

	
	
	
	
	
	
	
}
