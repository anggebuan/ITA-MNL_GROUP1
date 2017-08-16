package com.oocl.allarra.HW5;

public class NetworkManagement {
	
	public void init() {
		System.out.println("StartNetworkConnection");		
	}

	protected void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DestroyConnection");
	}
	String message;
	public void getMessage() {
		System.out.println("Message " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
