package com.oocl.tengkh.sw1;

public class Drawing {

	private Shapes shapes;

	public Shapes Shapes() {
		return shapes;
	}

	public void setShapes(Shapes shapes) {
		this.shapes = shapes;
	}
	
	public void drawShape() {
		this.shapes.draw();
	}
	
	
}
