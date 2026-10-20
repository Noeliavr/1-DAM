import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Paso1: Hacer con un bucle for los numeros primos del 1 al 100
        System.out.print("Estos son los números primos del 1 al 100:\n");
        for (int numero = 2; numero <= 100; numero++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}