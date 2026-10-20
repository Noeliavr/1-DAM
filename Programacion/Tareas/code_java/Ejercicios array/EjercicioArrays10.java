/* Ejercicio10

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:4/11/2025
    Autor: Alfonso Sevillano
 */
import java.util.Arrays;
import java.util.Vector;
public class EjercicioArrays10 {
    public static void main(String[] args) {
        char[]  vectorChar={'p','a','l','a','b','r','a'};
        String cadena="";
        //otra opcion es: String cadena= String.valueof(vectorChar)
        for (int posicion=0; posicion<vectorChar.length;posicion++){
            cadena=cadena+vectorChar[posicion];
        }
        System.out.print("La cadena es "+ cadena);
        System.out.print(" y de tipo "+ cadena.getClass().getTypeName()); // para mostrar el tipo de dato
    }
}

