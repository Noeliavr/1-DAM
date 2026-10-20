/* Ejercicio4

* Dado el array numerosEnteros = {7, 5, 6, 14, 2, 4, 89, 9, 55}, que tiene un número impar de elementos, obtén dos arrays más la primera mitad en uno, la segunda mitad en otro y el elemento central no debe estar en ninguno de ambos. Muestra el array original y los dos arrays nuevos, después multiplica todos los elementos de los arrays nuevos por el elemento central del primero y vuelve a mostrar los tres arrays: el original sin modificar y los dos nuevos con sus valores actualizados por esa operación.
* 
  Fecha:5/11/2025
  Autor: Noelia

*/

public class Arrays2Ej4copia {

  public static void main(String[] args) {

    int[] numerosEnteros = { 7, 5, 6, 14, 2, 4, 89, 9, 55 };
    int longitud = numerosEnteros.length;
    int mitad = longitud / 2;

    // Crear los arrays para la primera y segunda mitad
    int[] primeraMitad = new int[mitad];
    int[] segundaMitad = new int[mitad];

    // Llenar los arrays
    for (int i = 0; i < mitad; i++) {
      primeraMitad[i] = numerosEnteros[i];
      segundaMitad[i] = numerosEnteros[i + mitad + 1]; // +1 para saltar el elemento central
    }

    // Mostrar el array original
    System.out.println("Array original:");
    for (int num : numerosEnteros) {
      System.out.print(num + " ");
    }
    System.out.println();

    // Mostrar las dos mitades
    System.out.println("Primera mitad:");
    for (int num : primeraMitad) {
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.println("Segunda mitad:");
    for (int num : segundaMitad) {
      System.out.print(num + " ");
    }
    System.out.println();

    // Elemento central
    int elementoCentral = numerosEnteros[mitad];

    // Multiplicar los elementos de las mitades por el elemento central
    for (int i = 0; i < primeraMitad.length; i++) {
      primeraMitad[i] *= elementoCentral;
      segundaMitad[i] *= elementoCentral;
    }

    // Mostrar los arrays actualizados
    System.out.println("Primera mitad actualizada:");
    for (int num : primeraMitad) {
      System.out.print(num + " ");
    }
    System.out.println();

    System.out.println("Segunda mitad actualizada:");
    for (int num : segundaMitad) {
      System.out.print(num + " ");
    }
  }
}
