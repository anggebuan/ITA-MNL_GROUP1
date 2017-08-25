package com.oocl.punzagh.sw2;

public class Drawing{
	private Shape shape;

	
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		this.shape.draw();
	}
	
}
