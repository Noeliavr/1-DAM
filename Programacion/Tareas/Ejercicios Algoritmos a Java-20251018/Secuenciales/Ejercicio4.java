/*
 * Área círculo
 * Lectura BufferedReader
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //el nº PI lo podemos declarar como constante o usar la clase Math
        //en este ejercicio lo declararemos como constante
        final double PI = 3.1416;

        System.out.println("Radio circunferencia: ");
        double radio = Double.parseDouble(bf.readLine());

        double area = PI * radio * radio;

        System.out.println("Área: " + area);

    }
}
