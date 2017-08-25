package com.oocl.barceja2.sw3;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.oocl.barceja.sw1.Operations;
import com.oocl.barceja2.pr2.ProductServiceImple;

@WebService
public class ProductCatalogue {
	
	ProductServiceImple  productService = new ProductServiceImple();
	
	
	public List<String> getProductCategories() {
		//return productService.getProductCategories();
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("FastFood");
		categories.add("FruitFood");
		return categories;
	}

	public List<String> gegProducts(String category) {
		return productService.getProducts(category);
	}
	
	
}
