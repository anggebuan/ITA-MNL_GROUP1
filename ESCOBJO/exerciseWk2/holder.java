package com.ITA.exerciseWk2;

public class holder<T> {

	private T A,B,C;
	public holder(T A, T B, T C) {
		this.A = A;
		this.B = B;
		this.C = C;
		//this.A = A;
	}
	public T getA() {
		return A;
	}
	public void setA(T a) {
		A = a;
	}
	public T getB() {
		return B;
	}
	public void setB(T b) {
		B = b;
	}
	public T getC() {
		return C;
	}
	public void setC(T c) {
		C = c;
	}

}
