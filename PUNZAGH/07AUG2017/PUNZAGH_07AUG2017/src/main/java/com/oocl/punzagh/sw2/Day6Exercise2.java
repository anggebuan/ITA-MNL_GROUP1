package com.oocl.punzagh.sw2;

public class Day6Exercise2 {

	public static void main(String[] args) {
		reference ref = new reference();
		ref = null;
		try {
			ref.sayhello();
		} catch (Exception e) {
			System.out.println("Caught exception java.lang.NullPointerException");
		}	

	}
}

class reference{
	void sayhello() {
		System.out.println("Hello");
	}
}
