import java.util.Scanner; // importa Scanner para leer desde el teclado

public class Ejercicio2 { // declara la clase pública
  public static void main(String[] args) { // método principal, punto de entrada
    Scanner scanner = new Scanner(System.in);

    // Paso 1: Pedir al usuario el número del cual quiere ver la tabla de
    // multiplicar
    System.out.print("Introduce un número: ");
    int numero = scanner.nextInt();

    // Paso 2: Usar un bucle for para mostrar la tabla de multiplicar del número del
    // 0 al 10
    System.out.println("Tabla de multiplicar del " + numero + ":");
    for (int i = 0; i <= 10; i++) {
      // En cada vuelta, calcular el resultado de multiplicar el número por i
      int resultado = numero * i;
      System.out.println(numero + "x" + i + "=" + resultado);
    }
  }
}