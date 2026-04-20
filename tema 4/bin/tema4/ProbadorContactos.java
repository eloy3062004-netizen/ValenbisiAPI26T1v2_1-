package tema4;

public class ProbadorContactos {

    public static void main(String[] args) {

        ListaContactos agenda = new ListaContactos();

        Contacto c1 = new Contacto("Ana", "111");
        c1.setMail("ana@email.com");
        Contacto c2 = new Contacto("Luis", "222");
        Contacto c3 = new Contacto("Ana María", "333");

        System.out.println("Añadir contactos:");
        System.out.println(agenda.agregarContacto(c1));
        System.out.println(agenda.agregarContacto(c2));
        System.out.println(agenda.agregarContacto(c3));

        System.out.println("Intentar añadir duplicado:");
        System.out.println(agenda.agregarContacto(new Contacto("Pedro","111")));

        System.out.println("Lista completa:");
        System.out.println(agenda);

        System.out.println("Buscar nombre 'Ana':");
        System.out.println(agenda.getListaContactosPorNombre("Ana"));

        System.out.println("Eliminar teléfono 222:");
        System.out.println(agenda.eliminarContacto("222"));

        System.out.println("Lista final:");
        System.out.println(agenda);
    }
}