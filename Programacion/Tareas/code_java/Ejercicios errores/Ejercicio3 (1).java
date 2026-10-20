import java.util.Scanner;

public class Ejercicio3 {

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Precio base: ");
            double precio = sc.nextDouble();
            System.out.print("Descuento (%): ");
            double desc = sc.nextDouble();

            if (desc >= 0 && desc < 100) {
                double finalPrice = precio * (100 - desc) / 100;
                System.out.println("Precio final = " + finalPrice);
            } else {
                System.out.println("Descuento no válido.");
            }
        }
    }
    
}
