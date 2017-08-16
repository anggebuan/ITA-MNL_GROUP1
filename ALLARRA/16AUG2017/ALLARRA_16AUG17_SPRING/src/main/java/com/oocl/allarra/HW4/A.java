package com.oocl.allarra.HW4;

public class A {
	Order O;

	public Order getO() {
		return O;
	}

	public void setO(Order o) {
		O = o;
	}
	public void getItemDetail() {
		System.out.println(O.getItem());
		System.out.println(O.getPrice());
		System.out.println(O.getAddress());
		
	}
}
