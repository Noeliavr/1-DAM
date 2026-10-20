import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // pedir un número hasta que sea 0 y hacer la suma de los números introducidos
    // con un bucle while
    int numero;
    int suma = 0;
    do {
      System.out.print("Dime un número (0 para salir): ");
      numero = scanner.nextInt();
      suma += numero;
    } while (numero != 0);
    System.out.println("La suma de los números introducidos es: " + suma);
  }
}