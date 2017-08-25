package com.oocl.barisja2.hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "OrderBean.xml" });

		A cust = (A) context.getBean("orders");
		System.out.println(cust);

	}
}

class A {
	private Order order;

	public A(Order order) {
		this.order = order;
	}

	public void setPerson(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "A [order=" + order + "]";
	}
}

class Order {
	private String item;
	private String address;
	private int price;

	@Override
	public String toString() {
		return "Order [address=" + address + ", price=" + price + ", item=" + item + "]";
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
