package laboratoriogestionexcepciones.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nombres = {"Carmen", "Juan", "Alfonso", "Julia", "Fermin"};
        boolean bien = false;
        boolean bienPal = false;
        do {
            System.out.println("Indique un numero del 0 al 4: ");
            //terminar
            try {
                int opcion = Integer.parseInt(br.readLine());
                System.out.println("El nombre es: " + nombres[opcion]);
                do {
                    System.out.print("perdon por hacerte bsjar");

                } while (!bienPal);
            } catch (NumberFormatException nfe) {
                System.out.println("Indique un numero entero");
            } catch (ArrayIndexOutOfBoundsException aobe) {
                System.out.println("Indique un numero dentro del array");
            } catch (StringIndexOutOfBoundsException sib) {
                System.out.println("indique un numero dentro de los valores:");
            }

        } while (!bien);
    }

}
