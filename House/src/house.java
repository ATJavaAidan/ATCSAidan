import java.awt.*;
import java.applet.*;
public class house extends Applet {
	public void init() {
		setSize(new Dimension(800,800));
	}
public void paint(Graphics g) {
	g.setColor(Color.black);




	g.drawRect(220,220,60,60);




	g.drawLine(220,250,280,250);




	g.drawLine(250,220,250,280);




	g.drawRect(420,220,60,60);




	g.drawLine(420,250,480,250);




	g.drawLine(450,220,450,280);




	g.drawRect(320,220,60,60);




	g.drawLine(320,250,380,250);




	g.drawLine(350,220,350,280);




	g.drawRect(220,320,60,60);




	g.drawLine(220,350,280,350);




	g.drawLine(250,320,250,380);




	g.drawRect(420,320,60,60);




	g.drawLine(420,350,480,350);




	g.drawLine(450,320,450,380);
	
	
	
	
	g.setColor(Color.black);




	g.drawRect(330,340,40,60);




	g.drawOval(340,350,20,40);




	g.fillOval(364,370,5,5);
	
	
	
	g.setColor(Color.red);




	g.drawLine(420,146,420,80);




	g.drawLine(420,80,450,80);




	g.drawLine(450,80,450,166);
	
	
	
	
	g.setColor(Color.red);




	g.drawLine(200,200,350,100);




	g.drawLine(500,200,350,100);




	g.drawLine(200,200,500,200);
	
	
	
	
	g.setColor(Color.blue);




	g.drawRect(200,200,300,100);




	g.drawRect(200,300,300,100);
	
	
	g.setColor(Color.red);
	
	
	g.drawOval(410, 40, 50, 50);
}
}

