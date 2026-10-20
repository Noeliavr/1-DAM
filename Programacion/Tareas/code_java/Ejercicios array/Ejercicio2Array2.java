/*
 * Ejercicio2Array2
 * Dado el siguiente array de 8 enteros [3, 2, 4, 4, 5, 6, 7, 9] obtener dos arrays,
 *  uno con los primeros 4 elementos y otro con los segundos 4 elementos.
 * 
 * Fecha: 04/11/2025
 * Autor: Noelia Velardo Rivas
 * 
 * 
 * No somos capaces de depurarlo, Preguntar el jueves en clase.
 */
public class Ejercicio2Array2 {
  public static void main(String[] args) {
    // Paso 1: Declaración del array original
    int[] arrayOriginal = { 3, 2, 4, 4, 5, 6, 7, 9 };

    // Paso 2: Declaración de los dos nuevos arrays
    int[] primerosCuatro = new int[4];
    int[] segundosCuatro = new int[4];

    // Paso 3: Rellenar el primer array con los primeros 4 elementos
    for (int i = 0; i < 8; i++) {
      primerosCuatro[i] = arrayOriginal[i];
      segundosCuatro[i + 4] = arrayOriginal[i];
    }

    // Paso 5: Imprimir los resultados
    System.out.println("Primeros cuatro elementos:");
    for (int num : primerosCuatro) {
      System.out.print(num + " ");
    }

    System.out.println("\nSegundos cuatro elementos:");
    for (int num : segundosCuatro) {
      System.out.print(num + " ");
    }
  }
}