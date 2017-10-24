
public class testAccount {

	public static void main(String[] args) {
		
		account aidanAccount = new account(100.0);
		System.out.println(aidanAccount.getBalance());
		aidanAccount.deposit(50.0);
		aidanAccount.withdraw(147.0);
		System.out.println(aidanAccount.getBalance());
		
		account stellaAccount = new account(200.0);
		System.out.println(stellaAccount.getBalance());
		stellaAccount.deposit(20.0);
		stellaAccount.withdraw(100.0);
		System.out.println(stellaAccount.getBalance());
	}

}
