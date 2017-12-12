import java.awt.*;

public class soldier extends champion{
	public soldier(int x, int y, Graphics g){
		//Supers up variables to the parent class champion,
		//where a figure is generated. Since the soldier class
		//has a sword, a sword is created.
		
		super(x, y, g);
		sword s = new sword();
		s.paintSword(x, y, g);
	}
}
