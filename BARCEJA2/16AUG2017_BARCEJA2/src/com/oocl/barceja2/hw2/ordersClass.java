package com.oocl.barceja2.hw2;

public class ordersClass {
	String item;
	long price;
	String address;
	
	ordersClass(String i, long p, String a){
		this.item = i;
		this.price = p;
		this.address = a;
		
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
