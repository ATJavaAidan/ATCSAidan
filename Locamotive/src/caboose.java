import java.awt.*;
public class caboose extends train{
	public caboose(Graphics g, Color cc, int x, int y) {
		super(g, cc, x, y);
		g.setColor(Color.black);	
		g.fillRect(xPos + 45, yPos - 15, 60, 15);
	}
}