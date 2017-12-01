import java.awt.*;
public class train{
	private Color carColor;
	public int xPos;
	public int yPos;
	public train(Graphics g, Color cc, int x, int y) {	// sets variables for parent class, the rectangle and black wheels 
		carColor = cc;
		xPos = x;
		yPos = y;
		g.setColor(carColor);
		g.fillRect(xPos, yPos, 150, 100);
		g.setColor(Color.black);	//sets wheel color for all cars 
		g.fillOval(xPos + 10,  yPos + 75,  50,  50);
		g.fillOval(xPos + 90,  yPos + 75,  50,  50);
	} 
}