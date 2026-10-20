/* Ejercicio7

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:2/11/2025
    Autor: Alfonso Sevillano


 */
import java.util.Arrays;
public class EjercicioArrays7 {
    public static void main(String[] args) {
        int [] vector =  {2, 3, 4, 7, 8, 10, 11};
        int [] vectorIntercalado = new int[vector.length*2];

        int contadorIntercalado = 0;

        for (int i = 0; i<vector.length; i++) {
                vectorIntercalado [contadorIntercalado] = vector [i];
                contadorIntercalado++;
                vectorIntercalado [contadorIntercalado] = 0;
                contadorIntercalado++;        
        }
        System.out.print (Arrays.toString(vectorIntercalado));
    }

}
