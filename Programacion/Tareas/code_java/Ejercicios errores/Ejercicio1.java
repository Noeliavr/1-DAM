import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        final String USER = "admin";
        final String PASS = "1234";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Usuario: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();

            if (u.equals(USER) && p.equals(PASS)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        }
    }
    
}
