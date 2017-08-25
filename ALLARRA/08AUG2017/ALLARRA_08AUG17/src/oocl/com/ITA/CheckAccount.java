package oocl.com.ITA;

public class CheckAccount {
	private String name;
	private double balance;

	public CheckAccount(String name, double balance) {
		this.name = name;
		System.out.println("Welcome :" + name);
		this.balance = balance;
	}

	public void checkbalance() {
	
	}

	public void deposits(double x) {
		balance += x;
		System.out.println(x + " Amount has been succesfully deposited in your account");
	}

	public void withdrawal(double x) throws BankExceptionThrowable {
		double amount = balance - x;
		if (amount < 0) {
			System.out.print("Your balance is " + balance);
			throw new BankExceptionThrowable(x);
		}
		else
			balance = amount;

		System.out.println("Successful withdraw transaction");
	}

}
