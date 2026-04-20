package tema4;
import java.awt.Graphics;

public class Face {
	abstract class BaseClass { 
	    abstract void draw(Graphics g); 
	}
	class Head extends BaseClass{             
	    public  void draw(Graphics g) {   
	        g.drawOval(75, 75, 400, 400);  
	} }
	class RightEye extends BaseClass{             
	    public void draw(Graphics g) {   
	        g.fillOval(150, 200, 60, 40);   
	} }
	class LeftEye extends BaseClass{              
	     public void draw(Graphics g) {   
		g.fillOval(300, 200, 60, 40);   
	} }
	class Nose extends BaseClass {
	     public void draw(Graphics g) { 
	       g.drawOval(250, 300, 30, 30);   
	} }
	 class Mouth extends BaseClass {  
	      public void draw(Graphics g) { 
	 g.drawArc(175, 300, 200, 100, 180, 180);  
	} }
}

