/*
 * Ejercicio3String4
 * 
 * 
 * Obtener en qué posición está la cuarta ‘a’ en una frase. Si la frase tiene menos de 4 aes tiene que indicarlo. “Probarlo con “Esta es una frase con unas cuantas aes”
 * 
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio3String4 {
  public static void main(String[] args) {
    String frase = "Esta es una frase con unas cuantas aes";
    int contador = 0;
    int posicion = -1;

    for (int i = 0; i < frase.length(); i++) {
      if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
        contador++;
        if (contador == 4) {
          posicion = i;
          break;
        }
      }
    }

    if (posicion != -1) {
      System.out.println("La cuarta 'a' está en la posición: " + posicion);
    } else {
      System.out.println("La frase tiene menos de 4 'a's.");
    }
  }
}