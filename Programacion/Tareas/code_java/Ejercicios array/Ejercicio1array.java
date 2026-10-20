/*
 * Dado  estos dos arrays:
 * {1,3,5,7,8} 
 * {1,2,3,4,5}
 * 
 * obtener el array resultado de la suma de ambos (suma de elementos de la misma posicion).
 */

import java.util.Arrays;

public class Ejercicio1array {

    public static void main(String[] args) {
        int[] vectorA = { 1, 3, 5, 7, 8 };
        int[] vectorB = { 1, 2, 3, 4, 5 };
        int[] vectorSuma = new int[vectorA.length]; // dimensiono el vector resultado con el tamaño de uno de los
                                                    // vectores

        // realizamos la suma elemento a elemento
        for (int posicion = 0; posicion < vectorA.length; posicion++) {
            vectorSuma[posicion] = vectorA[posicion] + vectorB[posicion];
            System.out.println("La suma en la posicion " + posicion + " es: " + vectorSuma[posicion]);
        }

        // mostramos el vector resultado
        System.out.println("El vector resultado de la suma es: " + Arrays.toString(vectorSuma));

    }
}