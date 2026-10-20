public class ArrayExample01 {

    // VECTOR=ARRAY
    public static void main(String[] args){
        //Ejemplo Array entero, declaramos e inicializamos
        int[] numeros= {4,7,3};

        //Ejemplo Array cadenas, declaramos e inicializamos
        String[] nombres= {"Ana", "Luis", "Pepe"};
    
        //Ejemplo Array caracteres
        char[] vocales={'a', 'e', 'i', 'o', 'u'};
        
        //Ejemplo Array Double
        double[] precios={45.78, 65.34};

        //------------------------------- Acceso a los elementos
        //1º Forma Acceso secuencial.. No es efectivo si son muchos elementos
        System.out.println("El vector numeros tiene: ");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
       // System.out.println(numeros[3]); Error por estar fuera del indice


        //Pregunta de examen: en la linea for (int posicion=0; posicion< numeros, length*()*; posicion++), no hay parentesis.
    }


}


public class EjercicioVector01{
    public static void main (String[] args){
        int[] vectorA={1,3,5,6,8};
        int[] VectorB={1,2,3,4,5};
        int[] VectorSuma=new int[vectorA.length]; // 



        //mostrar resultado como vector
        System.out.println();
    }
}
