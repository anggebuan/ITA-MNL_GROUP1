package com.oocl.barceja2.sw3;

public class customException extends Throwable{
	private int amount = 0;
	
	customException(int a){
		this.amount = a;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		return "Desired withdrawal of " +amount+ " exceeds the current balance.";
	}
	


}
