package com.oocl.planace.sw1.ExceptionHandling;

class TestClass{
	String x = "hello";

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
}

public class ExceptionHandlingExercise {
	
	public static void main(String[] args) {
		TestClass testObject = null;
		try {
			testObject.getX();
		}catch(Exception e) {
//			System.out.println("Hello");
//			e.printStackTrace();
			System.out.println("Caught exception: "+ e.toString());
		}
		
	}
}
