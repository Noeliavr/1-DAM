import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Determinar cuántas personas van a asistir
    System.out.print("Dime cuántas personas sois: ");
    int numero = scanner.nextInt();

    // Paso 2: Calcular el precio del evento dependiendo de las personas
    double precioPorPersona;
    if (numero <= 200) {
      precioPorPersona = 95.0;
    } else if (numero <= 300) {
      precioPorPersona = 85.0;
    } else {
      precioPorPersona = 75.0;
    }
    double precioFinal = numero * precioPorPersona;
    System.out.println("Precio por persona es:" + precioPorPersona + " euros");
    System.out.println("Precio total es: " + precioFinal + " euros");
  }
}