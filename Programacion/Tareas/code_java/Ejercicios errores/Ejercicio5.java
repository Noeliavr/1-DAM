import java.util.Scanner;

public class Ejercicio5 {

        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();

            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
        }
    }
    
}