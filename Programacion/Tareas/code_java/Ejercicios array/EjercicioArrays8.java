/* Ejercicio8

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:2/11/2025
    Autor: Alfonso Sevillano


 */

import java.util.Arrays;

public class EjercicioArrays8 {
    public static void main(String[] args) {
        int [] vector = {2, 3, 4, 7, 8};
        int [] vectorMultiplicado = new int[vector.length];

        int posicion = 0;
        int elevado = 1;

        for (int i = 0; i<vector.length; i++) {
            vectorMultiplicado[posicion] = vector [i] * (10*elevado);
            posicion++;
            elevado = elevado * 10;
        }

        System.out.print (Arrays.toString(vectorMultiplicado));

    }

}
