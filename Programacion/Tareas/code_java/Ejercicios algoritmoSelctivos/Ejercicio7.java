import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Crear variables
    String tipo;
    int tamaño;
    double ganancia, precio_inicial;

    // Paso 2: Determinar el precio inicial, el tipo de uva y el tamaño

    System.out.print("Introduce el precio inicial: ");
    precio_inicial = scanner.nextDouble();

    scanner.nextLine();

    System.out.print("Introduce el tipo de uva (A o B): ");
    tipo = scanner.nextLine();

    System.out.print("Introduce el tamaño de la uva (1 o 2): ");
    tamaño = scanner.nextInt();

    // Paso 3: Calcular todo lo necesario, usando .equals
    // porque usar == en un string hace que no funcione

    if (tipo.equals("A") && tamaño == 1) {
      ganancia = precio_inicial + 0.20;
      System.out.println("La ganancia obtenida es: " + ganancia);
    } else if (tipo.equals("A") && tamaño == 2) {
      ganancia = precio_inicial + 0.30;
      System.out.println("La ganancia obtenida es: " + ganancia);

    } else if (tipo.equals("B") && tamaño == 1) {
      ganancia = precio_inicial - 0.30;
      System.out.println("La ganancia obtenida es: " + ganancia);

    } else if (tipo.equals("B") && tamaño == 2) {
      ganancia = precio_inicial - 0.50;
      System.out.println("La ganancia obtenida es: " + ganancia);

    } else {
      System.out.println("Tipo o tamaño invalido");
    }
  }
}