package com.oocl.tengkh.samples;

public class HelloSpringInitDestroy {

	private String message;
	
	private void init() {
		System.out.println("Intializing spring beans: message.....");
		
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void getMessage() {
		System.out.println(message);
	}
	

	
	public void destroy() {
		System.out.println("Destroying spring beans: message.....");

	}
}