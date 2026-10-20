/* Ejercicio9

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:2/11/2025
    Autor: Alfonso Sevillano


 */
import java.util.Arrays;

public class EjercicioArrays9 {
    public static void main(String[] args) {
        double [] vector1 = {1, 3, 5, 7, 9};
        double [] vector2 = {6, 4, 2, 1, 3};

        double [] vectorFinal = new double [vector1.length];

        for (int i = 0; i<vectorFinal.length; i++) {
            vectorFinal [i] = (vector1 [i] * vector2 [i]) / 10;
        }
        System.out.print (Arrays.toString(vectorFinal));

    }

}
