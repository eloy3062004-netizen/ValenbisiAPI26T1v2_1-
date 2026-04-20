package tema4;
	import java.util.Scanner;
	import java.util.InputMismatchException;

	public class Tema_9 {
	    public static void main(String[] args) {
	        Scanner stdin = new Scanner(System.in);
	        int[] array = {4, 2, 6, 7};
	        int n;

	        try {
	            System.out.println("Introduce un número entero > 0 y < " + array.length + ": ");
	            n = stdin.nextInt();

	            if (n <= 0 || n >= array.length) {
	                throw new ArrayIndexOutOfBoundsException("Índice fuera de rango");
	            }
	            System.out.println("Valor en la posicion " + n + ": " + array[n]);
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Debes introducir un número entero válido.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: El índice está fuera de los límites del array.");
	        } finally {
	            stdin.close();
	        }
	    }
	}
