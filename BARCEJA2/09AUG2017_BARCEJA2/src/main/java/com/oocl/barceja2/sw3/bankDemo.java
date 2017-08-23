package com.oocl.barceja2.sw3;

public class bankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingAccount ca = new checkingAccount(500);
		System.out.println("Deposit: 700");
		ca.deposit(700);
		
		System.out.println("Withdrawing: 1300");
		try{
			ca.desiredAmt(1300);
		}catch(customException e){
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("Deposit: 700");
		ca.deposit(700);
		

		
	}

}
