
/*Ejercicios array 1
 * obtener la suma de los elementos del siguiente array{1, 4, 6, 10, -3, 4, 6,-5}
 */
import java.util.Arrays;

public class Ejercicio3array {

    public static void main(String[] args) {
        int[] vector = { 1, 4, 6, 10, -3, 4, 6, -5 };
        int suma = 0;
        int posicion = 0;

        for (posicion = 0; posicion < vector.length; posicion++) {
            suma = suma + vector[posicion];
        }
        System.out.println("La suma total de " + Arrays.toString(vector) + " es: " + suma);

    }
}