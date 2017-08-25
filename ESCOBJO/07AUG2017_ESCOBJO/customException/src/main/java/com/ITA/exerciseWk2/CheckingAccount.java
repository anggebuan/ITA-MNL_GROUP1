package com.ITA.exerciseWk2;



public class CheckingAccount {

	double balance=0.0;

	
	public CheckingAccount(double bal) {
		balance = bal;
	}
	
	public double withdraw(double w)  throws InsufficientFundsException{
		balance =  balance - w;
		
		double max = 1000;

		
		if (balance < 0) {
			throw new InsufficientFundsException();
		} else {
		
			balance -= w;
			
//			if(w > max) {
//				System.out.println("exceed in 1000");
//				System.out.println(w);
//				w = w+50;
//			}
//			System.out.println("\nWithraw Amount " +w + " exceeds in 1000");
//			System.out.println("\nService Charge " +w + " exceeds in 1000");
			
		}
		return w;
	}
	public double deposit(double d) {
		return balance =  balance + d;
	}
	
	
	
	public void balance(double a ) {
		balance = a;
		System.out.println(a);
	}
}

	
	
	

