import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class GUI extends JFrame implements ActionListener {	
	/*
	 This class is the test, or GUI, class for this project. In it we have all the 
	 panels we display, data entry points, and navigation features.
	 
	 */
	JPanel results;
	JPanel choice;
	JPanel userJudge;
	JPanel booking;
	JPanel satanSearch;
	JPanel searchResults;
	JPanel homeB;
	JTextField NameText;
	JTextField searchN;
	JComboBox sinDropDown;
	JTextField bribeText;
	JComboBox timeDropDown;
	JButton getJudged;
	JButton whoB1;
	JButton whoB2;
	JButton searchName;
	JButton ok;
	JButton home;
	TripArray ourA;
	ArrayList<LocalDate> totalDates;
	ArrayList<String> Locations;
	int classy;
	
	private static final long serialVersionUID = 1L;

	public GUI() {  
		
		//The next many lines deal with the creation of trips. We create 20 trips for dates using the inbuilt joda time java package.
		//Using this time package, we can auto generate a list of dates to use. For each date there is a morning and evening trip.
		//We also came up with six locations for the ferry to stop at, and have a random location selected for each trip, so things are not too predictable.
		//We sadly did not have time to implement location based trip finding into our program. If we had more time, this would be a fun feature.
		ourA = new TripArray();
		ArrayList<String> Locations = new ArrayList<String>();
		Locations.add("MourningFields");
		Locations.add("Tartarus");
		Locations.add("CerberusPit");
		Locations.add("AsphodelMeadows");
		Locations.add("SisyphusRock");
		Locations.add("OedipusCavern");
		String s = "2018-05-01";
		String e = "2018-05-30";
		LocalDate start = LocalDate.parse(s);
		LocalDate end = LocalDate.parse(e);
		ArrayList<LocalDate> totalDates = new ArrayList<>();
		while (!start.isAfter(end)) {
		    totalDates.add(start);
		    start = start.plusDays(1);
		}
		for (int i=0; i<10; i++) {
			String CT = totalDates.get(i).toString();
			double t1 = 9.00;
			double t2 = 5.00;
			Random rand = new Random();
			int r1 = rand.nextInt(6);
			int r2 = rand.nextInt(6);
			String l1 = Locations.get(r1);
			String l2 = Locations.get(r2);
			ArrayList<Booking> b = new ArrayList<Booking>();
			ArrayList<Booking> o = new ArrayList<Booking>();
			ArrayList<Booking> p = new ArrayList<Booking>();
			ArrayList<Booking> m = new ArrayList<Booking>();
			ArrayList<Booking> u = new ArrayList<Booking>();
			ArrayList<Booking> g = new ArrayList<Booking>();
			Trip one = new Trip(CT, t1, l1, b, o, p);
			Trip two = new Trip(CT, t2, l2, m, u, g);
			ourA.add(one);
			ourA.add(two);
			
		}
		
		this.setLayout(new FlowLayout());
		
		//User Panel #1 With this panel, the user selects whether they are a Sinner or Satan. When they click on an option,
		//They are sent to the respective panels for booking and patron searching.
		choice = new JPanel(new BorderLayout());  
		choice.setLayout(new BoxLayout(choice, BoxLayout.PAGE_AXIS));
		choice.setBackground(Color.RED);
		JLabel who = new JLabel("Are You A Sinner, or Satan?: ");	
		choice.add(who, BorderLayout.NORTH);
		whoB1 = new JButton("Sinner");
		whoB2 = new JButton("Satan");
		choice.add(whoB1, BorderLayout.SOUTH);
		choice.add(whoB2, BorderLayout.SOUTH);
		whoB1.addActionListener(this);
		whoB2.addActionListener(this);
		this.add(choice);
		choice.setVisible(true);
		
		
		
		//User Panel #2 (Judgement Panel): This panel takes in all the information from the user,
		//and makes it accessible to the program. The ok button signifies that all the info is in,
		//and then the results panel comes up.
		userJudge = new JPanel(new BorderLayout());  
		userJudge.setLayout(new BoxLayout(userJudge, BoxLayout.PAGE_AXIS));
		userJudge.setBackground(Color.RED);
		//Name input
		JLabel name = new JLabel("Name:");	
		userJudge.add(name, BorderLayout.NORTH);
		NameText = new JTextField(20);
		NameText.addActionListener(this);
		userJudge.add(NameText, BorderLayout.SOUTH);
		//Sin input
		JLabel sin = new JLabel("Sin committed:");
		userJudge.add(sin, BorderLayout.NORTH);
		String[] sinChoices = {"Robbery", "Murder", "Incest"};
		sinDropDown = new JComboBox<String>(sinChoices);
		sinDropDown.setVisible(true);
		sinDropDown.addActionListener(this);
		userJudge.add(sinDropDown);
		//bribe input
		JLabel bribe = new JLabel("Add Bribe:");
		userJudge.add(bribe, BorderLayout.NORTH);
		bribeText = new JTextField(20);
		bribeText.addActionListener(this);
		userJudge.add(bribeText, BorderLayout.SOUTH);
		//Time in purgatory input
		JLabel timeInP = new JLabel("Time spent in purgatory:");
		userJudge.add(timeInP, BorderLayout.NORTH);
		String[] time = {"Less than one year", "1-5 years", "5+ years"};
		timeDropDown = new JComboBox<String>(time);
		timeDropDown.setVisible(true);
		timeDropDown.addActionListener(this);
		userJudge.add(timeDropDown);
		//Compile inputs and move on button
		getJudged = new JButton("OK");
		userJudge.add(getJudged, BorderLayout.SOUTH);
		getJudged.addActionListener(this);
		this.add(userJudge);
		userJudge.setVisible(false);
		
		//This is the search panel for satan, where he can put in a name to search.
		satanSearch = new JPanel(new BorderLayout());  
		satanSearch.setLayout(new BoxLayout(satanSearch, BoxLayout.PAGE_AXIS));
		satanSearch.setBackground(Color.RED);
		JLabel search = new JLabel("Name:");
		satanSearch.add(search, BorderLayout.WEST);
		searchN = new JTextField(20);
		searchN.addActionListener(this);
		satanSearch.add(searchN, BorderLayout.WEST);
		searchName = new JButton("Search");
		searchName.addActionListener(this);
		satanSearch.add(searchName, BorderLayout.SOUTH);
		this.add(satanSearch);
		satanSearch.setVisible(false);

		
		//Displays the results of the trip search, so the user knows which trip they are going on.
		results = new JPanel(new BorderLayout());
		results.setLayout(new BoxLayout(results, BoxLayout.PAGE_AXIS));
		results.setBackground(Color.RED);
		JLabel tripInfo = new JLabel("Thank you for booking a trip to hell. Check Below for more specifics!");
		results.add(tripInfo, BorderLayout.EAST);
		ok = new JButton("Home");
		ok.addActionListener(this);
		results.add(ok, BorderLayout.WEST);
		this.add(results);
		results.setVisible(false);
		
		//This panel displays the results of Satan's search.
		searchResults = new JPanel(new BorderLayout());
		searchResults.setLayout(new BoxLayout(searchResults, BoxLayout.PAGE_AXIS));
		searchResults.setBackground(Color.BLUE);
		JLabel SRText = new JLabel("You used the admin search function. Look below for results: ");
		searchResults.add(SRText, BorderLayout.WEST);
		home = new JButton("Home");
		home.addActionListener(this);
		searchResults.add(home, BorderLayout.EAST);
		this.add(searchResults);
		searchResults.setVisible(false);

		this.setTitle("Trip to Hell");
		this.setSize(700, 700); 
		this.setLocation(50, 50);
		this.setVisible(true);		    
	}


	public void actionPerformed(ActionEvent e) {
	    String str = e.getActionCommand();
	    System.out.println("You clicked " + str + " button");
	    if(str=="Satan") {
	    		//Pops up the Satan search panel and hides the choice panel
	    		choice.setVisible(false);
			satanSearch.setVisible(true)	;	
	    }
	    
	    if(str=="Search") {
	    		//Runs the search function in the TripArray class on the name Satan inputs. 
	    		//Hides the search panel and shows the Satan result panel. 
	    		//Displays the results of the search
    			satanSearch.setVisible(false);	
    			String sname = searchN.getText();
    			String var1=ourA.search(sname);
    			JLabel infoj = new JLabel(var1);
	    		searchResults.add(infoj, BorderLayout.EAST);
    			searchResults.setVisible(true);
    			
    			
	    }
	    
	    if(str=="Sinner") {
	    	//Takes the user to the information input panel and hides the search panel.
			choice.setVisible(false)	;
	    		userJudge.setVisible(true);

	    }
	    
	    if(str=="OKAY") {
	    	//Brings the user back to the home screen so someone else can make a booking.
			choice.setVisible(true);
	    		results.setVisible(false);
	    }
	    
	    if(str=="Home") {
	    	//Brings Satan back to the home screen.

			choice.setVisible(true);
	    		searchResults.setVisible(false);
	    		results.setVisible(false);
	    }
	    
	    if(str=="OK") {
	    	//This condition takes in all the data entered, and if the data is sufficient,
	    	//a new booking is made. This booking is then assigned a trip using the functions in the other classes.
	    	//once all that backend has happened, the user is shown a results page where they can review their info,
	    	//look at their trip, and go back to the home page.
	    	if(!NameText.getText().equals("") || !bribeText.getText().equals("")) {
	    		System.out.println(NameText.getText());
	    		String name = NameText.getText();
	    		
	    		int r = 0;
	    		int t = 0;
	    		if (sinDropDown.getSelectedIndex()==0) {
	    			r = 3;
	    		}
	    		else if (sinDropDown.getSelectedIndex()==1) {
	    			r = 2;
	    		}
	    		else if (sinDropDown.getSelectedIndex()==2) {
	    			r = 1;
	    		}
	    		
	    		//if()
	    		int b = Integer.parseInt(bribeText.getText());
	    		
	    		if (timeDropDown.getSelectedIndex()==0) {
	    			t = 1;
	    		}
	    		else if (timeDropDown.getSelectedIndex()==1) {
	    			t = 2;
	    		}
	    		else if (timeDropDown.getSelectedIndex()==2) {
	    			t = 3;
	    		}
	    		System.out.println("Your name is "+NameText.getText()+", the severity of your crime is "+r+", your waiting index is "+t+", and you bribed me with "+b+" dollars.");
	    		Booking z = new Booking(name, r, b, t);
	    		classy = z.assignClass(r, b);
	    		ourA.findT(classy).addBooking(classy, z);
	    		ourA.findT(classy).info();
	    		ourA.fileWriter();
	    		String infoP = "Your name is "+NameText.getText()+", the severity of your crime is "+r+", your waiting index is "+t+"\n"+", and you bribed me with "+b+" dollars.";
	    		String tI = ourA.findT(classy).infoS();

	    		userJudge.setVisible(false);
	    		
	    		JLabel nameOfPas = new JLabel("Your Info: ");
	    		results.add(nameOfPas, BorderLayout.EAST);
	    
	    		JLabel info = new JLabel(infoP);
	    		results.add(info, BorderLayout.EAST);
	    		
	    		JLabel timeOfTrip = new JLabel("Trip Information: ");
	    		results.add(timeOfTrip, BorderLayout.EAST);
	    		
	    		JLabel infoj = new JLabel(tI);
	    		results.add(infoj, BorderLayout.EAST);
	    		
	    		results.setVisible(true);
	    	}
	    	else {
	    		System.out.println("You have not entered enough information!");
	    	}
	    }
	  }

	public static void main(String args[]) {
		new GUI();                     
	}
	
}
