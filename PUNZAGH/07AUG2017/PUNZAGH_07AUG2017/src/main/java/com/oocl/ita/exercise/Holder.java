package com.oocl.ita.exercise;

public class Holder<T> {
	private T a, b, c;
	public Holder(T a,T b, T c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	protected T getA() {
		return a;
	}
	protected void setA(T a) {
		this.a = a;
	}
	protected T getB() {
		return b;
	}
	protected void setB(T b) {
		this.b = b;
	}
	protected T getC() {
		return c;
	}
	protected void setC(T c) {
		this.c = c;
	}

}
