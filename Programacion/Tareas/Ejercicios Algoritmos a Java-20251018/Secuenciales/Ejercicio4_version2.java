/*
 * Área círculo
 * Lectura BufferedReader
 * Versión 2 usanso PI de la clase Math
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4_version2 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         

        System.out.println("Radio circunferencia: ");
        double radio = Double.parseDouble(bf.readLine());

        double area = Math.PI * radio * radio;

        System.out.println("Área: " + area);

    }
}
