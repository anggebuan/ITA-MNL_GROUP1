package com.oocl.planace.sw3;

public class Account {
	double accountBalance = 0;
	double serviceCharge = 100;

	public String createAccount(double money) {
		if (money > 0) {
			accountBalance = money;
			System.out.println("Successfully created account!");
			System.out.println("Your starting account balance is $" + accountBalance);
			System.out.println("-----------------------------------------------------");
			return "Success";
		} else
			return "Fail";
	}

	public String deposit(double money) {
		if (money > 0) {
			System.out.println("Deposits $" + money + "....");
			accountBalance += money;
			System.out.println("Successfully deposit $" + money);
			System.out.println("Your account balance now is $" + accountBalance);
			System.out.println("-----------------------------------------------------");
			return "Success";
		} else
			return "Fail";
	}

	public String withdraw(double money) throws InsufficientFundsException {
		if (money > 0) {
			System.out.println("Withdraws $" + money + "....");
			if (accountBalance < money) {
				if (money > 1000) {
					double lack = money - accountBalance;
					throw new InsufficientFundsException(lack, accountBalance, serviceCharge);
				} else {
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
					System.out
							.println("Successfully withdrawed $" + money + " with service charge of $" + serviceCharge);
					System.out.println("Your account balance now is $" + accountBalance);
					System.out.println("-----------------------------------------------------");
				}
				return "Success";
			}
		}
		else
			return "Fail";
	}
}
