package tema4;

import java.util.Scanner;
public class ContarFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = sc.nextLine();
        char[] caracteres = frase.toCharArray();
        int espacios = 0;
        int mayus = 0;
        int minus = 0;
        for (char c : caracteres) {
            if (Character.isWhitespace(c)) {
                espacios++;
            }
            if (Character.isUpperCase(c)) {
                mayus++;
            }
            if (Character.isLowerCase(c)) {
                minus++;
            }
        }
        int palabras = espacios;
        System.out.println("Palabras: " + palabras);
        System.out.println("Mayúsculas: " + mayus);
        System.out.println("Minúsculas: " + minus);
    }
}
