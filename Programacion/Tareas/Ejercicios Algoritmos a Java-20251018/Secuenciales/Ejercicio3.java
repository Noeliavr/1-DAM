/*
 * Ejercicio 3
 * Área rectángulo
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos datos
        System.out.print("Escriba la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Escriba la altura del rectángulo: ");
        double altura = sc.nextDouble();

        //calculamos y mostramos
        double area = base*altura;
        System.out.println("El área es " + area);

        sc.close();
    }
}
