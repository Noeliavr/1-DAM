/*
    Fecha: 30/09/2024
    Autor: RLR
    Descripción: programa que pide la edad, la estatura y el nombre del usuario
    Objetivo: leer por consola un dato entero, decimal y una cadena


*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeerDatosBuffered {
    public static void main (String[] args) throws IOException{        
        //parte declarativa
        String nombre; //variable tipo String para guardar el nombre del usuario
        int edad;      //variable de tipo primitivo para guardar la edad
        double estatura; //variable de tipo decimal para guardar la estatura

        BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));

        //parte principal

        //pedimos el nombre al usuario
        System.out.print("Nombre: ");
        nombre = buffer.readLine(); //esta línea lanza una IOException, la tengo que capturar en el main throws IOException 

        //pedimos la edad al usuario
        System.out.print("Edad: ");
        edad = Integer.parseInt(buffer.readLine());

        //pedimos la altura al usuario
        System.out.print("Altura: ");
        estatura = Double.parseDouble(buffer.readLine());
        
        //mostramos el mensaje de salida 
        System.out.println(" Hola " + nombre + " tienes " + edad + " años" +
                            " y mides " + estatura);



    }


}