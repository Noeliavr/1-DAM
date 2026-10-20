import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0; // Acumulador de la suma
        int contador = 0; // Contador de números válidos

        // Paso 1: Repetir hasta que el usuario escriba 0 o negativo
        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            // Paso 2: Si el número es negativo o cero, termina el bucle
            if (numero <= 0) {
                break; // Salir del bucle
            }
            // Paso 3: Sumar el número y aumentar el contador de números válidos
            suma = suma + numero;
            contador++;
        }

        // Paso 4: Mostrar los resultados
        System.out.println("La suma total de los números introducidos es: " + suma);
        System.out.println("Has introducido " + contador + " números válidos.");
    }
}