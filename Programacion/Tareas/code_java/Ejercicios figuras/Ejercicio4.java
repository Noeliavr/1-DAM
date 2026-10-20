import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Pedir número hasta que sea impar
    System.out.print("Introduce la altura del rombo(tiene que ser un número impar): ");
    int altura = scanner.nextInt();
    scanner.nextLine(); // limpiar buffer

    while (altura % 2 == 0) {
      System.out.println("La altura debe ser impar. Introduce de nuevo un número");
      altura = scanner.nextInt();
      scanner.nextLine(); // limpiar buffer
    }

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
    int mitad = altura / 2 + 1;

    // Parte superior del rombo

    for (int fila = 1; fila <= mitad; fila++) {
      // Imprimir espacios para alineación central
      for (int espacios = 1; espacios <= mitad - fila; espacios++) {
        System.out.print(" ");
      }
      // Imprimir asteriscos con color
      for (int asteriscos = 1; asteriscos <= 2 * fila - 1; asteriscos++) {
        System.out.print(color + "*" + reset);
      }
      System.out.println();
    }

    // Parte inferior del rombo
    for (int fila = mitad - 1; fila >= 1; fila--) {
      for (int espacios = 1; espacios <= mitad - fila; espacios++) {
        System.out.print(" ");
      }
      for (int asteriscos = 1; asteriscos <= 2 * fila - 1; asteriscos++) {
        System.out.print(color + "*" + reset);
      }
      System.out.println();
    }
    scanner.close();
  }
}
