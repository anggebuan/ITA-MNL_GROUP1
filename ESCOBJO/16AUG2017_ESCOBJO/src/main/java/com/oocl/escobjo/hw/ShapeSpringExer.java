package com.oocl.escobjo.hw;

public class ShapeSpringExer {

	private String msg;

//	public static void main(String[] args) {
//
//	}

	public void setMessage(String msg) {
		this.msg = msg;
	}

	public void getMessage() {
		System.out.println("Your Message: " + msg);

	}
	
	public void init() {
		System.out.println("Bean is initializing: " + msg);

	}
	
	public void destroy() {
		System.out.println("Bean will be destroyed now: " + msg);

	}
}