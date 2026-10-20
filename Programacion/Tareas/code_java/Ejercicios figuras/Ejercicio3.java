import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo equilátero: ");
        int altura = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        // Menú de colores con switch y opción cancelar
        String color = "";
        while (true) {
            System.out.print("Introduce el color del triángulo (amarillo, rojo, verde, cancelar): ");
            String opcion = scanner.nextLine().toLowerCase();

            switch (opcion) {
                case "amarillo":
                    color = "\u001B[33m";
                    break;
                case "rojo":
                    color = "\u001B[31m";
                    break;
                case "verde":
                    color = "\u001B[32m";
                    break;
                case "cancelar":
                    System.out.println("Operación cancelada.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    continue;
            }
            break;
        }

        String reset = "\u001B[0m";
        int fila;

        for (fila = 1; fila <= altura; fila++) {
            // Imprimir espacios para alineación central
            for (int espacios = 1; espacios <= altura - fila; espacios++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos con color
            for (int asteriscos = 1; asteriscos <= 2 * fila - 1; asteriscos++) {
                System.out.print(color + "*" + reset);
            }
            System.out.println();
        }
        scanner.close();
    }
}
