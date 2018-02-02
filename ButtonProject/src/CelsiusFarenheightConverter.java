import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusFarenheightConverter extends JFrame{

	public CelsiusFarenheightConverter(){
			
		this.setLayout(new FlowLayout());
		
		JTextField tempTextField = new JTextField(5);
        JLabel celsiusLabel = new JLabel("Celcius");
        JButton convertButton = new JButton("Convert");
        
        JPanel celciusPanel = new JPanel();
        celciusPanel.add(tempTextField);
        celciusPanel.add(celsiusLabel);
        celciusPanel.add(convertButton);
        
        JLabel fahrenLabel = new JLabel("Farenheight");
      
        this.add(celciusPanel);
        this.add(fahrenLabel);
        
        this.setTitle("Celsius To Faren");
        this.setSize(300, 100);                      
        this.setVisible(true);	
	}
	
	public static void main(String args[]) {
	      new CelsiusFarenheightConverter();                       
	}	
}