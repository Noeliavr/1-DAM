/*
 * Ejercicio6String4
 * 
 * En cualquier frase sustituir las primeras tres letras ‘a’ por tres asteriscos. Probarlo con la frase “Esta es la frase en la que vamos a probar”.
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio6String4 {
  public static void main(String[] args) {
    String frase = "Esta es la frase en la que vamos a probar";
    String nuevaFrase = "";
    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {
      char caracter = frase.charAt(i);
      if (caracter == 'a' && contador < 3) {
        nuevaFrase += "***";
        contador++;
      } else {
        nuevaFrase += caracter;
      }
    }

    System.out.println("Frase original: " + frase);
    System.out.println("Frase modificada: " + nuevaFrase);
  }
}