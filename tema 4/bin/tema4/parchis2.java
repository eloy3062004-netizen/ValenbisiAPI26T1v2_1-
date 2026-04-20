package tema4;
import java.util.ArrayList;
public class parchis2 {
	class Ficha {

	    private static final int CASILLA_MAXIMA = 68;

	    private int id;
	    private String color;
	    private int casillaActual;

	    public Ficha(int id, String color, int casillaInicial) {
	        this.id = id;
	        this.color = color;
	        this.casillaActual = casillaInicial;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getColor() {
	        return color;
	    }

	    public int getCasillaActual() {
	        return casillaActual;
	    }

	    public static int getCasillaMaxima() {
	        return CASILLA_MAXIMA;
	    }


	    public int adondeMueveFicha(int dado) {

	        if(casillaActual == 0)
	            return dado;

	        int destino = (casillaActual + dado) % CASILLA_MAXIMA;

	        if(destino == 0)
	            destino = CASILLA_MAXIMA;

	        return destino;
	    }

	    public void mueveFicha(int cantidad) {

	        if(casillaActual == 0) {
	            casillaActual = cantidad;
	            return;
	        }

	        int destino = (casillaActual + cantidad) % CASILLA_MAXIMA;

	        if(destino <= 0)
	            destino = 0;

	        if(destino == 0 && cantidad > 0)
	            destino = CASILLA_MAXIMA;

	        casillaActual = destino;
	    }
	}

	public class Parchis2 {

	    private ArrayList<Ficha> fichas;

	    public Parchis2() {
	        fichas = new ArrayList<>();
	    }


	    public void crearFichasUnJugador(String color) {

	        for(int i = 0; i < 4; i++) {

	            int id = fichas.size();

	            Ficha f = new Ficha(id, color, 0);

	            fichas.add(f);
	        }
	    }

	    public boolean saleFicha(int id, int casilla) {

	        for(Ficha f : fichas) {

	            if(f.getId() == id && f.getCasillaActual() == 0) {
	                f.mueveFicha(casilla);
	                return true;
	            }
	        }

	        return false;
	    }

	    public Ficha getFichaEnCasilla(int casilla) {

	        for(Ficha f : fichas) {

	            if(f.getCasillaActual() == casilla)
	                return f;
	        }

	        return null;
	    
	    }


	    public boolean mataFicha(Ficha fichaQueCome, Ficha fichaComida) {

	        if(fichas.contains(fichaQueCome) && fichas.contains(fichaComida)) {

	            int casilla = fichaComida.getCasillaActual();


	            fichaComida.mueveFicha(-casilla);


	            fichaQueCome.mueveFicha(casilla);

	            return true;
	        }

	        return false;
	    }
	 }
}
