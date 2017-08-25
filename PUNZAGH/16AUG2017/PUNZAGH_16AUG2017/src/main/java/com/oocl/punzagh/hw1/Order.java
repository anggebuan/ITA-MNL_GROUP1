package com.oocl.punzagh.hw1;

public class Order {

	private String item;
	private float price;
	private String address;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showItem() {
		System.out.println(getItem());
		System.out.println(getPrice());
		System.out.println(getAddress());
	}
}
