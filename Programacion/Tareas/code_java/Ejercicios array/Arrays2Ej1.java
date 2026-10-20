
import java.util.Arrays;
import java.util.Arrays;

public class Arrays2Ej1 {

    public static void main(String[] args) 
    {
        String[] vector = {"coche", "casa", "avión", "tren"};
        int[] vectorA = new int[vector.length];
            int longitud;
            for (int i =0; i < vector.length;
            i++
            )
{
            longitud = vector[i].length();
                vectorA[1] = longitud;
            }

        
        System.out.println("E] vector es: " + Arrays.toString(vector));
        System.out.println("E1 vector A es: " + Arrays.toString(vectorA));

    }
}
