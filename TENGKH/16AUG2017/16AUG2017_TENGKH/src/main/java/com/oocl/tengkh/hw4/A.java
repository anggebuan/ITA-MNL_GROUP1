 package com.oocl.tengkh.hw4;

public class A {
	public Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void showAll() {
		order.getItem();
		order.getPrice();
		order.getAddress();
	}
}
