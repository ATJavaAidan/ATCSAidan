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
}
