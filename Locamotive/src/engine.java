import java.awt.Color;
import java.awt.Graphics;
public class engine extends train{
	public engine(Graphics g, Color cc, int x, int y) {	
		super(g, cc, x, y);
		g.setColor(Color.gray);
		g.fillOval(xPos - 20,  yPos,  100,  100);	
		g.fillRect(xPos+20, yPos-50, 50, 50);
		g.setColor(Color.black);		
	}
}