/*
 * Fecha: 3/10/24
 * Autor: RLR
 * Fichero Java donde se muestra cómo crear constantes, distintos operadores, etc
 * 
 */

public class ElementosJava {

    public static void main(String[] args) {

        //1. Definir una constante en Java. El identificador en MAYUSCULAS
        final double PI = 3.1415; // número matemático PI. Este valor está incluido en clase Math, ya lo veremos más adelante
        final byte UNIDADES = 100; //ejemplo de un stock máximo en una empresa.

        System.out.println(PI);
        System.out.println(UNIDADES);

        //2. Ejemplos Símbolos de escape en Java
        /*
         * En Java los símbolos de escape se utilizan para
         * representar símbolos especiales dentro de las cadenas de texto
         * A continuación, mostraremos diferntes símbolos de escape con ejemplos
         * 
         */

        // ----------------- salto de línea (\n)
        System.out.println("Esto es un ejemplo de salto de línea.\nNueva línea");
        //----------------- retorno de carro (\r) mueve cursor al inicio línea
        System.out.println("Este es un retorno de carro.\rOtro");
        //----------------- tabulación (\t)
        System.out.println("Esto es un texto\ttexno después de tabulación\t\tdos tabulaciones");
        //-----------------barra invertida (\\)
        System.out.println("quiero mostrar la barra invertida \\");
        //----------------comilla doble (\")
        System.out.println("quiero mostrar las comillas dobles \"");
        //----------------comilla simple (\')
        System.out.println("quiero mostrar las comilla simple \'");
         //----------------avance página (\f)   dependerá de la terminal que se muestre o no     
        System.out.println("avance página \f");



        /*
         * Declaración de variables de distinto tipo y uso de operadores
         * 
         */

        int entero = 10; //en una sola línea se declara e inicializa
        double decimal= 20.5;
        char caracter='A';
        String texto ="Mañana es viernes :)";
        boolean esVerdadero = true;
        System.out.println("\n\n\n Ejemplos de operadores aritméticos");
        //--------- operadores aritméticos: +   -  *  %   /
        int suma = entero + 5; //operador + para la suma cuando son números
        double division = decimal /2; // operador / para la división de números
        int resto = entero % 2; //operador % para quedarme con el resto de entero divido entre 2
        double areaCirculo = PI*(5*5); // operador * para multiplicar números
        System.out.println("La suma de entero + 5 es: " + suma);
        System.out.println("La división de decimal entre dos es: " + division);
        System.out.println("El resto de dividir entero entre dos es " + resto);
        System.out.println("El área de un círculo es " + areaCirculo);
        
        
        System.out.println("\n\n\n Ejemplos de operadores relacionales");
        //---------- operadores relacionales: >   <   >=    <=    ==   !=
        boolean esMayor = entero > 5;
        System.out.println("El numero entero " + entero + " es mayor que 5??: " + esMayor);

        boolean esIgual = (entero==10);
        System.out.println("El numero entero " + entero + " es igual a 10??: " + esIgual);

        boolean esDistinto = (entero!=10);
        System.out.println("El numero entero " + entero + " es distinto a 10??: " + esDistinto);

        boolean esMenorIgual = (entero<=UNIDADES);
        System.out.println("El numero entero " + entero + " es menor o igual que + " + UNIDADES + ": " + esMenorIgual);


        //------------- operadores lógicos o booleanos
        boolean esMayorEdad = true;
        boolean tieneLicenciaConducir = true;

        //--- operador AND (&&) resultado es true si AMBAS son true
        boolean puedeConducir = esMayorEdad && tieneLicenciaConducir;
        System.out.println("Puede conducir: " + puedeConducir); //true

        tieneLicenciaConducir = false; //cambiamos el valor
        puedeConducir = esMayorEdad && tieneLicenciaConducir;
        System.out.println("Puede conducir: " + puedeConducir); //false

        //---- Operador OR (||) resultado es true si una de las dos es verdadera
        boolean puedeEntrarEvento = esMayorEdad || tieneLicenciaConducir;
        System.out.println("Puede entrar en evento si es mayor de edad o tiene carnet: " + puedeEntrarEvento);

        //--- Operador NOT (!) invierte el valor booleano
        boolean noEsMayorEdad = !esMayorEdad;
        System.out.println("noEsMayorEdad: " + noEsMayorEdad);

        // combinación de operadores, recomendable uso de paréntesis
        boolean tienePermisoEspecial = true;
            //puede viajar si es mayor de edad o tiene un permiso especial y no tiene liciencia de conducir
        boolean puedeViajar = (esMayorEdad || tienePermisoEspecial) && !tieneLicenciaConducir;
        System.out.println("Puede viajar: " + puedeViajar);

        //operador xor (^) devuelve true si exactamente una de las condiciones es true pero no ambas
        boolean resultadoXor = esMayorEdad ^tieneLicenciaConducir;
        System.out.println("Resultado Xor: " + resultadoXor);


        //***** ojo el operador + con cadenas concatena  */

        System.out.println("Hola " +  " a " + " todos\n " + " Esto es ejemplo concatenar ");


        /*
         * En Java los operadores tienen una prioridad que determina el orden en que se evalúa la expresión
         * Cuando ambos operadores tienen la misma prioridad se evalúa de izquierda a derecha
         * Orden de prioridad de mayor a menor
         *      PRECEDENCIA             OPERADOR            TIPO
         *      1                       (), [], .           paréntesis, array, acceso a miembro
         *      2                       ++, --              incremento / decremento
         *      3                       ++, --, +, -, !     incremento/decremento, operadores unarios, negación lógica bit a bit
         *      4                       *, /, %             multiplicación, división, resto
         *      5                       +, -                suma, resta
         *      6                       <<, >>, >>>         desplazamiento de bits (NO CREO LLEGUEMOS A USAR )
         *      7                       <,<=,>, >=          relacionales
         *      8                       ==, !=              igualdad
         *      9                       &                   AND bit a bit
         *      10                      xor                 XOR  bit a bit
         *      11                      AND                 AND lógico
         */

        //----- operadores unarios (solo operan sobre una vble) ++ -- Pueden colocarse antes o después de la vble
        int a = 5;
        //incremento prefijo (incremento de 1 en 1)

        int b = ++a; //a se incrementa a 6 y luego se asigna a b
        System.out.println("a: " + a); // a=6
        System.out.println("b: "+ b);  // b=6

        //decremento prefijo (decremento de 1 en 1)
        int c = --a; //a se decrementa a 5 luego asigno a c
        System.out.println("a: " + a); // a=5
        System.out.println("c: "+ c);  // c=5

        //incremento postfijo 
        a=5;
        b=a++; //b toma el valor actual de a (5), luego a se incrementa a 6
        System.out.println("a: " + a); // a=6
        System.out.println("b: "+ b);  // b=5

        //decremento postijo
        c=a--; // c toma el valor actual de a(6), luego a se decrementa a 5
        System.out.println("a: " + a); // a=5
        System.out.println("c: "+ c);  // c=6

        /*
         * LOS OPERADORES ++ -- PUEDEN SER 
         *  - PREFIJOS (++a, --a): incrementa o decrementa el valor de la variable a ANTES de que sea usadaa
         *  - POSTFIJO (a++, a--): usa el valor de la variable y DESPUÉS la incrementa o decrementa 
         */


























    }
}
