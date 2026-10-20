package laboratoriogestionexcepciones.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej3_Indice_Seguro_v1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nombres = {"Juan", "Luis", "Marta", "Pepe", "Susana"};
        boolean ok = false;
        boolean posicionValida = false;
        int indiceArray = 0;
        int indicePalabra = 0;
        do {
            try {
                System.out.print("Indice (0-4):");
                indiceArray = Integer.parseInt(br.readLine());

                do {
                    try {
                        System.out.print(
                                "Posicion del nombre " + nombres[indiceArray] + " (0.." + nombres[indiceArray].length()
                                + "):");
                        indicePalabra = Integer.parseInt(br.readLine());
                        System.out.println("La letra es: " + nombres[indiceArray].charAt(indicePalabra));
                        posicionValida = true;
                    } catch (StringIndexOutOfBoundsException sr) {
                        System.out.println("Error: índice debe estar entre 0 y " + nombres[indiceArray].length());

                    }
                } while (!posicionValida);

                ok = true;

            } catch (NumberFormatException e) {
                System.out.println("Error: el índice debe ser nº entero");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out
                        .println("Error: el índice debe estar entre 0 y " + (nombres.length - 1) + " ambos inclusive");
            }
        } while (!ok);

        br.close();
    }

}
