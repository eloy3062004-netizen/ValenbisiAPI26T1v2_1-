package Tema1;
public class Prueba {
	import java.util.Scanner;
	public static void main(String[] args) {
		public static String cambiarMayMin(String texto) {
			StringBuilder resultado = new StringBuilder();

			int i = 0;

			while (i < texto.length()) {
			char c = texto.charAt(i);

			if (Character.isUpperCase(c)) {
			resultado.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
			resultado.append(Character.toUpperCase(c));
			} else {
			resultado.append(c); 
			}
			i++;
			}

			return resultado.toString();
			}

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Introduce una cadena: ");
			String entrada = sc.nextLine();

			String salida = cambiarMayMin(entrada);

			System.out.println("Cadena modificada: " + salida);

			sc.close();
		// TODO Auto-generated method stub
			
			}
	}
}
