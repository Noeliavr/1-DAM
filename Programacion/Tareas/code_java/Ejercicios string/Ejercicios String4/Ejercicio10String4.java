/*
 * Ejercicio10String4
 * 
 * Dada una palabra cualquiera introducida por el usuario deducir si es o no un palíndromo. Un palíndromo es una palabra o frase que se lee igual en un sentido que en otro (por ejemplo; Ana, somos, arenera, nadan, sagas, sedes…). Si se trata de números en lugar de letras, se llama capicúa.
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

import java.util.Scanner;

public class Ejercicio10String4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce una palabra o frase: ");
    String input = s.nextLine();

    // Eliminar espacios y convertir a minúsculas
    String processedInput = input.replaceAll("\\s+", "").toLowerCase();

    // Verificar si es un palíndromo
    String reversedInput = new StringBuilder(processedInput).reverse().toString();

    if (processedInput.equals(reversedInput)) {
      System.out.println("La palabra o frase es un palíndromo.");
    } else {
      System.out.println("La palabra o frase no es un palíndromo.");
    }

    s.close();
  }
}