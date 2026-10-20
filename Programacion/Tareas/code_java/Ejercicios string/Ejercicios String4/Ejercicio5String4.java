/*
 * Ejercicio5String4
 * 
 * 
 * Obtener el número de palabras que hay en cualquier frase. Probarlo con “A ver cuántas palabras hay aquí.”
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */
public class Ejercicio5String4 {
  public static void main(String[] args) {
    String frase = "A ver cuántas palabras hay aquí.";
    String[] palabras = frase.trim().split("\\s+");
    int numeroDePalabras = palabras.length;
    System.out.println("Número de palabras: " + numeroDePalabras);
  }
}