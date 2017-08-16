package com.oocl.tengkh.sw1;

public class Triangle extends Shapes{
	
	Triangle() {
		name = "Triangle";
	}

	private Shapes shapes;

	public Shapes getShapes() {
		return shapes;
	}

	public void setShapes(Shapes shapes) {
		this.shapes = shapes;
	}
}
