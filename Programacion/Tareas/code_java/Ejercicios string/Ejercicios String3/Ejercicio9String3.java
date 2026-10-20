/*
 * Ejercicio9String3
 * 
 * De cualquier palabra con un número par de letras, conseguir que la primera mitad esté en mayúsculas y la segunda mitad en minúsculas. Probarlo con la palabra “LoCoMoToRa”.
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio9String3 {
  public static void main(String[] args) {
    String palabra = "LoCoMoToRa";
    int longitud = palabra.length();
    int mitad = longitud / 2;

    String primeraMitad = palabra.substring(0, mitad).toUpperCase();
    String segundaMitad = palabra.substring(mitad).toLowerCase();

    String resultado = primeraMitad + segundaMitad;

    System.out.println(resultado);
  }
}