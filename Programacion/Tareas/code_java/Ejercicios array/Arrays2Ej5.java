  /* Ejercicio4

 * Dado el array numeros = {34, 12, 7, 2, 4, 1, 5} ordenarlo de menor a mayor. Sacar por pantalla el array antes y después de la ordenación.
    Fecha:5/11/2025
    Autor: Alfonso Sevillano

 */

import java.util.Arrays;
public class Arrays2Ej5 {
    public static void main(String[] args) {

        
        int[] numeros={34,12,7,2,4,1,5};
        System.out.println("el array es: "+Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("el array ordenado de menor a mayor es: "+ Arrays.toString(numeros));

 }
        
        
    
}
