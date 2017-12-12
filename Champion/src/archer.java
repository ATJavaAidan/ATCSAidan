import java.awt.*;

public class archer extends champion{
	public archer(int x, int y, Graphics g){
		//Supers up variables to the parent class champion,
		//where a figure is generated. Since the archer class
		//has a bow and quiver, instances of these objects are created.
		
		super(x, y, g);
		quiver q= new quiver();
		q.paintQuiver(x, y, g);
		bow b= new bow();
		b.paintBow(x, y, g);
	}
}
