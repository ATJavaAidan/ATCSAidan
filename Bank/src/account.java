
public class account {
	protected double balance=0.0;
	
	//Constructor
	public account(double initBalance) {
		balance= initBalance;
	}
	
	//Methods
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double cash) {
		if (cash>0) {
			balance+=cash;
			return true;
		}
		return false;

	}
	
	public boolean withdraw(double money) {
		if (money>0) {
			balance-=money;
			return true;
		}
		return false;
	}
}
