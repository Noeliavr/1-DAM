/* Ejercicio2

 * Dado el siguiente array de 8 enteros [3, 2, 4, 4, 5, 6, 7, 9] obtener dos arrays,
uno con los primeros 4 elementos y otro con los segundos 4 elementos.
    Fecha:4/11/2025
    Autor: Alfonso Sevillano

 */
public class Arrays2Ej2 {
    public static void main(String[] args) {
        int[] arrayOriginal={3,2,4,4,5,6,7,9};

        int[] arrayA=new int[4];
        int[] arrayB=new int[4];
        for(int i=0; i<4;i++)
        arrayA[i]=arrayOriginal[i];
        for (int i=4; i<8;i++)
        arrayB[i-4]=arrayOriginal[i];
      System.out.println("Primeros cuatro elementos:");
    for (int num : arrayA) {
      System.out.print(num + " ");
    }
    System.out.println("\nSegundos cuatro elementos:");
    for (int num : arrayB) {
      System.out.print(num + " ");
    }
 
     }
}
