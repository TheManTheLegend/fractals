package part3;
import java.awt.geom.Point2D;
import draw.StdDraw;
import part1.Square;


public class HTree {
	
	public static void main(String[] args) {
		StdDraw.setXscale(0, 150); 
		StdDraw.setYscale(0, 150); 
		
		H derp = new H(new Point2D.Double(75,75), 75.0);
		htree(derp,7);
		StdDraw.show();
	}

	
	public static void htree(H h, int n) {
		
		if(n<=0)return;
		// TODO: implement
		H bottomLeft  = new H(h.getBottomLeft(),  h.getSize()/2);
		H topLeft     = new H(h.getTopLeft(),     h.getSize()/2);
		H bottomRight = new H(h.getBottomRight(), h.getSize()/2);
		H topRight    = new H(h.getTopRight(),    h.getSize()/2);
		h.draw();
		htree(bottomLeft,  n-1);
		htree(topLeft,     n-1);
		htree(bottomRight, n-1);
		htree(topRight,    n-1);
		
	}
	
	public void draw(int n) {
		// TODO: implement
	}
	
}
