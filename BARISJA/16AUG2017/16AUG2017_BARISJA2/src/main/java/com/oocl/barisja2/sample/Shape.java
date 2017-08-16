package com.oocl.barisja2.sample;

public class Shape {
	public static void main(String[] args) {

		new Drawing(new Triangle()).drawShape();
		new Drawing(new Square()).drawShape();

	}

}

class Shapes{
	public void draw() {

		System.out.println("Draw");

	}
}
class Triangle extends Shapes {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Triangle");
	}

}
class Square extends Shapes {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Square");
	}

}
class Drawing {

	Shapes shape;

	public Drawing(Shapes shape) {

		this.shape = shape;

	}

	public void drawShape() {
		this.shape.draw();
	}

}
