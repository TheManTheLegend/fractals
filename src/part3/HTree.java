package part3;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Point2D;
import draw.UltraDraw;
import part1.Square;


public class HTree implements KeyListener {
	static H derp = new H(new Point2D.Double(75,75), 75.0);

	public HTree(){
		UltraDraw.setXscale(0, 150); 
		UltraDraw.setYscale(0, 150); 
		UltraDraw.addKeyListener(this);
		UltraDraw.show();
		
	}
	
	public static void main(String[] args) {
		
	}

	
	public static void htree(H h, int n) {
		
		if(n<=0)return;
		
		
		// TODO: implement
		H bottomLeft  = new H(h.getBottomLeft(),  h.getSize()/(4.0/(n/2)));
		H topLeft     = new H(h.getTopLeft(),     h.getSize()/(4.0/(n/2)));
		H bottomRight = new H(h.getBottomRight(), h.getSize()/(4.0/(n/2)));
		H topRight    = new H(h.getTopRight(),    h.getSize()/(4.0/(n/2)));
		h.draw();
		htree(bottomLeft,  n-1);
		htree(topLeft,     n-1);
		htree(bottomRight, n-1);
		htree(topRight,    n-1);
		;
	}
	
	public void draw(int n) {
		// TODO: implement
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

		}
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		UltraDraw.clear(UltraDraw.WHITE);
		System.out.println(e.getKeyChar());
		String str = String.valueOf(e.getKeyChar());
		int z = Integer.parseInt(str);
			
		htree(derp,z);
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		  

	}
}

