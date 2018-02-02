import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numberAddition extends JFrame implements ActionListener {	
	public numberAddition() {
		this.setLayout(new FlowLayout());
		this.setTitle("Button in Action");
		this.setSize(300, 80);                      
		this.setVisible(true);
	
		JPanel pan1= new JPanel(new GridLayout());
		JPanel pan2= new JPanel(new GridLayout());
		pan1.setLayout(new GridLayout(3,1));
		pan2.setLayout(new GridLayout(3,1));
		
		
		JTextField num1 = new JTextField("Enter Your Number!");
		num1.setSize(500,10);
		num1.setEditable(true);
		
		
		JButton add = new JButton("Add");		   
	    JButton exit = new JButton("Exit");
	    JButton clear = new JButton("Clear");
	 
	    add.addActionListener(this);		    
	    exit.addActionListener(this);
	    clear.addActionListener(this);
	 
	    JLabel label1 = new JLabel();
		label1.setText(" Result:");
	    	
	    this.add(pan1);
	    this.add(pan2);
	    pan2.add(add);			            
	    pan2.add(clear); 
	    pan2.add(exit); 
	    pan1.add(num1);
	    pan1.add(label1);

	    
		 
	 
	    this.setTitle("Calculation");
	    this.setSize(300, 80);                      
	    this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
	}

	public static void main(String args[]) {
	    new numberAddition();                       
	  }		
}
