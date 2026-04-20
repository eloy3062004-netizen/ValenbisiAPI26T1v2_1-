package tema4;
import java.util.ArrayList;
public class dw {	
	class Entrada {
	    private String codigo;
	    private String comprador;
	    private double precio;
	    private String tipo;
	    private boolean vendida;
	    public Entrada(String codigo, String comprador, String tipo) {
	        this.codigo = codigo;
	        this.comprador = comprador;
	        this.tipo = tipo;
	        if (tipo.equals("NORMAL")) {
	            this.precio = 50;
	        } else if (tipo.equals("VIP")) {
	            this.precio = 100;
	        } else if (tipo.equals("PALCO")) {
	            this.precio = 200;
	        }
	        this.vendida = false;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public String getComprador() {
	        return comprador;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public boolean isVendida() {
	        return vendida;
	    }

	    public void setTipo(String tipo) {
	        this.tipo = tipo;
	    }

	    public void setVendida(boolean vendida) {
	        this.vendida = vendida;
	    }

	    public String toString() {
	        return codigo + " " + comprador + " " + tipo + " " + precio + " " + vendida;
	    }
	}
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
class tester_evento {
    public static void main(String[] args) {
        System.out.println("1");
        Evento evento = new Evento("Concierto", 6);
        Entrada e1 = new Entrada("E1", "Ana", "VIP");
        Entrada e2 = new Entrada("E2", "Luis", "NORMAL");
        Entrada e3 = new Entrada("E3", "Marta", "VIP");
        Entrada e4 = new Entrada("E4", "Juan", "PALCO");
        Entrada e5 = new Entrada("E5", "Laura", "NORMAL");
        Entrada e6 = new Entrada("E6", "Carlos", "VIP");

        evento.agregarEntrada(e1);
        evento.agregarEntrada(e2);
        evento.agregarEntrada(e3);
        evento.agregarEntrada(e4);
        evento.agregarEntrada(e5);
        evento.agregarEntrada(e6);

        evento.venderEntrada("E1");
        evento.venderEntrada("E2");
        evento.venderEntrada("E3");
        evento.venderEntrada("E4");
        evento.venderEntrada("E6");

        System.out.println(evento.calcularRecaudacion());
        System.out.println(evento.calcularPorcentajeOcupacion());
        evento.mostrarEntradasVIPVendidas();
        System.out.println(evento.estaEventoCompleto());
        System.out.println(evento.eliminarEntrada("E5"));
        evento.cancelarEvento();
        System.out.println(evento);
    }

}

