package com.oocl.ita;

import java.util.ArrayList;

public class Generics{
	
	
 public static void main(String[] args) {
	GenClass<Boolean> tryGenerics = new GenClass<Boolean>(true, "Naysu", 3);
	
	System.out.println("A = " + tryGenerics.getA());
	System.out.println("B = " + tryGenerics.getB());
	System.out.println("C = " + tryGenerics.getC());

	
}
}
class GenClass<T>
{
	T A;
	String B;
	int C;
	public GenClass(T a, String b, int c){
		this.A = a;
		this.B = b;
		this.C = c;
	}
	public T getA() {
		return A;
	}
	public void setA(T a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public int getC() {
		return C;
	}
	public void setC(int c) {
		C = c;
	}
}







