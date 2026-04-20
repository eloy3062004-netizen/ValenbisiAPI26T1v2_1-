import java.util.Arrays;
public class ejercicio_2 {

	    public static int buscarPrimeraPosicion(String[] array, String buscado) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals(buscado)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	    public static void main(String[] args) {
	        String[] nombres = {"Ana", "Luis", "Marta", "Luis"};
	        int posicion = buscarPrimeraPosicion(nombres, "Luis");
	        System.out.println("Posición: " + posicion);
	    }
	}

