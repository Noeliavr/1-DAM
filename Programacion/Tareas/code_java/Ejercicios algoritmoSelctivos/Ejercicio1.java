import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedir el número 1
        System.out.print("Introduce el número 1: ");
        int numero1 = scanner.nextInt();
        // Pedir el número 2
        System.out.print("Introduce el número 2: ");
        int numero2 = scanner.nextInt();
        // Comparar cuál número es mayor
        if (numero1 > numero2) {
            System.out.println("El " + numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("El " + numero2 + " es mayor que " + numero1);
        } else {
            System.out.println(numero1 + " y " + numero2 + " son iguales.");
        }
    }
}