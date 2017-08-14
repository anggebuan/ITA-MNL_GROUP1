package com.oocl.escobjo.sw1;

import java.util.Scanner;


public class tryCatchFinally {

	
	public static void main(String[] args) {
		
	
		System.out.println("FACTORIAL\n");
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println();
		 int  j = 1;
		 
		 System.out.print(num+"! = ");
		  for(int i=1;i<=num;i++){
		    j = j*i;
		    
		   // System.out.print(i+"*");
		    System.out.print(i);
		    if(i<=num) {
		    System.out.print("*");}
		  }
		  
		  System.out.print("\n\t="+ j);
		
	}
}
