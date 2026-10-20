/* 
 * Ejercicio3String3
 * 
 * 
 * Obtener la subcadena de la posición 4 a la 8 en una frase. Probarlo con “Ahora estamos en este ejercicio”.
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
*/
public class Ejercicio3String3 {
    public static void main(String[] args) {
        String frase = "Ahora estamos en este ejercicio";
        String subcadena = frase.substring(4, 8);
        System.out.println("La subcadena de la posición 4 a la 8 es: " + subcadena);
    }
}