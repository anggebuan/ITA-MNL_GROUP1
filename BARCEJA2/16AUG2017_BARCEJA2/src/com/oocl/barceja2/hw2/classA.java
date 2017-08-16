package com.oocl.barceja2.hw2;

public class classA {
	ordersClass oc;

	classA(ordersClass c){
		this.oc = c;
	}
	public ordersClass getOc() {
		return oc;
	}

	public void setOc(ordersClass oc) {
		this.oc = oc;
	}
	
	public void displayItems() {
		System.out.println(oc.getItem());
		System.out.println(oc.getAddress());
		System.out.println(oc.getPrice());
	}
}
