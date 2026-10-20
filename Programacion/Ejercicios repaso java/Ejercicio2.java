import java.util.Scanner;
public class Ejercicio2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Pedir un número entero
    System.out.print("Dime un número entero: ");
    int numero = scanner.nextInt();
    // Mostrar si el número es positivo, negativo o cero

    if (numero > 0) {
      System.out.println("El número es positivo.");
    } else if (numero < 0) {
      System.out.println("El número es negativo.");
    } else {
      System.out.println("El número es cero.");
    }
  }
}