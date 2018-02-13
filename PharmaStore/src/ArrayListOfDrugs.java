import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListOfDrugs {
	private ArrayList<Drug> drugs;
	public ArrayListOfDrugs() {
		drugs = new ArrayList <Drug>();
	}
	
	public void add(Drug g){
		drugs.add(g);
	}
	
	public boolean remove(Drug g){
		if (drugs.contains(g)) {
		    drugs.remove(g);
		    return true;
		} else {
		    return false;
		}
	}
	
	
	
	public boolean contains(Drug g) {
		if (drugs.contains(g)) {
			return true;
		}
		else {
			return false;
		}
	}
	//
	// public void printArray() {
	//	for(i=0; i<drugs.length; i++) {
	//		System.out.println("This drug, "+name+ ", costs "+price+" and has an LD50 of "+ldfifty+".");
	//	}
	// }
	
	//
	//public void sort() {
	//	Collections.sort(drugs);
	//}
	//
	public int length() {
		return drugs.size();
	}
	
	public void fileWriter(){
		try {
			FileWriter g = new FileWriter("DrugLog.txt");
			for (Drug x: drugs) {
					g.write(x.getBarCode()+" " + x.getName()+" "+x.getStock()+" "+x.getPrice()+" "+x.getLdfifty()+" "+x.getLegality()+"\n");
			}
			g.close();
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
	}
	
	public void fileReader() {
		try {
			FileReader fr = new FileReader("DrugLog.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
				Drug d = new Drug(Integer.parseInt(parts[0]), Double.parseDouble(parts[3]), Integer.parseInt(parts[2]), parts[1], Double.parseDouble(parts[4]), Boolean.parseBoolean(parts[5]));
				drugs.add(d);
			}
			fr.close();
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
		
	}
	//001, 1.00, 100, "Caffeine", 127, true
	//3: code-LSD: name-100: stock-20.0: price-46.0: LD50-false: legality
	public void print() {
		for (Drug x: drugs) {
			x.info();
		}
	}
	
	public Drug find(String a) {
		for (Drug x: drugs) {
			if (x.getName()==a) {
				return x;
			}
		}
		Drug h = new Drug(00000, 0.00, 00, "Null", 00, false);
		return h;
	}
	
}
