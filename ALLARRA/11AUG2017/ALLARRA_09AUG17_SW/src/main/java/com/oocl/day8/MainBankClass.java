package com.oocl.day8;

public class MainBankClass {
	public static void main(String[] args) {
		userAccount user = new userAccount();
		CheckAccount CA = new CheckAccount(user.name, user.bal);
		double bal = CA.checkbalance();
		System.out.println("currrent balance : " + bal);
		
		bal = CA.deposits(400);
		
		CA.checkbalance();
		System.out.println("currrent balance : " + bal);
		try {
			bal = CA.withdrawal(100);
			System.out.println(bal+" is your new balance");
		} catch (BankExceptionThrowable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

// setup user account temporary
class userAccount {
	Double bal = 56.56;
	String name = "Pedro";
	String pin = "xxxx";
}