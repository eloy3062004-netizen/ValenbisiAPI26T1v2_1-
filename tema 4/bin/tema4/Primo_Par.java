package tema4;
import java.util.Scanner;
public class Primo_Par {
	public static void dibujar(int n) {
	    if (n > 0) {
	        dibujar(n - 1);
	        for (int i = 0; i < n; i++) {
	            System.out.println("*");
	        }
	        System.out.println();
	    }
	}
	 public static void main(String[] args) {
		 System.out.print(dibujar(4));
	 }
}
