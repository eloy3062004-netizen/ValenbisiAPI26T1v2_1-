package tema4;

public class tester {
	 public static void main(String[] args) {

	        tester[] puntos = new tester[3];

	        puntos[0] = new tester(2, 4);
	        puntos[1] = new tester(5, 1);
	        puntos[2] = new tester();
	    
	        puntos[2].setX(7);
	        puntos[2].setY(9);

	      
	        for (int i = 0; i < puntos.length; i++) {
	            System.out.println(
	                "Punto " + i +
	                ": X = " + puntos[i].getX() +
	                ", Y = " + puntos[i].getY()
	            );
	        }
	        class Point{
	        	private double x; 
	        	private double y; 


	        	public void setXY(double abs, double ord) {
	        		x = abs;
	        		y = ord;
	        	}
	        	public double distOrigin() {
	        		return(Math.sqrt(x*x + y*y));
	        	}
	        }   
	        System.out.println("\nMostrando con toString():");
	        for (int i = 0; i < puntos.length; i++) {
	            System.out.println("Punto " + i + " " + puntos[i]);
	        }
	    }
	}


