/* Ejercicio4

 * A partir del siguiente array {2, 3, 4, 7, 8} obtener otro donde la primera posición se
    multiplique por 10, la segunda por 100, la tercera por 1000 etc…
    Fecha:2/11/2025
    Autor: Alfonso Sevillano


 */
public class EjercicioArrays4 {
    public static void main(String[] args) {
        int[] vector = {2,3,4,7,8,10,11};

        for (int posicion=0; posicion<vector.length;posicion++ ){
            System.out.print(vector[posicion]+ " ");
            if(vector[posicion]%2==0)
            System.out.println("par");
            else
            System.out.println("impar");
        }
            
        
    }
}

