package com.bdd.meatappapi.model;

import java.math.BigDecimal;

public class OrderItem {
	
	private BigDecimal quantity;
	private String menuId;
	
	public OrderItem() {}

	public OrderItem(BigDecimal quantity, String menuId) {
		this.quantity = quantity;
		this.menuId = menuId;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "OrdemItem [quantity=" + quantity + ", menuId=" + menuId + "]";
	};
	
	
	
	
	
	

}
