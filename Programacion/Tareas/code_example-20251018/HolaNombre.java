/*
    Fecha: 30/09/2024
    Autor: RLR
    Descripción: Programa en el que pedimos el nombre al usuario y le saludamos
    Objetivo: leer una variable cadena por consola

*/
import java.io.*;

    
public class HolaNombre{

    public static void main (String[] argumentos) throws IOException{

        // Parte declarativa
        String nombre; //variable que guardará el nombre que pedimos usuario
        BufferedReader lector = new BufferedReader (new InputStreamReader (System.in));
        
       
        // Parte principal

        
        System.out.print ("Escriba su nombre, por favor: ");

        nombre  = lector.readLine(); // readLine leerá una línea del buffer COMO TEXTO

        System.out.println ("Hola " + nombre +  " bienvenido a Java"); //el operador + con Stirngs une o concatena cadenas
        System.out.printf ("Hola ", nombre, " bienvenido a Java"); //ojo de momento usaremos print no printf (que es el que acepta la coma para separar el literal de la vble)
        

    
    } //fin main


}//fin de la clase