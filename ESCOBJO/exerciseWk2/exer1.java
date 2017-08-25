package com.ITA.exerciseWk2;

public class exer1 {

	public static void main(String[] args) {
		holder<String> h = new holder<String>("A", "B", "C");
//		holder<Integer> h = new holder<Integer>(1, 2, 3);
//		holder<Boolean> h = new holder<Boolean>(true, false, null);
//		holder<String> h = new holder<String>("ABC","MNL","XYZ");

		
		System.out.println(h.getA());
		System.out.println(h.getB());
		System.out.println(h.getC());
		
	}
}


	
	
	

