import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
public class TripArray {
	private ArrayList<Trip> trips;
	public TripArray() {
		trips = new ArrayList <Trip>();
	}
	
	public void search(String h) {
		for(Trip k:trips) {
			for(Booking u : k.getc1()) {
				if(u.getName()==h) {
					System.out.println("This passenger was found! Look below for their trip info: ");
					k.info();
					break;
				}
			}
			for(Booking u : k.getc2()) {
				if(u.getName()==h) {
					System.out.println("This passenger was found! Look below for their trip info: ");
					k.info();
					break;
				}
			}
			for(Booking u : k.getc3()) {
				if(u.getName()==h) {
					System.out.println("This passenger was found! Look below for their trip info: ");
					k.info();
					break;
				}
			}
		}
		System.out.println("This passenger was not found. They are likely still alive or in purgatory.");
	}
	
	public void add(Trip t){
		trips.add(t);
	}
	
	public boolean remove(Trip t){
		if (trips.contains(t)) {
		    trips.remove(t);
		    return true;
		} else {
		    return false;
		}
	}
	
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
	
	public boolean contains(Trip t) {
		if (trips.contains(t)) {
			return true;
		}
		else {	
			return false;
		}
	}

	public int length() {
		return trips.size();
	}
	
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
	
	public void print() {
		for (Trip x: trips) {
			x.info(); 
		}
	}
	
	public ArrayList<Trip> getData(){
		return trips;
	}
	
	public void populate() {
		
	}
	
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
