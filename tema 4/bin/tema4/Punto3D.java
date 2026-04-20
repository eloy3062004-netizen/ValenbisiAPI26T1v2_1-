package tema4;
import java.util.ArrayList;
import java.util.Scanner;

class Punto3D {
   protected double x;
   protected double y;

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ", )";
    }
}
public class Main {
    public static void main(String[] args) {

        ArrayList<Punto3D> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Punto " + (i + 1));

            System.out.print("Introduce x: ");
            double x = sc.nextDouble();

            System.out.print("Introduce y: ");
            double y = sc.nextDouble();

            lista.add(new Punto3D(x, y));
        }

        if (!lista.isEmpty()) {
            lista.remove(lista.size() - 1);
        }

        System.out.println("Lista final:");
        for (Punto3D p : lista) {
            System.out.println(p);
        }

        sc.close();
    }
}
