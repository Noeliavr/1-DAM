/*
 * Fecha: 2/10/24
 * Autor: RLR
 * Ejemplo de cómo leer datos por consola con la clase Scanner
 * 
 */

import java.util.Scanner; //importamos la clase para poder usarla

public class LeerDatosScanner {

    public static void main(String[] args) {

        int entero;
        double decimal;
        String cadena;

        //Creamos un objeto Scanner para poder leer
        Scanner scanner = new Scanner (System.in);

        //Ejemplo de leer un dato entero
        System.out.print("Escribe num entero: ");
        entero = scanner.nextInt();

        //Ejemplo de leer un número double
        System.out.print("Escribe num decimal: ");
        decimal = scanner.nextDouble();
        System.out.println (" Has escrito los numeros: " + entero + " y " + decimal);

        /***********************************************************
            ojo uso de scanner suele dar problemas cuando estamos
            leyendo datos de distinto tipo 
            pasamos de leer datos numéricos a cadenas hay que limpiar leyendo
            una linea 
         */
        scanner.nextLine(); //leemos una línea para capturar ese salto
        //si quitamos la línea anterior NO TE DEJERÁ ESCRIBIR LA CADENA
        //**************************************************************** */
        
        //Ejemplo de leer un dato cadena
        System.out.print("Escribe cualquier cadena: ");
        cadena = scanner.nextLine();

        System.out.println (" Has escrito la cadena o mensaje " + cadena);


        //Cuando dejemos de leer datos cerramos el objeto
        scanner.close();
        



        
    }
}
