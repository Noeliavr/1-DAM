/*
 * Ejercicio8String3
 * 
 * Hacer un programa que cuente el número de veces que aparece la letra ‘e’ (mayúscula o minúscula). Probarlo con la frase “Este ejercicio es el primero de cuenta de letras”.
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio8String3 {
  public static void main(String[] args) {
    String frase = "Este ejercicio es el primero de cuenta de letras";
    int contador = 0;

    for (int i = 0; i < frase.length(); i++) {
      char letra = frase.charAt(i);
      if (letra == 'e' || letra == 'E') {
        contador++;
      }
    }

    System.out.println("La letra 'e' aparece " + contador + " veces.");
  }
}