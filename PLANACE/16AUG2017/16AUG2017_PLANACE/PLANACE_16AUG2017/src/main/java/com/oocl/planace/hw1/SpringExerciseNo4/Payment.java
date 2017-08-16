package com.oocl.planace.hw1.SpringExerciseNo4;

public class Payment {
	Order order;

	public void setOrder(Order order) {
		this.order = order;
	}

	public void payOrder() {
		System.out.println("The order is " + order.getQty() + "pcs of " + order.getItem() + " with price of " + order.getPrice());
		System.out.println("Order Paid!");
	}
}
