package com.oocl.barisja2.sw1;

public class InsufficientFundsException extends Throwable{
	
	private double amount;
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}
	@Override
	public String getMessage() {
		String msg = "Insuficient funds! You are "+ Math.abs(amount) + " short";
		
		return msg;
	}
	

}
