import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el lado del cuadrado: ");
        int lado = scanner.nextInt();

        // Códigos de color ANSI
        String rojo = "\u001B[31m";
        String amarillo = "\u001B[33m";
        String reset = "\u001B[0m";

        for (int fila = 1; fila <= lado; fila++) {
            String color = (fila % 2 == 0) ? amarillo : rojo;
            for (int col = 1; col <= lado; col++) {
                System.out.print(color + "* " + reset);
            }
            System.out.println();
        }
        scanner.close();
    }
}
