/*
 * Ejercicio3String2.java
 * 
 * 
 * obtener un String donde las palabras impares queden igual, pero las pares se escriban al revés. La primera palabra es la que ocupa la posición 1.
 * 
 * fecha: 05/11/2025
 * Autor: Noelia Velardo
 * 
 */

public class Ejercicio3String2 {
  public static void main(String[] args) {
    String frase = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme...";
    String[] palabras = frase.split(" ");
    StringBuilder fraseModificada = new StringBuilder();

    for (int i = 0; i < palabras.length; i++) {
      String palabra = palabras[i];
      if ((i + 1) % 2 == 0) { // Palabra en posición par
        String palabraReversa = new StringBuilder(palabra).reverse().toString();
        fraseModificada.append(palabraReversa);
      } else { // Palabra en posición impar
        fraseModificada.append(palabra);
      }
      if (i < palabras.length - 1) {
        fraseModificada.append(" "); // Añadir espacio entre palabras
      }
    }

    System.out.println("Frase original: " + frase);
    System.out.println("Frase modificada: " + fraseModificada.toString());
  }
}