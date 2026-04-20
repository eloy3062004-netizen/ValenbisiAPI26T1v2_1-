package tema4;

import java.util.ArrayList;
public class ListaContactos {
    private ArrayList<Contacto> lista;
    public ListaContactos() {
        lista = new ArrayList<>();
    }
    public ArrayList<Contacto> getListaContactos() {
        return lista;
    }
    public ArrayList<Contacto> getListaContactosPorNombre(String nombre) {
        ArrayList<Contacto> resultado = new ArrayList<>();
        for (Contacto c : lista) {
            if (c.getNombre().contains(nombre)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
    public boolean agregarContacto(Contacto c) {
        for (Contacto existente : lista) {
            if (existente.getTelefono().equals(c.getTelefono())) {
                return false;
            }
        }
        lista.add(c);
        return true;
    }
    public Contacto eliminarContacto(String telefono) {
        for (Contacto c : lista) {
            if (c.getTelefono().equals(telefono)) {
                lista.remove(c);
                return c;
            }
        }
        return null;
    }
    public String toString() {
        String texto = "AGENDA DE CONTACTOS";
        for (Contacto c : lista) {
            texto += c + "";
        }
        return texto;
    }
}
