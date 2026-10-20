/*
 * Fecha: 4/10/2024
 * Autor: RLR
 * Descripción: este fichero Java contiene ejemplos de cómo definir identificadores correctos en Java, 
 * así como las buenas prácticas a tener en cuenta.
 * 
 * Ent
 * 
 */
public class Identifidores {
    public static void main(String[] args) {
        

        /*------------------------------------------------------------------------------------------------------------------------------
         * Entendemos por identificador el nombre que vamos a dar a variables o constantes.
         * En Java, hay unas REGLAS que deben cumplir los identificadores, a continuación se enumeran y muestran ejemplos         * 
         * ---------------------------------------------------------------------------------------------------------------------------- /
    
         /* 1. Empieza con una letra, el carácter de subrayado (_) o el signo de dólar ($):
            El primer carácter de un identificador debe ser una letra (mayúscula o minúscula), un guion bajo (_).
            Los caracteres posteriores pueden ser letras, dígitos, guion bajo o símbolo de dólar.
            No pueden comenzar por un número        */
            // ejemplos de nombres de variables válidos:
            String nombre;
            int _contador;
            int total_ventas;
            double $precio;
            String nombreCompleto;
            
            // ejemplos de nombres NO VÁLIDOS Si queréis compilar comentar las siguientes líneas porque darán error

            /* líneas dan error:
            int 5numero;  //no pueden empezar por numero
            String nombre-completo; //no se puede usar guión medio            
            double #precio; //no se puede comenzar por almohadilla
            */

        /*            
            2. Sensible a mayúsculas y minúsculas:
            Java distingue entre mayúsculas y minúsculas, es decir, miVariable y mivariable son dos variables distintas.  */
            int miDato;
            int midato;
            miDato=5;
            midato=15;
            System.out.println("miDato: " + miDato);
            System.out.println("midato: "+ midato);
        
        /*  3. Sin palabras reservadas: No se pueden usar palabras clave de Java como int, class, public, if, etc. como nombres de variables.  */
            
            //String public; //esta línea da error
    
        

        /*-------------------------------------------------------------------------------------------------------------
        * 
        * Para establecer identificadores en Java de manera efectiva, 
        * un buen programador debe seguir las siguientes BUENAS PRÁCTICAS:
        *-----------------------------------------------------------------------------------------------------------------------*/

        /* 1)Nombres Descriptivos y Significativos:

            Utiliza nombres que describan claramente la función o el contenido de la variable. Por ejemplo, precioProducto es más descriptivo que p o precio.
            camelCase para Variables y Métodos:

            2)Usa camelCase para los nombres de variables y métodos:
            La primera palabra en minúscula y cada palabra subsiguiente comenzando con mayúscula, como nombreProducto o calcularPrecioTotal.
            
            3)Mayúsculas y Guiones Bajos para Constantes:

            Usa mayúsculas y guiones bajos (_) para las constantes, como VALOR_MAXIMO_PERMITIDO. Esto facilita la identificación de valores inmutables en el código.
            
            4)Evita Abreviaturas y Nombres Crípticos:

            A menos que sean muy comunes y entendibles, evita abreviaturas que dificulten la comprensión. Por ejemplo, cantidadArticulos es preferible a cantArts.
            
            5)Nombres Concisos pero Claros:

            Los nombres deben ser lo suficientemente largos como para ser claros, pero no tan largos que se vuelvan engorrosos. cantidadProductosDisponibles es un buen equilibrio, mientras que cantidadDeProductosDisponiblesEnElAlmacen es demasiado largo.
            
            6)Contexto en los Nombres:

            Incluye el contexto en el nombre si es necesario. Por ejemplo, en lugar de total, usa totalVentas o totalImpuestos para especificar a qué se refiere.
            
            7)No Uses Letras Solas o Variables Genéricas:

            Evita variables como x, y, z a menos que sean parte de cálculos matemáticos donde tiene sentido usarlas. Usa nombres como indice en lugar de i si tiene un propósito específico en el contexto.
            8) Consistencia en el Código:

            Mantén un estilo de nombrado consistente en todo el código. Si usas camelCase para variables locales, asegúrate de que todas sigan ese patrón.
            
            9)Prefijos Significativos para Variables Booleanas:

            Utiliza prefijos como es o tiene para variables booleanas, por ejemplo, esActivo o tieneDescuento. Esto hace que el código sea más legible y entendible.
                        * 
            */


    }
    
}
