
public class customer {
	private String first;
	private String last;
	private account acct;
	
	public customer(String f, String l, account a) {
		first= f;
		last= l;
		acct= a;
	}
	public String getFirstName() {
		return first;
	}
	
	public String getLastName() {
		return last;
	}
	
	public account getAccount() {
		return acct;
	}
}
