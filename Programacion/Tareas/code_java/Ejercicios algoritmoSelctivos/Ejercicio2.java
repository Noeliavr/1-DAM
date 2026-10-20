import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir el número 1
        System.out.print("Instroduce el numero 1: ");
        double numero1 = scanner.nextDouble();
        if (numero1 > 0) {
            System.out.println(numero1 + " es positivo");
        } else if (numero1 < 0) {
            System.out.println(numero1 + " es negativo");
        } else {
            System.out.println("El numero no es positivo ni negativo porque es cero");
        }
    }

}