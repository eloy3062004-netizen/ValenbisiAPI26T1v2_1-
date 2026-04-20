package tema4;
	import java.util.Scanner;
	import java.util.InputMismatchException;
	public class tema__9 {
	    public static void main(String[] args) {
	        Scanner stdin = new Scanner(System.in);
	        int n1, n2;

	        try {
	            System.out.print("Introduce un número: ");
	            n1 = stdin.nextInt();

	            System.out.print("Introduce otro número: ");
	            n2 = stdin.nextInt();

	            int result = n1 / n2;
	            System.out.println(n1 + " / " + n2 + " = " + result);

	        } catch (InputMismatchException e) {
	            System.out.println("Error: Debes introducir números enteros válidos.");
	        } catch (ArithmeticException e) {
	            System.out.println("Error: No se puede dividir entre cero.");
	        } finally {
	            stdin.close();
	        }
	    }
	}

