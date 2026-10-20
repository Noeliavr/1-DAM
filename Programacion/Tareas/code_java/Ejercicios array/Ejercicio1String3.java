/*
 * Ejercicio1String3
 * 
 * Obtener la suma de la longitud de estas tres palabras: “locomotora”, “camión”, “coche”.
 * 
 * 
 * Fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio1String3 {
  public static void main(String[] args) {
    String palabra1 = "locomotora";
    String palabra2 = "camión";
    String palabra3 = "coche";

    int longitudTotal = palabra1.length() + palabra2.length() + palabra3.length();

    System.out.println("La suma de la longitud de las tres palabras es: " + longitudTotal);
  }
}