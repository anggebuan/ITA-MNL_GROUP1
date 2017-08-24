package com.oocl.escobjo.hw;

public class HelloSpring_init_dest {

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
}