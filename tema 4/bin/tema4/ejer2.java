package tema4;
import java.util.Scanner;
public class ejer2 {
	    static int[] productoescalar(int escalar, int[] v) {
	        int[] r = new int[v.length];
	        for (int i = 0; i < v.length; i++) {
	            r[i] = escalar * v[i];
	        }
	        return r;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] v = new int[3];

	        System.out.println("Escalar:");
	        int escalar = sc.nextInt();

	        System.out.println("Dime el vector:");
	        for (int i = 0; i < 3; i++) v[i] = sc.nextInt();

	        int[] r = productoescalar(escalar, v);

	        System.out.println("Resultado:");
	        for (int i : r) System.out.println(i);
	    }
	}

	


