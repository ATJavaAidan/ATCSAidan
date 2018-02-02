import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button extends JFrame implements ActionListener {	
  public Button() {                    	    
    this.setLayout(new FlowLayout());
 
    JButton rb = new JButton("Red");		   
    JButton gb = new JButton("Green");
 
    rb.addActionListener(this);		    
    gb.addActionListener(this);
 
    this.add(rb);			            
    this.add(gb); 
 
    this.setTitle("Button in Action");
    this.setSize(300, 80);                      
    this.setVisible(true);			    
  }
			                   
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();	    
    System.out.println("You clicked " + str + " button");
 
    if(str.equals("Red")) {
      this.getContentPane().setBackground(Color.red);
    } 
    else if(str.equals("Green")) {
      this.getContentPane().setBackground(Color.green);
    }  
    
  }
  
  public static void main(String args[]) {
    new Button();                       
  }			                   
}