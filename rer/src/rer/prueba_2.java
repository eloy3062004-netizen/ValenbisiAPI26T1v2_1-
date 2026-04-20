
public class prueba_2 {
	public class Ejercicio3 {

	    public static boolean diagonalesIguales(int[][] matriz) {
	        int sumaPrincipal = 0;
	        int sumaSecundaria = 0;
	        int n = matriz.length;

	        for (int i = 0; i < n; i++) {
	            sumaPrincipal += matriz[i][i];
	            sumaSecundaria += matriz[i][n - 1 - i];
	        }

	        return sumaPrincipal == sumaSecundaria;
	    }

	    public static void main(String[] args) {
	        int[][] tablero = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        boolean resultado = diagonalesIguales(tablero);
	        System.out.println("¿Diagonales iguales? " + resultado);
	    }
	}

	}
