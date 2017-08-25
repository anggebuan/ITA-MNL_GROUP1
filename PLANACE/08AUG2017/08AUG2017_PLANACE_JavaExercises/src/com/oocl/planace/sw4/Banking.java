package com.oocl.planace.sw4;

public class Banking {

	static Account myAccount = null;

	public static void withdraw(double money) {
		try {
			myAccount.withdraw(money);
		} catch (InsufficientFundsException e) {
			e.showInsufficientMoney();
		}
	}

	public static void main(String[] args) {

		myAccount = new Account(10000);
		myAccount.deposit(1000);
		withdraw(10000);
		withdraw(100);
		withdraw(1001);

	}

}
