package tema4;

public class punto {

	public punto(int i, int j) {
	}

	public punto() {
	}

	public static void main(String[] args) {
		        punto[] puntos = new Fraccion[3];

		      
		        puntos[0] = new punto(2, 4);
		        puntos[1] = new punto(5, 1);
		        puntos[2] = new punto();

		
		        puntos[2].setX(7);
		        puntos[2].setX(9);

		  
		        for (int i = 0; i < puntos.length; i++) {
		            System.out.println(
		                "Punto " + i +
		                ": X = " + puntos[i].getX() +
		                ", Y = " + puntos[i].getX()
		            );
		        }

		     
		        System.out.println("\nMostrando con toString():");
		        for (int i = 0; i < puntos.length; i++) {
		            System.out.println("Punto " + i + " " + puntos[i]);
		        }
		    }

	private String getX() {
		return null;
	}

	private void setX(int i) {
		
	}
		


	}


