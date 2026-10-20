/*
 * Fecha: octubre 25
 * Ejercicios secuenciales
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public record Ejercicio2() {
    public static void main(String[] args) throws IOException {
        //Creamos objeto BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //pedimos notas
        System.out.print("Nota 1: ");
        double nota1 = Double.parseDouble(br.readLine());
        
        System.out.print("Nota 2: ");
        double nota2 = Double.parseDouble(br.readLine());
        
        System.out.print("Nota 3: ");
        double nota3 = Double.parseDouble(br.readLine());
        
        System.out.print("Nota 4: ");
        double nota4 = Double.parseDouble(br.readLine());
        
        //calculamos la media de notas
        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("La media es " + media);

        //aunque con BuffererdReader no pasa nada si no se cierra
        br.close();
    }
}
