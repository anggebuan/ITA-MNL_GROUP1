package com.oocl.planace.sw1.SpringExercise;

public class Drawing {
	private Shape shape;

	public void getShape() {
		this.shape.draw();
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
