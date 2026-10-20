/*Ejercicio4
 * Imprimir en pantalla los elementos del siguiente arra{2,3,4,7,8,10,11}
 * indicando para cada uno de ellos si es par o impar
 * 
 * fecha: 4/11/2025
 * Autor: Noelia
 * 
 */

public class Ejercicio4array {

    public static void main(String[] args) {
        // declaración variables
        int[] vector = { 2, 3, 4, 7, 8, 10, 11 };

        // recorrer los elementos del vector y comparar si es par/impar
        for (int posicion = 0; posicion < vector.length; posicion++) {
            System.out.println(vector[posicion] + " ");
            if (vector[posicion] % 2 == 0) // si par
                System.out.println("Par");
            else
                System.out.println("Impar");
        }
    }
}