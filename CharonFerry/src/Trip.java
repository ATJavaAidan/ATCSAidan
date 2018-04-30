import java.util.ArrayList;

public class Trip {
	private String Date;
	private double Time;
	private int C1seatsTotal;
	private int C2seatsTotal;
	private int C3seatsTotal;
	private String Location;
	private ArrayList<Booking> bookingsC1;
	private ArrayList<Booking> bookingsC2;
	private ArrayList<Booking> bookingsC3;
	public Trip(String d, double t, String L, ArrayList<Booking> b, ArrayList<Booking> f, ArrayList<Booking> g) {
		Date=d;
		Time=t;
		C1seatsTotal=10;
		C2seatsTotal=20;
		C3seatsTotal=40;
		Location=L;
		bookingsC1=b;
		bookingsC2=f;
		bookingsC3=g;
	}
	
	public String getDate(){
		return Date;
	}
	
	public double getTime(){
		return Time;
	}
	
	public ArrayList<Booking> getc1(){
		return bookingsC1;
	}
	
	public ArrayList<Booking> getc2(){
		return bookingsC2;
	}
	
	public ArrayList<Booking> getc3(){
		return bookingsC3;
	}
	
	public int getC1reservations(){
		return bookingsC1.size();
	}
	
	public int getC2reservations(){
		return bookingsC2.size();
	}
	
	public int getC3reservations(){
		return bookingsC3.size();
	}
	
	public String getLocation() {
		return Location;
	}
	
	public void updateDate(String x) {
		Date=x;
	}
	
	public void updateTime(double x) {
		Time=x;
	}
	
	
	public void updateLocation(String x) {
		Location=x;
	}
	
	public int reservations() {
		return bookingsC1.size()+bookingsC2.size()+bookingsC3.size();
	}
	
	public int C1RL() {
		return C1seatsTotal-bookingsC1.size();
	}
	
	public int C2RL() {
		return C2seatsTotal-bookingsC2.size();
	}
	
	
	public int C3RL() {
		return C3seatsTotal-bookingsC3.size();
	}
	
	public void addBooking(int x, Booking b) {
		if (x==0) {
			bookingsC1.add(b);
		}
		if (x==1) {
			bookingsC2.add(b);
		}
		if (x==2) {
			bookingsC3.add(b);
		}
		else {
			System.out.println("Invalid argument!");
		}
	}
	
	public void info() {
		String timeS = String.valueOf(Time);
		String C1seatsTotalS = String.valueOf(C1seatsTotal);
		String C2seatsTotalS = String.valueOf(C2seatsTotal);
		String C3seatsTotalS = String.valueOf(C3seatsTotal);
		String C1RLS = String.valueOf(C1RL());
		String C2RLS = String.valueOf(C2RL());
		String C3RLS = String.valueOf(C3RL());
		System.out.println("This trip leaves on "+Date+" at "+timeS+" with "+C1seatsTotalS+" first class seats("+C1RLS+" remaining)," + C2seatsTotalS+" business class seats("+C2RLS+" remaining), and " +C3seatsTotalS+" economy class seats("+C3RLS+" remaining).");
	}
	

	
}
