import java.awt.*;
import java.applet.*;

public class testchampion extends Applet{
	public void init() {
		setSize(new Dimension(800,800));
	}
	
	public void paintBackground(Graphics g) {
		//This method paints a blue background with some grass, clouds,
		//a sun, and a helicopter. 
		
		g.setColor(new Color(112, 193, 239));
		g.fillRect(0, 0, 1400, 1400);
		g.setColor(new Color(56, 196, 103));
		g.fillRect(0, 550, 1400, 300);
		g.setColor (new Color (225,225,225)); 
        g.fillOval (15,35,170,55); 
        g.fillOval (25,25,160,50); 
        g.fillOval (550,50,170,55); 
        g.fillOval (560,40,160,50);    
        g.setColor (new Color(225,140,0));  
        g.fillOval (300,040,120,120);
        g.setColor(new Color(225,225,225));
        g.fillRect(55, 145, 5, 20);
        g.setColor(new Color(0,0,0));
        g.fillOval(20, 150, 80, 30);
        g.setColor(new Color(200,20,20));
        g.drawOval(10, 135, 95, 20);
        g.setColor(new Color(0,200,0));
        g.drawLine(25, 135, 90, 155);
        g.drawLine(25, 155, 90, 135);
        g.setColor(new Color(0,0,0));
        g.fillRect(80, 160, 60, 5);
        g.drawOval(135, 150, 20, 20);
        g.setColor(new Color(0,200,0));
        g.drawLine(135, 160, 155, 160);
        g.drawLine(145, 170, 145, 150);
	}
	
	public void paint(Graphics g) {
		//This is the main test method that initializes an applet,
		//paints the background, and paints the champions.
		
		init();
		paintBackground(g);
		champion a = new champion(350,160, g);
		archer x = new archer(0, 500, g);
		soldier z = new soldier(100,400, g);
		archer b = new archer(200, 500, g);
		soldier c = new soldier(300,400,g);
		archer d = new archer(400, 500, g);
		soldier e = new soldier(500,400,g);
		archer f = new archer(600, 500, g);
		soldier j = new soldier(700,400,g);

	}
}