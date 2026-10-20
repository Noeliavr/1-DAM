import java.util.Scanner;

public class Ejercicio1mientras {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double resultado = 0;
    int contador = 0;
    System.out.print("Escribe las 10 cantidades");
    while (contador < 10) {
      contador++;
      System.out.print("Escribe un numero");
      double num = scanner.nextDouble();
      resultado += num;

    }
    scanner.close();
    System.out.println("La suma total es: " + resultado);
  }
}
