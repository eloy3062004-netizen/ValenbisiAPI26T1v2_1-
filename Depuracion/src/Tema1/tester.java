package Tema1;

public class tester {
		    public static void main(String[] args) {

		        Punto[] puntos = new Punto[3];

		        puntos[0] = new Punto(2, 4);
		        puntos[1] = new Punto(5, 1);
		        puntos[2] = new Punto();
		    
		        puntos[2].setX(7);
		        puntos[2].setY(9);

		      
		        for (int i = 0; i < puntos.length; i++) {
		            System.out.println(
		                "Punto " + i +
		                ": X = " + puntos[i].getX() +
		                ", Y = " + puntos[i].getY()
		            );
		        }

		      
		        System.out.println("\nMostrando con toString():");
		        for (int i = 0; i < puntos.length; i++) {
		            System.out.println("Punto " + i + " " + puntos[i]);
		        }
		    }
		}
