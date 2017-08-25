package com.oocl.planace.sw4;

public class InsufficientFundsException extends Throwable {
	double insufficientMoney = 0;
	double balance = 0;
	double serviceCharge = 0;

	public InsufficientFundsException(double money, double accountBalance, double ServiceCharge) {
		insufficientMoney = money;
		balance = accountBalance;
		serviceCharge = ServiceCharge;
	}

	public void showInsufficientMoney() {
		if(serviceCharge > 0) {
			System.out.println("Insufficient balance your balance is $" + balance + ", you lack: $" + insufficientMoney + ", and a service charge of $" + serviceCharge);
			System.out.println("-----------------------------------------------------");
		}
		else {
			System.out.println("Insufficient balance your balance is $" + balance + ", you lack: $" + insufficientMoney);
			System.out.println("-----------------------------------------------------");
		}
	}
}
