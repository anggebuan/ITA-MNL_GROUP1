package com.ITA.exerciseWk2;



@SuppressWarnings("serial")
public class InsufficientFundsException extends Throwable{

	public InsufficientFundsException(){
		
		
				//   System.out.println("\nInsufficientFundsException");
}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "InsufficientFundsException";
	}

	}
