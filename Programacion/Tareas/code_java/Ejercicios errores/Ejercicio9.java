import java.util.Scanner;

public class Ejercicio9 {

        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int contrasena;

            do {
                System.out.print("Introduce una contraseña numérica de 4 cifras: ");
                contrasena = sc.nextInt();
            } while (contrasena < 1000 || contrasena > 9999);

            System.out.println("Contraseña aceptada: " + contrasena);
        }
    }
    
}
