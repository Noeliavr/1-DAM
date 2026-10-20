import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de lápices a comprar
        System.out.print("Introduce el número de lápices a comprar: ");
        int cantidad = scanner.nextInt();

        double precio; // variable para guardar el precio

        if (cantidad >= 1000) {
            precio = 0.25; // precio por lápiz si compra 1000 o más
        } else {
            precio = 0.75; // precio por lápiz si compra menos de 1000
        }
        double total = cantidad * precio; // calcular el precio total
        System.out.println("Debes pagar: " + total + "euros");
    }
}