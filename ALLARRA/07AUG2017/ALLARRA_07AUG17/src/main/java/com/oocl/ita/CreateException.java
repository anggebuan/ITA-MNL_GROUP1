package com.oocl.ita;

public class CreateException {
	
	public static void main(String[] args){
		createExc x = new createExc();
		x = null;
	try {
		x.add(7, 8);
	}catch( Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	

}
}
class createExc {
	public createExc() {
		System.out.println("wazza");
	}
	int x, y;
	public void add(int a, int b) {
		System.out.println("test : "+ (x+y));
	}
}

