/*
 * Ejercicio6String3
 * 
 * Crear cuatro String con los valores “uno” ,“dos”, “tres” y “cuatro”. A partir de estos String obtener un quinto que contenga lo siguiente “uno, dos, tres y cuatro”.
 * 
 * 
 * fecha: 5/11/2025
 * Autor: Noelia Velardo
 * 
 */
public class Ejercicio6String3 {
  public static void main(String[] args) {
    String str1 = "uno";
    String str2 = "dos";
    String str3 = "tres";
    String str4 = "cuatro";

    String resultado = str1 + ", " + str2 + ", " + str3 + " y " + str4;

    System.out.println(resultado);
  }
}