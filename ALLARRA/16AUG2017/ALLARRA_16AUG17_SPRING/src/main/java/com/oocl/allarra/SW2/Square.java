package com.oocl.allarra.SW2;

public class Square extends Shapes{

	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void draw() {
		System.out.println("Draw " + shape);
	}

}
