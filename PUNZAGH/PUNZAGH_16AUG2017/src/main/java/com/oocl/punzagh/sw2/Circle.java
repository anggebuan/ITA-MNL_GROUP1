package com.oocl.punzagh.sw2;

public class Circle extends Shape {
	
	Circle(){
		name = "Circle";
	}
	private Shape shape;
	

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
