
/*
 * Ejercicio10String3
 * 
 * Capturamos una frase por teclado y queremos que todas las vocales aparezcan en mayúsculas.
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
import java.util.Scanner;

public class Ejercicio10String3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = scanner.nextLine();

    StringBuilder resultado = new StringBuilder();

    for (int i = 0; i < frase.length(); i++) {
      char letra = frase.charAt(i);
      if ("aeiouáéíóúAEIOUÁÉÍÓÚ".indexOf(letra) != -1) {
        resultado.append(Character.toUpperCase(letra));
      } else {
        resultado.append(letra);
      }
    }

    System.out.println("Frase con vocales en mayúsculas: " + resultado.toString());

    scanner.close();
  }
}