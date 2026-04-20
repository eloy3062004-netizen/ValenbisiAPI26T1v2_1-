
public class prueba {
	public static void dibujar(int n) {
	    if (n > 0) {
	        dibujar(n - 1);
	        for (int i = 0; i < n; i++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
