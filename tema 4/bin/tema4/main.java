package tema4;
	import java.util.*;
	public class main {
	    public static void main(String[] args) {

	        List<Asignatura> asignaturas = new ArrayList<>();

	        asignaturas.add(new Asignatura("Programacion", 8));
	        asignaturas.add(new Asignatura("Bases de Datos", 6));
	        asignaturas.add(new Asignatura("Lenguajes de Marcas", 4));
	        asignaturas.add(new Asignatura("Sistemas Informaticos", 5));
	        asignaturas.add(new Asignatura("Entornos de Desarrollo", 3));
	        asignaturas.add(new Asignatura("Desarrollo Cliente", 6));
	        asignaturas.add(new Asignatura("Desarrollo Servidor", 8));
	        asignaturas.add(new Asignatura("Despliegue de Aplicaciones", 4));
	        asignaturas.add(new Asignatura("Diseño de Interfaces", 5));

	        System.out.println("LISTA COMPLETA");
	        for (Asignatura a : asignaturas) {
	            System.out.println(a);
	        }

	        asignaturas.removeIf(a -> a.getHorasSemanales() <= 4);

	        System.out.println("\nTRAS ELIMINAR <= 4 HORAS");
	        asignaturas.forEach(System.out::println);

	        Collections.sort(asignaturas);

	        System.out.println("\nORDENADAS ALFABETICAMENTE");
	        asignaturas.forEach(System.out::println);

	        String nombreBuscado = "Bases de Datos";
	        boolean encontrado = false;

	        for (Asignatura a : asignaturas) {
	            if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
	                System.out.println("\nENCONTRADA: " + a);
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("\nNO ENCONTRADA");
	        }

	        System.out.println("\nRECORRIDO INVERSO");

	        ListIterator<Asignatura> it = asignaturas.listIterator(asignaturas.size());

	        while (it.hasPrevious()) {
	            System.out.println(it.previous());
	        }
	    }
	}
