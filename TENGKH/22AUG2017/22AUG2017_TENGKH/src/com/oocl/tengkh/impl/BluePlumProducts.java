package com.oocl.tengkh.impl;

import java.util.*;

import com.oocl.tengkh.src.BluePlum;

public class BluePlumProducts {

	List<String> cold = new ArrayList<>();
	List<String> hot = new ArrayList<>();

	public BluePlumProducts() {

		cold.add("Frappucino Mocha");
		cold.add("Frappucino Latte");
		cold.add("Frappucino Au Lait");
		cold.add("Ice Milk Cofee");
		cold.add("Frappucino Matcha");

		hot.add("Americano");
		hot.add("Hot Mocha");
		hot.add("Hot Latte");
		hot.add("Matcha Tea");
	}

	public List<String> getBluePlumProducts() {
		List<String> products = new ArrayList<>();
		products.add("Cold Beverages");
		products.add("Hot Beverages");
		return products;

	}

	public List<String> getBeverageList(String products) {
		switch (products.toLowerCase()) {
		case "cold":
			return cold;
		case "hot":
			return hot;

		}
		return cold;
	}
}
