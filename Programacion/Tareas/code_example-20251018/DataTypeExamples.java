/*
 * Fecha: 02/10/24
 * Autor: RLR
 * Descripción: este fichero mostrará los diferentes tipos de datos disponibles en Java
 * con ejemplos
 * 
 */

public class DataTypeExamples {
    public static void main(String[] args) {
        
        /********************************************************************************
         * 
         *                            TIPOS DATOS PRIMITIVOS EN JAVA
         * 
         **********************************************************************************/
     

        //1.byte : disponemos de 8 bits, con signo. Nums enteros -128 al 127
        byte byteVar = 100; //si pongo el valor 300 da error
        System.out.println("Valor de byteVar: " + byteVar);

        //2.short: disponemos de 16 bits, con signo. Nums: -32.768 a 32.767
        short shortVar = 3000;
        System.out.println("Valor de shortVar: " + shortVar);
        
        //3. int: disponemos de 32 bits con signo. Nums : -2^31 al 2^31-1
        int intVar = 5000000;
        System.out.println("Valor de intVar: " + intVar);

        //4. long: disponemos de 64 bits con signo. Nums: -2^63 al 2^63-1
        long longVar = 150000000000000L; //se incorpora una 'L' para especificar que es long
        System.out.println("Valor de longVar: " + longVar);

        //5. float: números en coma flotante, disponemos de 32 bits. Precisión de 6/7 dígitos decimales
        float floatVar = 5.75f; //agregamos 'f' para indicar float
        System.out.println("Valor de floatVar: " + floatVar);

        //6. double: números en coma flotante, disponemos de 64 bits. Precisión de hasta 15 dígitos decimales
        double doubleVar = 3434.4545;
        System.out.println("Valor de doubleVar: " + doubleVar);

        //7. char: un solo caracter. 
        char charVar ='A';
        System.out.println("Valor de charVar: " + charVar);

        //8.boolean: dos valores TRUE o FALSE
        boolean boolVar = true;
        System.out.println("Valor de boolVar: " + boolVar);



        /********************************************************************************
         * 
         *                           TIPOS DATOS NO PRIMITIVOS (REFERENCIALES)
         * 
         **********************************************************************************/

        //9. String: es una clase Java que representa una secuenca de caracteres
        String stringVar = "esto es un ejemplo de string";
        System.out.println("Valor de stringVar: " + stringVar);





    }

}
