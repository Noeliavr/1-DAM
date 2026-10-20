/*
 * Fecha: 4/10/2024
 * Autor: RLR
 * Descripción: este fichero java explica el casting y muestra ejemplos de uso
 * 
 * 
 * 
 * En Java, el casting se refiere a la conversión de un tipo de dato a otro. 
 * Existen dos tipos de casting:

        * Casting implícito (automático): Ocurre cuando convertimos un tipo de dato de menor 
        precisión a uno de mayor precisión. Java realiza esta conversión automáticamente. Ejemplo: de `int` a `double`.

        * Casting explícito (manual): Ocurre cuando convertimos un tipo de dato de mayor 
        precisión a uno de menor precisión, como de double a int. Esto requiere un "casting" manual porque puede haber
        pérdida de información. Ejemplo: de `double` a `int`.



 */

public class Casting {

    public static void main(String[] args) {
    
        // Ejemplo de casting implícito (de int a double)
        int numeroEntero = 100;
        double numeroDecimal = numeroEntero;  // No se requiere cast explícito
        System.out.println("Casting implícito de int a double: " + numeroDecimal);

        // Ejemplo de casting explícito (de double a int)
        double salario = 50000.75;
        int salarioEntero = (int) salario;  // Cast explícito, puede haber pérdida de información
        System.out.println("Casting explícito de double a int: " + salarioEntero);

        // Casting explícito de float a int
        float valorFlotante = 9.99f;
        int valorEntero = (int) valorFlotante;  // Pérdida de la parte decimal
        System.out.println("Casting explícito de float a int: " + valorEntero);

        // Casting entre tipos de datos no numéricos (char a int)
        char letra = 'A';  // Los caracteres tienen un valor numérico ASCII
        int valorAscii = (int) letra;  // Cast explícito de char a int
        System.out.println("Casting de char a int (valor ASCII de 'A'): " + valorAscii);

        // Casting de int a char (de ASCII a carácter)
        int numeroAscii = 66;
        char letraB = (char) numeroAscii;  // Cast explícito de int a char
        System.out.println("Casting de int a char (valor ASCII 66): " + letraB);
        
    }
}
