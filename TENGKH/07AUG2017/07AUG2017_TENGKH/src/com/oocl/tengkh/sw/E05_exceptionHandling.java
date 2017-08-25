package com.oocl.tengkh.sw;

public class E05_exceptionHandling {
	public static void main(String[] args) {

		Except exception = new Except();
		try {
			exception.sample(null);
		} catch (java.lang.NullPointerException e) {
			System.out.println("Null Pointer Exception!");
		}

	}

}

class Except {
	String car;

	public void sample(Object obj) {
		// TODO Auto-generated method stub
		obj.equals("Khim");
	}
}
