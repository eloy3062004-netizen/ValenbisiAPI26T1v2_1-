package tema4;
import java.util.Scanner;
public class PasswordFuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una contraseña: ");
        String contraseña = sc.nextLine();
        boolean mayus = false;
        boolean minus = false;
        boolean digito = false;
        if (contraseña.length() >= 8) {
            for (char c : contraseña.toCharArray()) {
                if (Character.isUpperCase(c)) mayus = true;
                if (Character.isLowerCase(c)) minus = true;
                if (Character.isDigit(c)) digito = true;
            }
            if (mayus && minus && digito) {
                System.out.println("fuerte");
            } else {
                System.out.println("débil");
            }
        } else {
            System.out.println("Contraseña débil (menos de 8 caracteres)");
        }
    }
}
