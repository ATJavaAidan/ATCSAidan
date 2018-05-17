import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
public class TripArray {
	/*
	 This class is our container class, and is an array-list of trips with various specific methods.
	 Thus, the primary object is the trip array made by the constructor.
	 */
	private ArrayList<Trip> trips;
	public TripArray() {
		trips = new ArrayList <Trip>();
	}
	
	//This is our search method. It takes in a name and finds which trip that person is on.
	//It then returns information about that trip.
	//If the person is not in the system, an alternate explanatory message is displayed.
	public String search(String h) {
		for(Trip k:trips) {
			for(Booking u : k.getc1()) {
				if(u.getName()==h) {
					return "This passenger was found! Their trip info is: "+k.infoS();
				}
			}
			for(Booking u : k.getc2()) {
				if(u.getName()==h) {
					return "This passenger was found! Their trip info is: "+k.infoS();
				}
			}
			for(Booking u : k.getc3()) {
				if(u.getName()==h) {
					return "This passenger was found! Their trip info is: "+k.infoS();
				}
			}
		}
		return ("This passenger was not found. They are likely still alive or in purgatory.");
	}
	
	//Very simple add method for the array-list.
	public void add(Trip t){
		trips.add(t);
	}
	
	//Very simple remove method.
	public boolean remove(Trip t){
		if (trips.contains(t)) {
		    trips.remove(t);
		    return true;
		} else {
		    return false;
		}
	}
	
	//This method finds a trip based on the class a user was assigned. 
	//The algorithm is very simple, as the method scans through each trip in the array list until one with a spot in the class is found.
	//If no trip exists (AKA we are out of trips with that class), we would ideally add
	//another trip to the trip array. Sadly, we ran out of time, but would love to add this feature.
	//As of now, it returns a "bogus" trip if there are no trips with the specific class c.
	public Trip findT(int c) {
		for (Trip x: trips) {
			if (c==3) {
				if (x.getC1reservations()<10) {
					return x;
				}
			}
			if (c==2) {
				if (x.getC2reservations()<20) {
					return x;
				} 
			}
			if(c==1) {
				if (x.getC3reservations()<40) {
					return x;
				}
				
			}
		}
		ArrayList<Booking> z = new ArrayList<Booking>();
		ArrayList<Booking> g = new ArrayList<Booking>();
		ArrayList<Booking> u = new ArrayList<Booking>();
		Trip h = new Trip("Never", 00.00, "Nowhere", z, g, u);
		return h;
	}
	
	//Scans the array-list for a specific trip. We did not have to use this method,
	//but would in the future in conjunction with the above add trip potential.
	public boolean contains(Trip t) {
		if (trips.contains(t)) {
			return true;
		}
		else {	
			return false;
		}
	}
	
	//Returns the number of trips in the array-list.
	public int length() {
		return trips.size();
	}
	
	//Writes to a file. Was very complicated to create method. We first print the number of total trips at the top of the file.
	//On the next line, we write the general data about the trip and then three numbers, which tell us the number of bookings stored in each class array list (economy, business, or first).
	//Then the bookings follow in class order.
	public void fileWriter(){
		try {
			FileWriter g = new FileWriter("TripLog.txt");
			g.write (trips.size()+"\n");
			for (Trip x: trips) {
					g.write(x.getDate()+" "+x.getTime()+" "+x.getLocation()+" "+x.getC1reservations()+" "+x.getC2reservations()+" "+x.getC3reservations()+"\n");
					//g.write(x.getC1reservations()+"\n");
					for(Booking z: x.getc1()) {
						g.write(z.getName()+" "+z.getTime()+" "+z.getResult()+" "+z.getBribe()+"\n");
					}
					//g.write(x.getC2reservations()+"\n");
					for(Booking z: x.getc2()) {
						g.write(z.getName()+" "+z.getTime()+" "+z.getResult()+" "+z.getBribe()+"\n");
					}
					//g.write(x.getC3reservations()+"\n");
					for(Booking z: x.getc3()) {
						g.write(z.getName()+" "+z.getTime()+" "+z.getResult()+" "+z.getBribe()+"\n");
					}

			}
			g.close();
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
	}
	
	//Reads file of specific format made by write file.
	public void fileReader() {
		try {
			FileReader fr = new FileReader("TripLog.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			line=br.readLine();
			String[] parts = line.split(" ");
			int iterations=Integer.parseInt(parts[0]);
			for(int i=0; i<iterations; i++) {
				line=br.readLine();
				String[] parts2 = line.split(" ");
				String a= parts2[0];
				Double b= Double.parseDouble(parts2[1]);
				String c= parts2[2];
				int c1b= Integer.parseInt(parts2[3]);
				int c2b= Integer.parseInt(parts2[4]);
				int c3b= Integer.parseInt(parts2[5]);
				ArrayList<Booking> first = new ArrayList<Booking>();
				for(int z=c1b; z<iterations; z++) {
					line=br.readLine();
					String[] parts3 = line.split(" ");
					String p= parts3[0];
					Integer y= Integer.parseInt(parts3[1]);
					Integer r= Integer.parseInt(parts3[2]);
					Double o =Double.parseDouble(parts3[3]);
					Booking bn = new Booking(p, y, r, o);
					first.add(bn);
				}
				ArrayList<Booking> second = new ArrayList<Booking>();
				for(int z=c2b; z<iterations; z++) {
					line=br.readLine();
					String[] parts3 = line.split(" ");
					String p= parts3[0];
					Integer y= Integer.parseInt(parts3[1]);
					Integer r= Integer.parseInt(parts3[2]);
					Double o =Double.parseDouble(parts3[3]);
					Booking bn = new Booking(p, y, r, o);
					second.add(bn);
				}
				ArrayList<Booking> third = new ArrayList<Booking>();
				for(int z=c3b; z<iterations; z++) {
					line=br.readLine();
					String[] parts3 = line.split(" ");
					String p= parts3[0];
					Integer y= Integer.parseInt(parts3[1]);
					Integer r= Integer.parseInt(parts3[2]);
					Double o =Double.parseDouble(parts3[3]);
					Booking bn = new Booking(p, y, r, o);
					third.add(bn);
				}
				Trip update=new Trip(a, b, c, first, second, third);
				trips.add(update);
			}
			br.close();
			
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
	}
	
	//Prints out all trips and rudimentary data
	public void print() {
		for (Trip x: trips) {
			x.info(); 
		}
	}
	
	//Returns the array list
	public ArrayList<Trip> getData(){
		return trips;
	}
	
	//Finds a trip in the array-list of a specific date and time.
	//If no trip found, returns "bogus" trip.
	public Trip find(String a, double t) {
		for (Trip x: trips) {
			if (x.getDate()==a) { 
				if(x.getTime()==t) {
					return x;
				}
			}
		}
		ArrayList<Booking> z = new ArrayList<Booking>();
		ArrayList<Booking> g = new ArrayList<Booking>();
		ArrayList<Booking> u = new ArrayList<Booking>();
		Trip h = new Trip("Never", 00.00, "Nowhere", z, g, u);
		return h;
	}
	
}
