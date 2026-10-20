/*
 * Ejercicio2String4
 * 
 * En cualquier frase sustituir todas las posiciones múltiplos de 3 por ‘#’. Probarlo con “Esta es la frase donde vamos a poner almohadillas”
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio2String4 {
  public static void main(String[] args) {
    String frase = "Esta es la frase donde vamos a poner almohadillas";
    StringBuilder fraseModificada = new StringBuilder(frase);

    for (int i = 0; i < fraseModificada.length(); i++) {
      if (i % 3 == 0) {
        fraseModificada.setCharAt(i, '#');
      }
    }

    System.out.println("Frase original: " + frase);
    System.out.println("Frase modificada: " + fraseModificada.toString());
  }
}