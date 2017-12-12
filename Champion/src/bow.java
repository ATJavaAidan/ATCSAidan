import java.awt.*;

//375, 382 <-- dimensions for relativity 

public class bow {
	public void paintBow(int x, int y,Graphics g) {
		//Paints a bow with an arrow in the nock. 
		Graphics2D f = (Graphics2D) g;
		f.setColor(new Color(119, 121, 124)); 
		f.setStroke(new BasicStroke(4));
		f.drawLine(x+30, y+103, x+70, y+58);
		f.setColor(new Color(79, 42, 0)); 
		f.setStroke(new BasicStroke(4));
		f.drawLine(x+50, y+80, x+85, y+115);
		f.setColor(new Color(91, 62, 4)); 
		f.setStroke(new BasicStroke(7));
		f.drawArc(x+20, y+53, 60, 60, 230, 180);
		f.setColor(new Color(119, 121, 124));
		int[] spearx = {x+82, x+91, x+94};
		int[] speary = {y+121, y+112, y+123};
		f.fillPolygon(spearx, speary, 3);
		f.setColor(new Color(244, 77, 58));
		int[] fletchx = {x+42, x+51, x+54};
		int[] fletchy = {y+82, y+74, y+84};
		f.fillPolygon(fletchx, fletchy, 3);

	}
	


}
