  /* Ejercicio4

 * Dado el array numerosEnteros = {7, 5, 6, 14, 2, 4, 89, 9, 55}, que tiene un número impar de elementos, obtén dos arrays más la primera mitad en uno, la segunda mitad en otro y el elemento central no debe estar en ninguno de ambos. Muestra el array original y los dos arrays nuevos, después multiplica todos los elementos de los arrays nuevos por el elemento central del primero y vuelve a mostrar los tres arrays: el original sin modificar y los dos nuevos con sus valores actualizados por esa operación.
    Fecha:5/11/2025
    Autor: Alfonso Sevillano

 */

public class Arrays2Ej4 {
  public static void main(String[] args) {
        int[] arrayOriginal={7,5,6,14,2,4,89,9,55};
// PREGUNTAR POR QUE HAY 0 EN CLASE!!
        int[] arrayA=new int[5];
        int[] arrayB=new int[5];
        for(int i=0; i<4;i++)
        arrayA[i]=arrayOriginal[i];
        for (int i=4; i<10;i++)
        arrayB[i-5]=arrayOriginal[i];
      System.out.println("Primeros cuatro elementos:");
    for (int num : arrayA) {
      System.out.print(num + " ");
    }

    System.out.println("\nSegundos cuatro elementos:");
    for (int num : arrayB) {
      System.out.print(num + " ");
    }
 
     }
}


