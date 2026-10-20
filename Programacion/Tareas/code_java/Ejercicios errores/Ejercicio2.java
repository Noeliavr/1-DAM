import java.util.Scanner;

public class Ejercicio2 {

     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce nº: ");
            int n = sc.nextInt();

            int count = 0;
            int i = 1;
            while (i <= n) {
                if (i % 2 == 0) {
                    count++;
                }
                i++; // incrementa correctamente
            }

            System.out.println("Pares = " + count);
        }
    }
    
}
