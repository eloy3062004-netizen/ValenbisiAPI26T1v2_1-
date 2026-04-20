package tema4;
import java.util.Objects;
//Insert all the modules of DAW (two years).
//Show all the list.
//Remove the modules of 4 hours or less
//Show the list.
//Order the list alphabetically by the name of the module.
//Show the list again.
//Search for a Subject by using the name
//Iterate the List backwards
public class Subject implements Comparable<Asignatura> {
    private String nombre;
    private int horasSemanales;

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    @Override
    public String toString() {
        return nombre + " (" + horasSemanales + "h/semana)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Asignatura)) return false;
        Asignatura otra = (Asignatura) obj;
        return nombre.equalsIgnoreCase(otra.nombre);
    }

    @Override
    public int compareTo(Asignatura otra) {
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }
}

