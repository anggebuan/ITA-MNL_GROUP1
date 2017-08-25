package oocl.com.ITA;

public class MainBankClass {
	public static void main(String[] args) {
		userAccount user = new userAccount();
		CheckAccount CA = new CheckAccount(user.name, user.bal);
		CA.checkbalance();
		CA.deposits(400);
		CA.checkbalance();
		try {
			CA.withdrawal(100);
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