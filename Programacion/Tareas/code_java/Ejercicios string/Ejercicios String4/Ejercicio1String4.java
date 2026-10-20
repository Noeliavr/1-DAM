/*
 * Ejercicio1String4
 * 
 * Partir una frase en dos. A continuación partir cada una de las dos mitades en otras dos. Mostrar las cuatro partes. (Si en cualquier división el número es impar la segunda mitad tendrá un carácter más). Probarlo con “Esta es la frase que vamos a partir en cuatro”
 * 
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio1String4 {

  public static void main(String[] args) {
    String frase = "Esta es la frase que vamos a partir en cuatro";

    // Primera división
    int mitad1 = frase.length() / 2;
    if (frase.length() % 2 != 0) {
      mitad1++; // Si es impar, la segunda mitad tendrá un carácter más
    }
    String primeraMitad = frase.substring(0, mitad1);
    String segundaMitad = frase.substring(mitad1);

    // Segunda división de la primera mitad
    int mitad2 = primeraMitad.length() / 2;
    if (primeraMitad.length() % 2 != 0) {
      mitad2++; // Si es impar, la segunda mitad tendrá un carácter más
    }
    String parte1 = primeraMitad.substring(0, mitad2);
    String parte2 = primeraMitad.substring(mitad2);

    // Segunda división de la segunda mitad
    int mitad3 = segundaMitad.length() / 2;
    if (segundaMitad.length() % 2 != 0) {
      mitad3++; // Si es impar, la segunda mitad tendrá un carácter más
    }
    String parte3 = segundaMitad.substring(0, mitad3);
    String parte4 = segundaMitad.substring(mitad3);

    // Mostrar las cuatro partes
    System.out.println("Parte 1: " + parte1);
    System.out.println("Parte 2: " + parte2);
    System.out.println("Parte 3: " + parte3);
    System.out.println("Parte 4: " + parte4);
  }
}