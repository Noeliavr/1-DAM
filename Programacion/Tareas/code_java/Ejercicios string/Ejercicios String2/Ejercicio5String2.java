/*
 * Ejercicio5String2
 * 
 * En el String “El dipuTAdo dijo: el muy hijo de puta está imPUtado por la amputación de una PUta oreja” sustituye todas las apariciones de la palabra malsonante “puta” por “****” sin afectar al resto de la frase.
 * 
 * Fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */

public class Ejercicio5String2 {
  public static void main(String[] args) {
    String frase = "El dipuTAdo dijo: el muy hijo de puta está imPUtado por la amputación de una PUta oreja";
    String fraseModificada = frase.replaceAll("puta", "****");
    System.out.println(fraseModificada);
  }
}