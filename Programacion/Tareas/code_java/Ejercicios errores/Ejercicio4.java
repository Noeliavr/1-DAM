import java.util.Scanner;

public class Ejercicio4 {

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Temperatura en °C: ");
            double c = sc.nextDouble();

            double f = (9.0 / 5) * c + 32;
            System.out.println("Fahrenheit = " + f);
        }
    }
    
}
