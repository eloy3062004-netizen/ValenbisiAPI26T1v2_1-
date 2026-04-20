package tema4;
import java.util.ArrayList;
public class ew {
	class Evento {
	    private String nombre;
	    private int aforoMax;
	    private ArrayList<Entrada> entradas;
	    private boolean cancelado;

	    public Evento(String nombre, int aforoMax) {
	        this.nombre = nombre;
	        this.aforoMax = aforoMax;
	        this.entradas = new ArrayList<>();
	        this.cancelado = false;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getAforoMax() {
	        return aforoMax;
	    }

	    public boolean agregarEntrada(Entrada e) {
	        if (cancelado || entradas.size() >= aforoMax) {
	            return false;
	        }
	        for (Entrada en : entradas) {
	            if (en.getCodigo().equals(e.getCodigo())) {
	                return false;
	            }
	        }
	        entradas.add(e);
	        return true;
	    }

	    public Entrada eliminarEntrada(String codigo) {
	        for (int i = 0; i < entradas.size(); i++) {
	            if (entradas.get(i).getCodigo().equals(codigo)) {
	                return entradas.remove(i);
	            }
	        }
	        return null;
	    }

	    public void venderEntrada(String codigo) {
	        for (Entrada e : entradas) {
	            if (e.getCodigo().equals(codigo)) {
	                e.setVendida(true);
	                return;
	            }
	        }
	    }

	    public double calcularRecaudacion() {
	        double total = 0;
	        for (Entrada e : entradas) {
	            if (e.isVendida()) {
	                total += e.getPrecio();
	            }
	        }
	        return total;
	    }

	    public double calcularPorcentajeOcupacion() {
	        int vendidas = 0;
	        for (Entrada e : entradas) {
	            if (e.isVendida()) {
	                vendidas++;
	            }
	        }
	        return ((double) vendidas / aforoMax) * 100;
	    }

	    public void cancelarEvento() {
	        cancelado = true;
	    }

	    public void mostrarEntradasVIPVendidas() {
	        for (Entrada e : entradas) {
	            if (e.isVendida() && e.getTipo().equals("VIP")) {
	                System.out.println(e);
	            }
	        }
	    }

	    public boolean estaEventoCompleto() {
	        return entradas.size() >= aforoMax;
	    }

	    public String toString() {
	        return nombre + " " + aforoMax + " " + cancelado;
	    }
	}

}
