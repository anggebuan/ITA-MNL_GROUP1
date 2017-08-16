package com.oocl.allarra.SW2;

public class Circle extends Shapes{

	
	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("Draw "+shape);
	}


	
	


}
