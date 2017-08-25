package com.oocl.day7.exception;

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
