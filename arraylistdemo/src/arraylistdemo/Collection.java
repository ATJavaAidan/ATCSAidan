package arraylistdemo;

import java.util.ArrayList;

public class Collection {
	
	public static void main(String[] args) {
		student s = new student("Julie", "Elencweig", 2018);
		student m = new student("Will", "Panczner", 2019);
		student z = new student("Caleb", "Sciannella", 2020);
		
		ArrayList list = new ArrayList<student>();
		
		list.add(s);
		list.add(m);
		list.add(z);
		
		System.out.println(list);
		for(student st:list) {
			System.out.println(st.firstname);
			System.out.println(st.lastname);
			System.out.println(st.id);
		}
	}
	
}
