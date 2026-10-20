import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedir el precio del traje
        System.out.print("Introduce el precio del traje: ");
        double precio = sc.nextDouble();

        double descuento;
        double precioFinal;

        // Paso 2: Determinar el porcentaje de descuento
        if (precio > 1500) {
            descuento = precio * 0.15; // 15%
        } else {
            descuento = precio * 0.08; // 8%
        }

        // Paso 3 y 4: Calcular el precio final
        precioFinal = precio - descuento;

        // Paso 5: Mostrar los resultados
        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El precio final a pagar es: " + precioFinal);

        sc.close();
    }
}
