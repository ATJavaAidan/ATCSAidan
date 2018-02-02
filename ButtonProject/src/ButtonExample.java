import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonExample extends JFrame implements ActionListener {	
  public ButtonExample() {                    	    
    this.setLayout(new FlowLayout());
 
    JButton rb = new JButton("pink");		   
    JButton gb = new JButton("black");
 
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
 
    if(str.equals("pink")) {
      this.getContentPane().setBackground(Color.pink);
    } 
    else if(str.equals("black")) {
      this.getContentPane().setBackground(Color.black);
    }  
    
  }
  
  public static void main(String args[]) {
    new ButtonExample();                       
  }			                   
}