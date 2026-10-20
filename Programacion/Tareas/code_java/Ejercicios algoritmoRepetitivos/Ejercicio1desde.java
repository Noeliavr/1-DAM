import java.util.Scanner;

public class Ejercicio1desde {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, suma, contador;
    System.out.print("Introduce el valor de N");
    n = scanner.nextInt();
    suma = 0;
    for (contador = 1; contador <= n; contador++)
      ;
    suma = suma + contador;
    System.out.println("La suma es" + suma);
    scanner.close();
  }
}
