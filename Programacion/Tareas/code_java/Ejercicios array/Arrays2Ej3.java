/* Ejercicio3

 * Dado el String borrasca=”Filomena” obtener un array de caracteres con sus letras y mostrarlo en pantalla.
    Fecha:5/11/2025
    Autor: Alfonso Sevillano

 */
import java.util.Arrays;
public class Arrays2Ej3 {
public static void main(String[] args) {
    String Borrasca="Filomena";
    String [] Array={Borrasca};
    for (int i=0;i<Borrasca.length();i++){
        System.out.println("La letra es "+ i + ":"+Borrasca.charAt(i));
    }
}    
}
