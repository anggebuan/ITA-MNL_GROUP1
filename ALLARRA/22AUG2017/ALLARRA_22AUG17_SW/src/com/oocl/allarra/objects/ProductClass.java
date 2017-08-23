package com.oocl.allarra.objects;

public class ProductClass {

	String name;
	float price;
	int availableStock;

	public String get_name() {
		return name;
	}

	public void set_name(String _name) {
		this.name = _name;
	}

	public float get_price() {
		return price;
	}

	public void set_price(float _price) {
		this.price = _price;
	}

	public int get_availableStock() {
		return availableStock;
	}

	public void set_availableStock(int _availableStock) {
		this.availableStock = _availableStock;
	}

	public void refill(int refill) {
		this.availableStock+=refill;
	}
}
