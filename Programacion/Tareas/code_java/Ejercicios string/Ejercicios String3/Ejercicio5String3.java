/*
 * Ejercicio5String3
 * 
 * Coger cualquier frase y hacer un programa que muestre línea por línea cada letra de la frase exceptuando los espacios. Probarlo con “Esta es la frase del ejercicio 5”.
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio5String3 {
  public static void main(String[] args) {
    String frase = "Esta es la frase del ejercicio 5";

    for (int i = 0; i < frase.length(); i++) {
      char letra = frase.charAt(i);
      if (letra != ' ') {
        System.out.println(letra);
      }
    }
  }
}