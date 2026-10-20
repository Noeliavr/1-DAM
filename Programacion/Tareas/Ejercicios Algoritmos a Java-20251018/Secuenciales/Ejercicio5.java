/*
 * Ej 5 operaciones básicas
 * Lectura con Scanner
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos los dos números enteros
        System.out.print("Escriba primer nº: ");
        int num1 = sc.nextInt();
        System.out.print("Escriba segundo nº: ");
        int num2 = sc.nextInt();

        //operaciones básicas
        int suma = num1+num2;
        int resta = num1-num2;
        int producto = num1*num2;
        double division = num1/num2;
        int resto = num1%num2;

        System.out.println("----RESULTADOS---");
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("El producto es " + producto);
        System.out.println("La división es " + division); //OJO!! qué pasa num2 es cero
        System.out.println("El resto es " + resto);//OJO!! qué pasa num2 es cero

        sc.close();
    }
}
