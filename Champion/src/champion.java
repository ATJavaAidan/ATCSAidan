import java.awt.*;
import java.applet.*;

public class champion extends Applet{
	private int xpos;
	private int ypos;
	
	public champion(int x, int y, Graphics g) {
		//This method sets the x and y values to variables,
		//and then creates the base level champion.
		xpos=x;
		ypos=y;    
		paintCharacter(g, x, y);
	}
	
	
	public void paintCharacter(Graphics g, int xpos, int ypos) {
		//This method creates the generic figure to be used by the
		//daughter classes.
		
		g.setColor(Color.black); 
		g.fillOval(xpos, ypos, 50, 50); 
		g.fillRect(xpos+12, ypos+48, 25, 100);
		int[] legonex = {xpos+12, xpos+24, xpos+12, xpos};
		int[] legoney = {ypos+148, ypos+148, ypos+228, ypos+228};
		g.fillPolygon(legonex, legoney, 4);
		int[] legtwox = {xpos+24, xpos+36, xpos+48, xpos+36};
		int[] legtwoy = {ypos+148, ypos+148, ypos+228, ypos+228};
		g.fillPolygon(legtwox, legtwoy, 4);
		int[] armonex = {xpos+12, xpos+12, xpos-7, xpos-21};
		int[] armoney = {ypos+50, ypos+68, ypos+110, ypos+110};
		g.fillPolygon(armonex, armoney, 4);
		int[] armtwox = {xpos+37, xpos+37, xpos+57, xpos+70};
		int[] armtwoy = {ypos+50, ypos+68, ypos+110, ypos+110};
		g.fillPolygon(armtwox, armtwoy, 4);
	}
	
}