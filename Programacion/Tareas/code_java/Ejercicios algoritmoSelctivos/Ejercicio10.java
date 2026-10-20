import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Pedir el número de cita al usuario
    System.out.print("Introduce el número de cita: ");
    int cita = scanner.nextInt();

    double precioCita = 0; // Precio de la cita actual
    double pagado = 0; // Total acumulado pagado por el tratamiento

    // Paso 2: Recorrer todas las citas hasta la solicitada para calcular precios
    // escalonados
    for (int i = 1; i <= cita; i++) {
      // Las tres primeras citas cuestan 200
      if (i <= 3) {
        precioCita = 200;
      }
      // Las siguientes dos citas cuestan 150
      else if (i <= 5) {
        precioCita = 150;
      }
      // Las siguientes tres citas cuestan 100
      else if (i <= 8) {
        precioCita = 100;
      }
      // Las siguientes citas cuestan 50
      else {
        precioCita = 50;
      }

      // Paso 3: Sumar el precio de la cita al total pagado
      pagado += precioCita;
    }
    // Paso 4: Mostrar el precio de la última cita y el total pagado por todas
    System.out.println("Precio por la cita " + cita + ": " + precioCita + " $");
    System.out.println("Total pagado por el tratamiento: " + pagado + " $");
  }
}