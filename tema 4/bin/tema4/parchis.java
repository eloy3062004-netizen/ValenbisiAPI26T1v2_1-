package tema4;

public class parchis {
	private int casillaActual;
	private static final int CASILLA_MAXIMA = 68;
	public static int getCasillaMaxima() {
	    return CASILLA_MAXIMA;
	}
	public parchis() {
	    casillaActual = 1;
	    
	}
			public int adondeMueveFicha(int dado) {
	    int destino = (casillaActual + dado) % CASILLA_MAXIMA;
		int nuevaCasilla = (casillaActual + dado) % 68;

	    if (destino == 0) {
	        destino = CASILLA_MAXIMA;
	    }

	    return destino;
	}


	public static void main(String[] args) {

		

		
		// TODO Auto-generated method stub

	}

}
