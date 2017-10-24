
public class account {
	private static double balance=0.0;
	
	//Constructor
	public account(double initBalance) {
		balance= initBalance;
	}
	
	//Methods
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double cash) {
		if (cash>0)balance+=cash;

	}
	
	public void withdraw(double money) {
		if (money>0)balance-=money;
	}
}
