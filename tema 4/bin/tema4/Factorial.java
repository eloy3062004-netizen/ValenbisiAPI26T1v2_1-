package tema4;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Factorial {
	class NegativeNumberException extends Exception {
	    public NegativeNumberException(String message) {
	        super(message);
	    }
	public int Factorial(int n) throws NegativeNumberException {
	    if (n < 0) {
	        throw new NegativeNumberException("Factorial is not defined for negative numbers.");
	    }

	    int fac = 1;
	    for (int i = n; i > 0; i--) {
	        fac *= i;
	    }
	    return fac;
	//}	
	    //public static void main(String[] args) {
	        try {
	            System.out.println(Factorial(5));   
	            System.out.println(Factorial(-3));  
	        } catch (NegativeNumberException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
}