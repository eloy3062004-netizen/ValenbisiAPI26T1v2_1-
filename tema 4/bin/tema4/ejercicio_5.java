package tema4;

public class ejercicio_5 {

	public static void main(String[] args) {
		//Crea un ArrayList de Strings 	llamado c1 y añade tres colores.
		ArrayList<String> c1 = new ArrayList<>();
		c1.add("Rojo");
		c1.add("Azul");
		c1.add("Verde");
		//Crea otro ArrayList de Strings 	llamado c2 y añade 4 colores.
		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Amarillo");
		c2.add("Negro");
		c2.add("Blanco");
		c2.add("Morado");
		//Crea un tercer ArrayList (mismo 	tipo) llamado c3 que añada los elementos de c1 y c2.
		ArrayList<String> c3 = new ArrayList<>();
		c3.addAll(c1);
		c3.addAll(c2);
		// TODO Auto-generated method stub

	}

}
