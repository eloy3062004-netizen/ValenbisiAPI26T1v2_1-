package tema4;

public class tema____9 {
	public static void main(String[] args) {
	    int a = 4, b = 0;

	    try {
	        System.out.println(a / b);
	    } catch (ArithmeticException e) {
	        System.out.println("Error: división por cero no permitida.");
	    }
	}
	public static void main(String[] args) {
	    int[] array = new int[5];

	    try {
	        array[5] = 1; 
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Error: índice fuera de los límites del array.");
	    }
	}
	}

