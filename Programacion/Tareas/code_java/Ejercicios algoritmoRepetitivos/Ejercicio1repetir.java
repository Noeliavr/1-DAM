import java.util.Scanner;

public class Ejercicio1repetir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;
        int contador = 0;
        System.out.print("Escribe las 10 cantidades");
        do {
            contador++;
            System.out.print("Escribe un numero: ");
            double num = scanner.nextDouble();
            resultado += num;

        } while (contador < 10);

        scanner.close();
        System.out.println("La suma total es: " + resultado);
    }
}