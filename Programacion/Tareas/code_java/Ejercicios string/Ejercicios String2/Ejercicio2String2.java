/*
 * Ejercicio2String2.java
 * 
 * Dada la frase del ejercicio 1, obtener un String con la misma frase, pero donde los caracteres de las posiciones pares sean mayúsculas y los caracteres de las posiciones impares minúsculas. Los espacios también cuentan como posición y se toma el carácter 0 como posición par.
 * 
 * fecha: 05/11/2025
 * Autor: Noelia Velardo
 */

public class Ejercicio2String2 {
  public static void main(String[] args) {
    String frase = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme...";
    StringBuilder fraseModificada = new StringBuilder();

    for (int i = 0; i < frase.length(); i++) {
      char caracter = frase.charAt(i);
      if (i % 2 == 0) {
        fraseModificada.append(Character.toUpperCase(caracter));
      } else {
        fraseModificada.append(Character.toLowerCase(caracter));
      }
    }

    System.out.println("Frase original: " + frase);
    System.out.println("Frase modificada: " + fraseModificada.toString());
  }
}