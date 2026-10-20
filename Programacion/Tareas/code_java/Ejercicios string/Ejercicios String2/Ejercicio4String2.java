/*
 * Ejercicio4String2
 * 
 * Imprimir una cuenta atrás de 15 al 0 donde en lugar de 15 imprima “Comenzamos la cuenta atrás”, en lugar del 5 “Llegando al final” y en lugar del cero imprima “¡Listo!”.
 * 
 * Fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 * 
 */
public class Ejercicio4String2 {
  public static void main(String[] args) {

    for (int i = 15; i >= 0; i--) {
      if (i == 15) {
        System.out.println("Comenzamos la cuenta atrás");
      } else if (i == 5) {
        System.out.println("Llegando al final");
      } else if (i == 0) {
        System.out.println("¡Listo!");
      } else {
        System.out.println(i);
      }
    }
  }
}