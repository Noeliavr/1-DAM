/*
    3 5 2 8 9
    Algoritmo de la burbuja
    -Compara elementos consecutivos
    - estan en el orden consecutivos
    si estan en malorden los 


*/
import java.util.Arrays;
public class AlgoritmoBurbuja {
    





public static void ordenarBurbuja (int[] numeros){
    int auxiliar;
    //Recorremos los elementos del vector
    for (int i=0;i<numeros.length;i++){
        //En cada pasada comparamos elementos consecutivos
        for(int j=0;j<numeros.length-1;j++){
            //Comparamos
            if (numeros[j]>numeros[i]){ //El elemento actual es mayor que el si
                auxiliar=numeros[j];
                numeros[j]=numeros[j+1];
                numeros[j+1]=auxiliar;
            }
        }
    }
}


/*
    Algoritmo de Seleccion
    -Busca el menor elemento y lo coloca en la primera posicion
    - Repite esto con el resto 
    - Hace menos intercambios 
    -poco eficiente
 */ 
        public static void main(String[] args){
            int[] numeros={3,5,2,8,9};
            System.out.println("numeros originales:"+ Arrays.toString(numeros));
            ordenarBurbuja(numeros);
            System.out.println("Arrays ordenados: "+ Arrays.toString(numeros));

        }
                                



        public static void ordenarSeleccion (int[]numeros){
        int posicionMenor;
        //for de las pasadas por cada elemento excepto el ultimo
        for (int i=0; i<numeros.length;i++){
            //Suponemos el menor elemento esta en la posicion inicial
            posicionMenor=i;
            for (int j=i+1;j<numeros.length;j++){
                if(numeros[j]<numeros[posicionMenor]){
                posicionMenor=j;
                }
            }
            //Intercambiamos el elemento actual con el menor encontrado
            

        }
        }
}

