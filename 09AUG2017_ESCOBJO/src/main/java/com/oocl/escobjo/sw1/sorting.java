package com.oocl.escobjo.sw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//ort

public class sorting {

	
	public static void main(String[] args) {
		
		sort(null);
	//	int[]num = new int[];
		
	}
	
	public static void sort(int arr[]) {
//		System.out.println("How many numbers you want to sort ?");
//		System.out.println("Enter a number: ");
//		Scanner input = new Scanner(System.in);
//		int num = arr.length;
//		
//		num = input.nextInt();
		
		
		  int i;
		  BufferedReader bf = new BufferedReader(
		  new InputStreamReader(System.in));
		  System.out.println("Enter number:");
		  int num = 0;
		try {
			num = Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Prime number: ");
		  for (i=1; i < num; i++ ){
		  int j;
		  for (j=2; j<i; j++){
		  int n = i%j;
		  if (n==0){
		  break;
		  }
		  }
		  if(i == j){
		  System.out.print("  "+i);
		  }
		  }
	}
}
