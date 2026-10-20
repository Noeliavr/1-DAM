/*
 * Ejercicio7String4
 * 
 * Convertir cualquier palabra con un número impar de caracteres y de más de dos caracteres en minúsculas excepto el carácter justo del medio que será con mayúsculas. Probarlo con “TERREMOTO”.
 * 
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio7String4 {
  public static void main(String[] args) {
    String palabra = "TERREMOTO";

    if (palabra.length() > 2 && palabra.length() % 2 != 0) {
      int medio = palabra.length() / 2;
      String resultado = palabra.substring(0, medio).toLowerCase() +
          Character.toUpperCase(palabra.charAt(medio)) +
          palabra.substring(medio + 1).toLowerCase();
      System.out.println("Palabra modificada: " + resultado);
    } else {
      System.out.println("La palabra no cumple los requisitos.");
    }
  }
}