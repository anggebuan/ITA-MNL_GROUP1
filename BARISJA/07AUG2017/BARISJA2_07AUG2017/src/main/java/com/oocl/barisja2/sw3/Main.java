package com.oocl.barisja2.sw3;

public class Main {

	public static void main(String[] args) {
		Candy candy = null;
		
		try {
			System.out.println(candy.flavor);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("No candy instantiated");
		}
		
	}
	
	
}

class Candy{
	String flavor;
	
}
