/* Ejercicio6

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:2 /11/2025
    Autor: Alfonso Sevillano


 */
import java.util.Arrays;
public class EjercicioArrays6 {
    public static void main(String[] args) {
        int[] vector = {2, 3, 4, 7, 8, 10, 11};
        int[] vector_pares = new int[4];
        int[] vector_impares = new int[3];

        int contadorpares = 0;
        int contadorimpares = 0;

        for (int contador = 0; contador<vector.length; contador++) {
            if (vector[contador] % 2 == 0) {
                vector_pares [contadorpares] = vector [contador];
                contadorpares++;
            }
            else { vector_impares [contadorimpares] = vector [contador];
                contadorimpares++; }
        }

        System.out.print ("Pares" + Arrays.toString(vector_pares));

        System.out.print ("Impares" + Arrays.toString(vector_impares));

    }

}
