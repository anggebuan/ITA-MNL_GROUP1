package com.oocl.punzagh.sw2;

public class Triangle extends Shape {
	
Triangle(){
	name = "Triangle";
}
private Shape shape;


public Shape getShape() {
	return shape;
}

public void setShape(Shape shape) {
	this.shape = shape;
}
}
