package com.oocl.barisja2.sw2;

public class Main {

	public static void main(String[] args) {
//		holder<String> h = new holder<String>("A", "B", "C");
//		holder<Integer> h = new holder<Integer>(1, 2, 3);
//		holder<Boolean> h = new holder<Boolean>(true, false, null);
		
		Stores s = new Stores("ABC","There");
		Stores s1 = new Stores("MNL","Here");
		Stores s2= new Stores("XYZ","Everywhere");
		
		
		holder<Stores> h = new holder<Stores>(s,s1 ,s2);
		
//		Stores stor = h.getA();
//		System.out.println(stor.getStoreName());
		
		Stores b = h.getA();
		Stores b1 = h.getB();
		Stores b2= h.getC();
		
//		System.out.println(h.getA());
//		System.out.println(h.getB());
//		System.out.println(h.getC());
		
		System.out.println(b.getStoreName());
		System.out.println(b1.getStoreName());
		System.out.println(b2.getStoreName());
	}
}


class holder<T> {
	private T a, b, c;

	public holder(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public T getC() {
		return c;
	}

	public void setC(T c) {
		this.c = c;
	}

}



class Stores{
	String storeName, address;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Stores(String storeName, String address) {
		this.storeName = storeName;
		this.address = address;
	}
	
	
	
}
