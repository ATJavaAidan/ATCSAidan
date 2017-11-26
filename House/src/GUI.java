import java.awt.*;
import java.applet.*;
public class GUI extends house{
	public void init() {
		setSize(new Dimension(800,800));
	}
	public void paint (Graphics g) { 
        background(g); 
        shape(g);
        chimney(g);
        roofing(g);
        windows(g);
        door(g);
        aidan(g);
     
    }
	
	public void background(Graphics g) {
		setBackground (new Color(0,49,83)); 
        g.setColor (new Color (225,225,225)); 
        g.fillOval (15,35,170,55); 
        g.fillOval (25,25,160,50); 
        g.fillOval (700,50,170,55); 
        g.fillOval (710,40,160,50);    
        g.setColor (new Color(225,140,0));  
        g.fillOval (400,040,120,120);
	}
	
	public void shape(Graphics g) {
		g.setColor (new Color(255,127,80));
		g.fillRect(50, 500, 850, 300);
		g.fillRect(250, 300, 450, 300);
	}

	public void chimney(Graphics g) {
		g.setColor (new Color(139,0,139));
		g.fillRect(550, 150, 50, 120);
		g.setColor(new Color(250,128,114));
		g.fillRect(560, 120, 30, 30);
		g.setColor (new Color (225,225,225)); 
		g.fillOval(550, 100, 10, 10);
		g.fillOval(553, 90, 15, 15);
		g.fillOval(556, 80, 10, 10);
		g.fillOval(560, 100, 15, 15);
		g.fillOval(563, 93, 10, 10);
		g.fillOval(566, 90, 15, 15);
		g.fillOval(570, 100, 10, 10);
		g.fillOval(573, 87, 15, 15);
		g.fillOval(576, 77, 10, 10);
		g.fillOval(580, 100, 15, 15);
		g.fillOval(583, 90, 10, 10);
		g.fillOval(586, 87, 15, 15);
		g.fillOval(566, 90, 15, 15);
		g.fillOval(570, 80, 10, 10);
		g.fillOval(573, 70, 15, 15);
		g.fillOval(576, 60, 10, 10);
		g.fillOval(580, 90, 15, 15);
		g.fillOval(583, 75, 10, 10);
		g.fillOval(586, 70, 15, 15);
	}
	
	public void roofing(Graphics g) {
		g.setColor(new Color(200, 205, 50));  
		int[] x =  {50, 250, 250};
		int[] y = {500, 500, 300};
        g.fillPolygon(x,y,3); 
        
        int[] x2 =  {700, 700, 900};
		int[] y2 = {300, 500, 500};
        g.fillPolygon(x2,y2,3); 
        
        int[] x3 =  {250, 475, 700};
		int[] y3 = {300, 400, 300};
        g.fillPolygon(x3,y3,3); 
        
        g.setColor(new Color(138,7,7));
        int[] x4 =  {250, 475, 700};
		int[] y4 = {300, 200, 300};
        g.fillPolygon(x4,y4,3); 
	}
	
	public void windows(Graphics g) {
		g.setColor(new Color(0,0,0));
		g.fillOval(100,550,100,200);
		g.fillOval(250,550,100,200);
		g.fillOval(600,550,100,200);
		g.fillOval(750,550,100,200);
		g.fillOval(300,380,100,100);
		g.fillOval(550,380,100,100);
	}
	
	public void door(Graphics g) {
		g.setColor(new Color(0,249,255));
        g.fillRect(425, 550, 100, 220);
        g.setColor(new Color(0,255,56));
        g.drawRect(425, 550, 100, 220);
        g.fillOval(440, 670, 10, 10);
	}
	
	public void aidan(Graphics g) {
		g.setColor(new Color(225,225,225));
		g.fillOval(345,440,5,5);
		g.fillOval(355,440,5,5);
		g.fillOval(350,447,4,4);
		g.fillOval(347,453,2,2);
		g.fillOval(350,453,2,2);
		g.fillOval(353,453,2,2);
		g.fillOval(356,453,2,2);
		g.drawRect(343,435,20,25);
	}
	
}
