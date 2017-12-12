import java.awt.*;

//375, 382 <-- dimensions for relativity 

public class quiver {
	public void paintQuiver(int x, int y, Graphics g) {
		//Paints a quiver with arrows.
		
		Graphics2D a = (Graphics2D) g;
		a.setColor(new Color(79, 42, 0)); 
		a.setStroke(new BasicStroke(4));
		a.drawLine(x+2, y+33, x+22, y+118);
		a.drawLine(x-3, y+28, x+17, y+113);
		a.drawLine(x-8, y+23, x+12, y+108);
		g.setColor(new Color(244, 77, 58));
		int[] fletch1x = {x-3, x+6, x+2};
		int[] fletch1y = {y+33, y+31, y+39};
		g.fillPolygon(fletch1x, fletch1y, 3);
		int[] fletch2x = {x-8, x+1, x-3};
		int[] fletch2y = {y+26, y+24, y+32};
		g.fillPolygon(fletch2x, fletch2y, 3);
		int[] fletch3x = {x-13, x-4, x-8};
		int[] fletch3y = {y+21, y+19, y+26};
		g.fillPolygon(fletch3x, fletch3y, 3);
		g.setColor(new Color(198, 161, 81));
		int[] quiverx = {x+12, x-8, x+12, x+32};
		int[] quivery = {y+43, y+53, y+133, y+128};
		g.fillPolygon(quiverx, quivery, 4);
	}
}
