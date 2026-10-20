
/* Ejercicio4

* Dado el array numeros = {34, 12, 7, 2, 4, 1, 5} ordenarlo de menor a mayor. Sacar por pantalla el array antes y después de la ordenación sin sort.
  Fecha:5/11/2025
  Autor: Alfonso Sevillano

*/
import java.util.Arrays;

public class Arrays2Ej5copia {
  public static void main(String[] args) {
    int[] numeros = { 34, 12, 7, 2, 4, 1, 5 };
    System.out.println("Array original:");
    for (int num : numeros) {
      System.out.print(num + " ");
    }
    // Ordenación manual
    for (int i = 0; i < numeros.length - 1; i++) {
      for (int j = 0; j < numeros.length - 1 - i; j++) {
        if (numeros[j] > numeros[j + 1]) {
          
          // Intercambiar
          int temp = numeros[j];
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = temp;
        }
      }
    }
    System.out.println("\nArray ordenado:");
    for (int num : numeros) {
      System.out.print(num + " ");
    }
  }
}
