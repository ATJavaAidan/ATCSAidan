import java.awt.*;
import java.applet.*;

public class trainTest extends Applet{
public void init() {
	setSize(new Dimension(1000,1000));
}	
	
public void paint(Graphics g) {
	g.drawRect(40, 250, 800, 10);
	train tc = new train(g, Color.magenta, 210, 200);	
	train tc1 = new train(g, Color.orange, 400, 200);
	train tc2 = new train(g, Color.blue, 590, 200);
	caboose cab = new caboose(g, Color.green, 780, 200);
	engine loc = new engine(g, Color.black, 20, 200);
	}
}		