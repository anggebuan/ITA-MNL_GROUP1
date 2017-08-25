package com.oocl.allarra.impl;

import java.util.ArrayList;

import com.oocl.allarra.objects.ProductClass;

public class SnacksImpl{
	ArrayList<ProductClass> snackList;

	public SnacksImpl() {
	
		snackList = new ArrayList<ProductClass>();
		String[] name = {"Lays", "Pringles", "Oreo"};
		int[] currentStock = {5,6,7};
		float[]  price = {(float) 7.90,(float)85,(float)10};
		for(int x = 0; x< name.length; x++) {
			ProductClass product = new ProductClass();
			product.set_name(name[x]);
			product.set_availableStock(currentStock[x]);
			product.set_price(price[x]);
			snackList.add(product);
		}
	}
	public SnacksImpl(ArrayList<ProductClass> _snackList) {
		this.snackList = _snackList;
	}
	public ArrayList<ProductClass> getSnackList() {
		return snackList;
	}
	
	public ProductClass Getsnack(String _snack) {
		ProductClass productSnack = new ProductClass();
		for(ProductClass snack:snackList) {
			if(_snack.equals(snack.get_name())) {
				productSnack = snack;
			}
		}
		
		
		return productSnack;
		
	}
	
	

}
