import java.awt.*;

//375, 382 <-- dimensions for relativity 

public class sword {
	public void paintSword(int x, int y,Graphics g) {
		//Paints a sword.
		g.setColor(new Color(91, 62, 4));
		int[] handlex = {x+55, x+58, x+68, x+65};
		int[] handley = {y+118, y+121, y+91, y+88};
		g.fillPolygon(handlex, handley, 4);
		g.setColor(new Color(119, 121, 124)); 
		g.fillOval(x+52, y+113, 10, 10);
		int[] bladex = {x+63, x+70, x+95, x+99, x+88};
		int[] bladey = {y+86, y+93, y+18, y+8, y+11};	
		g.fillPolygon(bladex, bladey, 5);
	}
}
