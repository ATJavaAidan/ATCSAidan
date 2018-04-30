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
					for(Booking z: x.getc1()) {
						g.write(z.getName()+" "+z.getTime()+" "+z.getResult()+" "+z.getBribe()+"\n");
					}
					for(Booking z: x.getc2()) {
						g.write(z.getName()+" "+z.getTime()+" "+z.getResult()+" "+z.getBribe()+"\n");
					}
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
				String line2;
				line2=br.readLine();
				String[] parts2 = line.split(" ");
				String a= parts2[0];
				Double b= Double.parseDouble(parts2[1]);
				String c= parts2[2];
				Double d= Double.parseDouble(parts2[3]);
				int c1b= Integer.parseInt(parts2[4]);
				int c2b= Integer.parseInt(parts2[5]);
				int c3b= Integer.parseInt(parts2[6]);

			}
			
			//while ((line = br.readLine()) != null) {
			//	String[] parts = line.split(" ");
			//	Trip d = new Trip(parts[0], Double.parseDouble(parts[1]), parts[2], Double.parseDouble(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
			//	trips.add(d);
			//}
			fr.close();
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
