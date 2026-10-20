/*
 * Ejercicio8String4
 * 
 * En cualquier frase sustituir las últimas tres letras ‘a’ por tres asteriscos. Probarlo con la frase “Esta es la frase en la que vamos a probar”.
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio8String4 {
  public static void main(String[] args) {
    String frase = "Esta es la frase en la que vamos a probar";

    // Contar cuántas 'a' hay en la frase
    int countA = 0;
    for (int i = 0; i < frase.length(); i++) {
      if (frase.charAt(i) == 'a') {
        countA++;
      }
    }

    // Si hay menos de 3 'a', no hacer nada
    if (countA < 3) {
      System.out.println(frase);
      return;
    }

    // Reemplazar las últimas tres 'a' por asteriscos
    StringBuilder resultado = new StringBuilder(frase);
    int replaced = 0;
    for (int i = frase.length() - 1; i >= 0; i--) {
      if (frase.charAt(i) == 'a') {
        resultado.setCharAt(i, '*');
        replaced++;
        if (replaced == 3) {
          break;
        }
      }
    }

    System.out.println(resultado.toString());
  }
}