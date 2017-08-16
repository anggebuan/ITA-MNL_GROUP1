package com.oocl.barceja2.hw1;

public class ExampleBeanA {
	String abc;
	   public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	
	public void init() {
	      // do some initialization work
		   System.out.println("Bean Initializing...");
	   }
	public void destroy() {
		      // do some destruction work
		   System.out.println("Bean destroying...");
	}
}
