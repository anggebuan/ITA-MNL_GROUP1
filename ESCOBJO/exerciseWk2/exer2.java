package com.ITA.exerciseWk2;


//functional programming -> recursion


public class exer2 {

	public static void main(String[] args) {

//		int quo =  0; int quo2 =  0;
//		int n = 9;
//		quo = 0 / n;
//		//quo2 = n/0;
//		System.out.println(quo);
		
		System.out.println(addFP(1,5));
		
	}
	
	public static int addFP(int num1 , int num2) {
	//int num1, num2;
	return num2 == 0 ? num1 : addFP(++num1, --num2);
}
}

	
	
	

