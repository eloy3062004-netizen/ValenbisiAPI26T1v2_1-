package tema4;
import java.util.Scanner;
public class prueba_clase {
   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("frase: ");
	        String frase = sc.nextLine();
	        char[] caracteres = frase.toCharArray();
	        int palabras = 0;
	        int mayusculas = 0;
	        int minusculas = 0;
	        for (int i = 0; i < caracteres.length; i++) {

	            if (Character.isUpperCase(caracteres[i])) {
	                mayusculas++;
	            } else if (Character.isLowerCase(caracteres[i])) {
	                minusculas++;
	            }
	            

	        sc.close();
	    }	
   }	
}	

