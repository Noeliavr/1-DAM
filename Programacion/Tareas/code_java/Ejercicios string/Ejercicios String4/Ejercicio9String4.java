/*
 * Ejercicio9String4
 * 
 * En un String con cualquier número de letras ‘a’ convertir una en mayúsculas y la siguiente dejarla como está, la siguiente en mayúsculas y la siguiente dejarla… etc… Probarlo con “Esta es una frase con algunas letras a”.
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio9String4 {
  public static void main(String[] args) {
    String frase = "Esta es una frase con algunas letras a";
    StringBuilder resultado = new StringBuilder();
    int contadorA = 0;

    for (int i = 0; i < frase.length(); i++) {
      char caracter = frase.charAt(i);
      if (caracter == 'a' || caracter == 'A') {
        contadorA++;
        if (contadorA % 2 != 0) {
          resultado.append(Character.toUpperCase(caracter));
        } else {
          resultado.append(caracter);
        }
      } else {
        resultado.append(caracter);
      }
    }

    System.out.println("Frase original: " + frase);
    System.out.println("Frase modificada: " + resultado.toString());
  }
}