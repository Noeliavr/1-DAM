/*
 * Ejercicio4String4
 * 
 * 
 * En cualquier frase cambiar la primera y la última palabra a mayúsculas. Probarlo con la frase “Esta es la frase donde vamos a hacer los cambios”
 * 
 * Fecha: 05/11/2025
 * Autor: Noelia
 */

public class Ejercicio4String4 {
  public static void main(String[] args) {

    String frase = "Esta es la frase donde vamos a hacer los cambios";

    // Encontrar la primera y última palabra
    int primerEspacio = frase.indexOf(" ");
    int ultimoEspacio = frase.lastIndexOf(" ");

    String primeraPalabra = frase.substring(0, primerEspacio).toUpperCase();
    String ultimaPalabra = frase.substring(ultimoEspacio + 1).toUpperCase();

    // Construir la nueva frase
    String fraseModificada = primeraPalabra + frase.substring(primerEspacio, ultimoEspacio + 1) + ultimaPalabra;

    // Mostrar el resultado
    System.out.println(fraseModificada);
  }
}