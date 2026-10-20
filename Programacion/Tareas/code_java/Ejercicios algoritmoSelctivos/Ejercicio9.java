import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir el tipo de autobús
        System.out.print("Tipo de autobús (A/B/C): ");
        char tipo = scanner.next().toUpperCase().charAt(0); // Lee una letra y la convierte a mayúscula

        // Paso 2: Pedir los kilómetros por persona
        System.out.print("Kilómetros por persona: ");
        double km = scanner.nextDouble();

        // Paso 3: Pedir el número de personas
        System.out.print("Número de personas: ");
        int personas = scanner.nextInt();

        double precioPorKm;

        // Paso 4: Decidir el precio por km según tipo de autobús
        if (tipo == 'A') {
            precioPorKm = 2.0;
        } else if (tipo == 'B') {
            precioPorKm = 2.5;
        } else if (tipo == 'C') {
            precioPorKm = 3.0;
        } else {
            precioPorKm = 0;
            System.out.println("Tipo no válido.");
        }
        int facturarPersonas = (personas < 20) ? 20 : personas;

        // Paso 5: Calcular el coste total y el coste por persona
        double costeTotal = precioPorKm * km * facturarPersonas;
        double costePorPersona = costeTotal / personas;

        // Paso 6: Mostrar los resultados
        System.out.println("Coste total: " + costeTotal + " €");
        System.out.println("Coste por persona: " + costePorPersona + " €");
    }
}
