/*
 * Fecha: 01/10/24
 * Autor: RLR
 * Descripción: pedir dos nums al usuario y mostrar +, -, * y /
 */

import java.io.*;


public class CalculadoraBasica {
    public static void main(String[] args) throws IOException{

        BufferedReader buffer = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("nº1: ");
        double num1 = Double.parseDouble(buffer.readLine());

        System.out.print("nº1: ");
        double num2 = Double.parseDouble(buffer.readLine());

        double resta, multiplicacion, division, suma;

        suma = num1+num2;
        resta= num1-num2;
        multiplicacion = num1* num2;
        division = num1/num2;

        System.out.println("Resultado");
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division); //ojo cuando num2 sea 0 habría que comprobarlo

        // Otra opción sería 'ahorrar' las 4 variables y hacer el 
        // cálculo de la operación al mismo tiempo que se muestra

        System.out.println("Resultado");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); //ojo cuando num2 sea 0 habría que comprobarlo


    }
    
}
