import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
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
	JTextField NameText;
	JComboBox sinDropDown;
	JTextField bribeText;
	JComboBox timeDropDown;
	JButton getJudged;
	TripArray ourA;
	ArrayList<LocalDate> totalDates;
	ArrayList<String> Locations;
	int classy;
	
	private static final long serialVersionUID = 1L;

	public GUI() {  
		ourA = new TripArray();
		ArrayList<String> Locations = new ArrayList<String>();
		Locations.add("Mourning Fields");
		Locations.add("Tartarus");
		Locations.add("Cerberus Pit");
		Locations.add("Asphodel Meadows");
		Locations.add("Sisyphus Rock");
		Locations.add("Oedipus Cavern");
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
		
		//User Panel #1 (Judgement Panel):
		JPanel userJudge = new JPanel(new BorderLayout());  
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
		
		
		//booking panel
		JPanel booking = new JPanel(new BorderLayout());   
		booking.setLayout(new BoxLayout(booking, BoxLayout.PAGE_AXIS));
		booking.setBackground(Color.RED);
		JLabel satisfied = new JLabel("Are you satsfied?");
		booking.add(satisfied, BorderLayout.SOUTH);
		JButton yes = new JButton("Yes");
		booking.add(yes, BorderLayout.SOUTH);
		this.add(booking);
		yes.addActionListener(this);

		//SATAN'S PANEL
		//search panel 
/*		
		JPanel satanSearch = new JPanel(new BorderLayout());  
		satanSearch.setLayout(new BoxLayout(satanSearch, BoxLayout.PAGE_AXIS));
		satanSearch.setBackground(Color.BLUE);
		JLabel search = new JLabel("Name:");
		booking.add(search, BorderLayout.SOUTH);
		JTextField search_ = new JTextField(20);
		userJudge.add(search_, BorderLayout.SOUTH);

		JPanel results = new JPanel(new BorderLayout());
		results.setLayout(new BoxLayout(results, BoxLayout.PAGE_AXIS));
		results.setBackground(Color.BLUE);
*/

		this.setTitle("Trip to Hell");
		this.setSize(700, 700); 
		this.setLocation(50, 50);
		this.setVisible(true);		    
	}

	public void actionPerformed(ActionEvent e) {
	    String str = e.getActionCommand();
	    System.out.println("You clicked " + str + " button");
	    
	    if(str=="OK") {
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
