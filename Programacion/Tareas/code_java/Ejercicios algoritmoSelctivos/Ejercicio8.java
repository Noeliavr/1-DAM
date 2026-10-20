import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Determinar cuántas personas van a asistir
    System.out.print("¿Cuántos niños van a asistir al viaje?: ");
    int niños = scanner.nextInt();

    // Paso 2: Calcular lo que hay que pagar por persona y a la compañia
    double precioPorPersona;
    if (niños >= 100) {
      precioPorPersona = 65.0;
    } else if (niños >= 50 && niños <= 99) {
      precioPorPersona = 70.0;
    } else if (niños >= 30 && niños <= 49) {
      precioPorPersona = 95.0;
    } else {
      precioPorPersona = 4000.0;
    }
    double precioFinal = niños * precioPorPersona;
    System.out.println("Precio por persona es: " + precioPorPersona + " euros");
    System.out.println("Precio final es: " + precioFinal + "euros");
  }
}