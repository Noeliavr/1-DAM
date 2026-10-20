import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado = 0;
        int fila = 0;
        while (lado <= 5 && fila <= 5) {

            // Códigos de color ANSI
            String azul = "\u001B[34m";
            String verde = "\u001B[32m";
            String reset = "\u001B[0m";

            for (fila = 1; fila <= 5; fila++) {
                lado++;
                String color = (fila % 2 == 0) ? verde : azul;

                for (int col = 1; col <= lado; col++) {
                    System.out.print(color + "* " + reset);
                }
                System.out.println();
            }
            scanner.close();
        }
    }
}
