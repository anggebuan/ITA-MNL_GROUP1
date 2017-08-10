package com.oocl.planace.sw4;

public class Account {
	double accountBalance = 0;
	double serviceCharge = 100;

	public Account(double money) {
		accountBalance = money;
		System.out.println("Successfully created account!");
		System.out.println("Your starting account balance is $" + accountBalance);
		System.out.println("-----------------------------------------------------");
	}

	public void deposit(double money) {
		System.out.println("Deposits $" + money + "....");
		accountBalance += money;
		System.out.println("Successfully deposit $" + money);
		System.out.println("Your account balance now is $" + accountBalance);
		System.out.println("-----------------------------------------------------");
	}

	public void withdraw(double money) throws InsufficientFundsException {
		System.out.println("Withdraws $" + money + "....");
		if (accountBalance < money) {
			if(money > 1000) {
				double lack = money - accountBalance;
				throw new InsufficientFundsException(lack, accountBalance, serviceCharge);
			}
			else {
				double lack = money - accountBalance;
				throw new InsufficientFundsException(lack, accountBalance, 0);
			}
		} else {
			if (money <= 1000) {
				accountBalance -= money;
				System.out.println("Successfully withdrawed $" + money + " without service charge");
				System.out.println("Your account balance now is $" + accountBalance);
				System.out.println("-----------------------------------------------------");
			} else {
				accountBalance -= (money + serviceCharge);
				System.out.println("Successfully withdrawed $" + money + " with service charge of $" + serviceCharge);
				System.out.println("Your account balance now is $" + accountBalance);
				System.out.println("-----------------------------------------------------");
			}
		}
	}
}
