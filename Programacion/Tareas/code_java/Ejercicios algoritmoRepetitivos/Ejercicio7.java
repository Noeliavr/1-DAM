import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero >= 0: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        sc.close();
    }
}
