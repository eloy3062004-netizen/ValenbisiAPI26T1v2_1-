package tema4;
import java.util.ArrayList;
class Evento {
	private String nombre;
	private int aforoMax;
	private ArrayList<Entrada> entradaList;;
	private Boolean cancelado;
	public Evento(String nombre, Boolean cancelado) {
        this.nombre = nombre;
        this.cancelado = cancelado;
    }
	public String getNombre() {
        return nombre;
}
public Integer getAforoMax() {
	        return aforoMax;
}
	public double calcularRecaudacion() {
		
}
}