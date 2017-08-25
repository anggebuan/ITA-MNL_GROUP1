package com.oocl.punzagh.sw2;

import java.util.Arrays;
import java.util.Scanner;

class Fibonacci implements Generator<Integer>, Runnable{

private int count;
private final int n;
public Fibonacci(int n) { this.n = n;}
public Integer next() { return fib(count++);}

private int fib(int n) {
	if(n < 2) return 1;
	return fib(n-2) +fib(n-1);
}
public void run(){
Integer[] sequence = new Integer[n];
for(int i=0;i < n ; i++) 
sequence[i] = next();
System.out.println("Seq. of "+ n + "; " + Arrays.toString(sequence));

}

}
public class E02_Fibonacci{

public static void main (String[] args){
	Scanner scan = new Scanner (System.in);
	System.out.print("Please enter a Number: ");
	int num = scan.nextInt(); 	
for(int i =1; i<=num; i++){
new Thread(new Fibonacci(i)).start();
}
}
}
