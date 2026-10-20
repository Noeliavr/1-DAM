import java.util.Scanner;

public class Ejercicio3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Pedir al usuario su nombre
    System.out.print("¿Cómo te llamas?: ");
    String nombre = scanner.nextLine();

    // Paso 2: Pedir al usuario cuántas veces quiere ser saludado
    System.out.print("¿Cuántas veces quieres que te salude?: ");
    int veces = scanner.nextInt();

    // Paso 3: Bucle para mostrar el saludo las veces indicadas
    for (int i = 1; i <= veces; i++) {
      System.out.println("Hola " + nombre);
    }
  }
}