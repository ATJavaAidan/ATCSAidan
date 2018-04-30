import java.util.Random;
public class Booking {
	private String name;
	private int timeinpurgatory;
	private int result;
	private int quality;
	private double bribe;
	public Booking(String x, int t, int q, double b) {
		name=x;
		timeinpurgatory=t;
		result=q;
		bribe=b;
		quality=0;
	}
	
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
	
	public void assignClass() {
		if (result==3 && bribe>=1000) {
			quality=3;
		}
		else if (result==3 && bribe<1000) {
			Random rand = new Random();
			int x = rand.nextInt(10);
			if (x>6) {
				quality=3;
			}
			if (x<7) {
				quality=2;
			}
		}
		else if (result==2 && bribe>=1000000) {
			quality=3;
		}
		else if (result==2 && bribe<1000000 && bribe>500000) {
			Random rand = new Random();
			int x = rand.nextInt(10);
			if (x>7) {
				quality=3;
			}
			if (x<8) {
				quality=2;
			}
		}
		else if (result==2 && bribe<500000) {
			quality=2;
		}
		else if (result==1 && bribe>=10000000) {
			quality=3;
		}
		else if (result==1 && bribe>=1000000) {
			quality=2;
		}
		else {
			quality=1;
		}
	}
	
	public double assignImportance() {
		double importance = (timeinpurgatory^3)*(1/10)*Math.log10(timeinpurgatory);
		return importance;
	}
	
	
	/*
	public void assignTrip(double timeinpurgatory, ArrayList<Trip> trips){
		if(quality==3) {
			for(Trip x : trips) {
				if (x.C1RL()!=0) {
					
				}
			}
		}
		if(quality==2) {
			
		}
		if(quality==1) {
			
		}
		
	}
	*/
}

