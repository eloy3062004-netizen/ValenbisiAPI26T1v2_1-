package tema4;

public class Autoboxing {

	public static void main(String[] args) {
		//2) (2 puntos) Dadas dos variables, una de tipo double y otra de tipo Double, escribe una sentencia para cada caso:
			double d = 5.5;
			Double D = 10.5;
			//Asignar el valor de double a Double usando autoboxing o unboxing (indica cuál). //(autoboxing)
			Double obj = d;  
			//Asignar el valor de Double a double usando autoboxing o unboxing (indica cuál).
			//(unboxing)
			double prim = D;
			//Asignar el valor usando un constructor (sin autoboxing/unboxing). 
			Double obj2 = new Double(d);
			//Asignar el valor usando otro método (sin autoboxing/unboxing).
			double prim2 = D.doubleValue();
			//Definir una variable String llamada numS.
			String numS; 
			//Asignar el valor de double a numS.
			numS = String.valueOf(d); 
			//Asignar el valor de Double a numS.
			numS = D.toString(); 
		// TODO Auto-generated method stub
	}
}
