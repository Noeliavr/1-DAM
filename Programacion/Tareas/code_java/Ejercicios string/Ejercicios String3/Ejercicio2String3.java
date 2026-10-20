/*
 * 
 * Ejercicio2String3
 * 
 * Obtener qué tres caracteres hay en las posiciones 0, 13 y 18 de una frase. Probarlo con “En un lugar de la Mancha”
 * 
 * Fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio2String3 {
  public static void main(String[] args) {
    String frase = "En un lugar de la Mancha";

    char charPos0 = frase.charAt(0);
    char charPos13 = frase.charAt(13);
    char charPos18 = frase.charAt(18);

    System.out.println("Caracter en la posición 0: " + charPos0);
    System.out.println("Caracter en la posición 13: " + charPos13);
    System.out.println("Caracter en la posición 18: " + charPos18);
  }
}