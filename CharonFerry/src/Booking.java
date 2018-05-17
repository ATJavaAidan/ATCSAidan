import java.util.Random;
public class Booking {
	private String name;
	private int timeinpurgatory;
	private int result;
	private int quality;
	private double bribe;
	public Booking(String x, int t, int q, double b) {
		/*
		 This booking class contains all the information we need to have about a passenger
		 to make a reservation. Each "booking" is like a person.
		 */
		name=x;
		timeinpurgatory=t;
		result=q;
		bribe=b;
		quality=0;
	}
	
	//Get methods.
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return timeinpurgatory;
	}
	
	public int getResult() {
		return result;
	}
	
	public double getBribe() {
		return bribe;
	}
	
	
	//This is a complex method where we assign a user a class based on their personal info
	//and on some randomness.
	public int assignClass(int result, int bribe) {
		if (result==3 && bribe>=1000) {
			return 3;
		}
		else if (result==3 && bribe<1000) {
			Random rand = new Random();
			int x = rand.nextInt(10);
			if (x>6) {
				return 3;
			}
			if (x<7) {
				return 2;
			}
		}
		else if (result==2 && bribe>=1000000) {
			return 3;
		}
		else if (result==2 && bribe<1000000 && bribe>500000) {
			Random rand = new Random();
			int x = rand.nextInt(10);
			if (x>7) {
				return 3;
			}
			if (x<8) {
				return 2;
			}
		}
		else if (result==2 && bribe<500000) {
			return 2;
		}
		else if (result==1 && bribe>=10000000) {
			return 3;
		}
		else if (result==1 && bribe>=1000000) {
			return 2;
		}
		else {
			return 1;
		}
		return 1;
	}
	
	//We were going to use this method to make our booking system take into account
	//the time someone has been waiting, but we did not have enough time to implement it.
	public double assignImportance() {
		double importance = (timeinpurgatory^3)*(1/10)*Math.log10(timeinpurgatory);
		return importance;
	}
}

