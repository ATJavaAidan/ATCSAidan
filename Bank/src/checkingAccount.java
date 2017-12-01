
public class checkingAccount extends account{
	public double overdraft;
	public double initBalance;
	public double balance;
	public checkingAccount(double initBalance, double o){
		super(initBalance);
		overdraft=o;
	}
	
	
	public boolean withdraw(double w) {
		super.withdraw(500);
		if (w>(getBalance()+overdraft)) {
			System.out.print("You are broke!");
			return false;
		}
		else {
			balance-=w;
			return true;
		}
	}

}
