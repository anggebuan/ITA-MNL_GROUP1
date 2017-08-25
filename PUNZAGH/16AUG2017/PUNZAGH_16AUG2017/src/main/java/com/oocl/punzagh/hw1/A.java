package com.oocl.punzagh.hw1;

public class A {

	private Order order;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void showThatItem() {
		order.showItem();
	}
	
}
