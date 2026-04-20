package tema4;

public class Iterar implements Comparable<Iterar> {

    private String name;
    private int hours;

    public Iterar(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject [name=" + name + ", hours=" + hours + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Iterar other = (Iterar) obj;
        return name.equals(other.name);
    }

    @Override
    public int compareTo(Iterar other) {
        return this.name.compareTo(other.name);
    }
}


