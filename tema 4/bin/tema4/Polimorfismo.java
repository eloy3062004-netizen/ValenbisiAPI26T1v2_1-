package tema4;
import java.util.Random;
public class Polimorfismo {
	abstract class Shape  {    
		public abstract double area(int b,int h); 
	} // end Shape 
	public class Triangle extends Shape{        
		public  double area(int b, int h) {        
				return 0.5 * b * h;       
	 	}       
	}// end Triangle. 
	public class Rectangle extends Shape{              
		public  double  area(int b, int h) {       
				return  b * h;              
		}            
	 }// end Rectangle 
	public static void main(String [] args)        {             		Shape shp = null;       
		Random r = new Random();       
		int flip = r.nextInt(2);       
		if (flip == 0)  shp = new Triangle();  
		else shp = new Rectangle();       			System.out.println("Area = " + shp.area(5,10)); 
		}  
	
}


