package laboratoriogestionexcepciones.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nombres = {"Carmen", "Juan", "Alfonso", "Julia", "Fermin"};
        boolean bien = false;
        do {
            System.out.println("Indique un numero del 0 al 4: ");
            try {
                int opcion = Integer.parseInt(br.readLine());
                System.out.println("El nombre es: " + nombres[opcion]);

            } catch (NumberFormatException nfe) {
                System.out.println("Indique un numero entero");
            } catch (ArrayIndexOutOfBoundsException aobe) {
                System.out.println("Indique un numero dentro del array");
            }

        } while (!bien);
        br.close();
    }

}
