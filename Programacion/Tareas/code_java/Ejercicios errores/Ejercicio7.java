import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int contador = 0;
            int numero;

            while (true) {
                System.out.print("Introduce un número (negativo para salir): ");
                numero = sc.nextInt();

                if (numero < 0) {
                    break;
                } else if (numero > 0) {
                    contador++;
                } else {
                    System.out.println("El cero no cuenta, continúa.");
                }
            }

            System.out.println("Cantidad de números positivos introducidos: " + contador);
        }
    }
}
