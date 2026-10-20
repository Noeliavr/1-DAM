import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intentos = 0;
        boolean adivinado = false;
        System.out.println("He pensado en un número entre 1 y 100.");

        while (!adivinado) {
            System.out.print("Introduce tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Sigue intentando.");
            } else {
                System.out.println("El número es menor. Sigue intentando.");
            }
        }

        scanner.close();
    }
}