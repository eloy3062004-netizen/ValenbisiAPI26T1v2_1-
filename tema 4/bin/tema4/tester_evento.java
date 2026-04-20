package tema4;

public class tester_evento {
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

}
