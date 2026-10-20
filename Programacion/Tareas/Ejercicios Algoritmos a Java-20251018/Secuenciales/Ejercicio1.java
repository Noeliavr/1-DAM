/*
 * Fecha: oct 2025
 * Ejercicios secuenciales
 * 
 */

import java.util.Scanner;
public class Ejercicio1{

    public static void main (String[] args){

        //creo objeto Scanner para la lectura
        Scanner sc = new Scanner(System.in);
        //double suma, numero1, numero2;

        //Pedimos los dos números
        System.out.print("Escriba número 1: ");
        double numero1=sc.nextDouble();

        System.out.print("Escriba número 2: ");
        double numero2=sc.nextDouble();

        //Realizamos la suma y mostramos
        double suma = numero1+numero2;
        System.out.println("La suma es " + suma);

        //cierro objeto scanner
        sc.close();
    }
}