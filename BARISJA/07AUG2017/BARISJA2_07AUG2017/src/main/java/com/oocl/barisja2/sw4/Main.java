package com.oocl.barisja2.sw4;

public class Main {

	public static void main(String[] args) {

		try {
			
			int a, b;
			a = 1;
			b = 2;
			calc(a,b);
		} catch (except1 e) {
			System.out.println();
		}

	}


	public static int calc(int i, int j) throws except1 {
		return i+j;
	}

}

class Candy {

	String flavor, hardness;

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}

	public Candy(String flavor, String hardness) {
		this.flavor = flavor;
		this.hardness = hardness;
	}

}

class except1 extends Exception {
	
	public except1(String message) { super(message); }


}
