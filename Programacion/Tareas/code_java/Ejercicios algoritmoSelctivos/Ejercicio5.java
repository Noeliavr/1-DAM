import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Pedir los tres números
    System.out.print("Instroduce el numero 1: ");
    double numero1 = scanner.nextDouble();
    System.out.print("Introduce el numero 2: ");
    double numero2 = scanner.nextDouble();
    System.out.print("Introduce el numero 3: ");
    double numero3 = scanner.nextDouble();

    // Paso 2: Determinar el número más grande e imprimirlo
    if (numero1 > numero2 && numero1 > numero3) {
      System.out.println(numero1 + " Es el número más grande");
    } else if (numero2 > numero1 && numero2 > numero3) {
      System.out.println(numero2 + " Es el número más grande");
    } else if (numero3 > numero1 && numero3 > numero2) {
      System.out.println(numero3 + " Es el número más grande");
    } else if (numero1 == numero2 && numero1 > numero3) {
      System.out.println(numero1 + "y" + numero2 + " Son iguales y " + numero3 + " Es más pequeño");
    } else if (numero2 > numero1 && numero2 == numero3) {
      System.out.println(numero2 + "y" + numero3 + " Son iguales y " + numero1 + " Es más pequeño");
    } else if (numero3 == numero1 && numero3 > numero2) {
      System.out.println(numero1 + "y" + numero3 + " Son iguales y " + numero2 + " Es más pequeño");
    } else {
      System.out.println("Todos son iguales");
    }
  }
}