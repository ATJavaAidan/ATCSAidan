import java.util.ArrayList;
import java.util.Collections;
public class TestPharmaStore {
	public static void main(String args[]) {
		ArrayListOfDrugs illegals = new ArrayListOfDrugs();
		ArrayListOfDrugs legals = new ArrayListOfDrugs();
		Drug percocet = new Drug(000, 10.00, 100, "Percocet", 482, false);
		Drug cocaine = new Drug(001, 500.00, 100, "Cocaine", 95, false);
		Drug ketamine = new Drug(002, 100.00, 100, "Ketamine", 77, false);
		Drug LSD = new Drug(003, 20.00, 100, "LSD", 46, false);
		Drug ethanol = new Drug(000, 3.00, 100, "Ethanol", 11, true);
		Drug caffeine = new Drug(001, 1.00, 100, "Caffeine", 127, true);
		
		illegals.add(percocet);
		illegals.add(cocaine);
		illegals.add(ketamine);
		illegals.add(LSD);
		legals.add(ethanol);
		legals.add(caffeine);
		System.out.println(legals.contains(caffeine));
		legals.remove(caffeine);
		System.out.println(legals.contains(caffeine));
	}
}
