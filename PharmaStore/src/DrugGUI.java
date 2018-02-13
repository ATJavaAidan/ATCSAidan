import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DrugGUI extends JFrame implements ActionListener {	
	JTextField Barcode;
    JTextField Price;
    JTextField Stock;
    JTextField Name;
    JTextField ld50;
    JTextField Legality;
    JTextField remove;
    JTextField Item;
    ArrayListOfDrugs illegals;
    Drug percocet;
    Drug cocaine;
    Drug ketamine;
    Drug LSD;
	
	
  public DrugGUI() {        
	
	ArrayListOfDrugs illegals = new ArrayListOfDrugs();
	Drug percocet = new Drug(000, 10.00, 100, "Percocet", 482, false);
	Drug cocaine = new Drug(001, 500.00, 100, "Cocaine", 95, false);
	Drug ketamine = new Drug(002, 100.00, 100, "Ketamine", 77, false);
	Drug LSD = new Drug(003, 20.00, 100, "LSD", 46, false);
	illegals.add(percocet);
	illegals.add(cocaine);
	illegals.add(ketamine);
	illegals.add(LSD);
	
    this.setLayout(new FlowLayout());
    
    JButton add = new JButton("Add");	
    JTextField Barcode = new JTextField(20);
    JTextField Price = new JTextField(20);
    JTextField Stock = new JTextField(20);
    JTextField Name = new JTextField(20);
    JTextField ld50 = new JTextField(20);
    JTextField Legality = new JTextField(20);
    JButton remove = new JButton("Remove");
    JTextField Item = new JTextField(20);
    JButton save = new JButton("Save");
    JButton load = new JButton("Load");

 
    add.addActionListener(this);	
    Barcode.addActionListener(this);
    Price.addActionListener(this);
    Stock.addActionListener(this);
    Name.addActionListener(this);
    ld50.addActionListener(this);
    Legality.addActionListener(this);
    remove.addActionListener(this);
    Item.addActionListener(this);
    save.addActionListener(this);
    load.addActionListener(this);
    
 
    this.add(add);	
    this.add(Barcode);
    this.add(Price);
    this.add(Stock);
    this.add(Name);
    this.add(ld50);
    this.add(Legality);
    this.add(remove); 
    this.add(Item);
    this.add(save); 
    this.add(load); 
 
    this.setTitle("Drug Store Interface");
    this.setSize(500, 500);                      
    this.setVisible(true);			    
  }
			                   
  public void actionPerformed(ActionEvent e) {
    String str = e.getActionCommand();
    System.out.println("You clicked " + str + " button");
 
    if(str.equals("Add")) {
    //	(002, 100.00, 100, "Ketamine", 77, false)
    		int x = Integer.parseInt(Barcode.getText());
    		double y = Double.parseDouble(Price.getText());
    		int z = Integer.parseInt(Stock.getText());
    		String s = Name.getText();
    		double l = Double.parseDouble(ld50.getText());
    		boolean b = Boolean.parseBoolean(Legality.getText());
    		Drug q = new Drug(x, y, z, s, l, b);
    		illegals.add(q);
    } 
    else if(str.equals("Remove")) {
    		Drug r = illegals.find(remove.getText());
    		illegals.remove(r);
    }  
    
    else if(str.equals("Save")) {
    		illegals.fileWriter();
      }  
    
    else if(str.equals("Load")) {
    		illegals.fileReader();
    		
      }  
    
  }	                   
}