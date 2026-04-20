package tema4;

public class Fraccion {
 private int numerador;
 private int denominador;
 public Fraccion(int numerador, int denominador) {
	 this.numerador = numerador;
	 this.denominador = denominador;
 }
 public void setnumerador(int numerador) {
	 this.numerador = numerador;	 
 }
 public void setdenominador(int denominador) {
	 this.denominador = denominador;
 }
 public int getnumerador( ) {
	 return numerador;
 }
 public int getdenominador() {
	 return denominador;
 }
 public String tostring() {
	 return numerador + "/" + denominador;
 }
 private int mcd(int a, int b) {
	 while (b != 0) {
		 int resto = a % b;
		 a=b;
		b=resto;
	 }
	 return a;
	 }
 private int mcm(int a, int b) {
	    return (a * b) / mcd(a, b);
	}
 public Fraccion sumar(Fraccion r) {
	    int mcm = mcm(this.denominador, r.denominador);
	    int nuevonumerador =
	        this.numerador * (mcm / this.denominador) +
	        r.numerador * (mcm / r.denominador);
	    return new Fraccion(nuevonumerador, mcm).simplificar();
	}
 private Fraccion simplificar() {

	return null;
 }


}
