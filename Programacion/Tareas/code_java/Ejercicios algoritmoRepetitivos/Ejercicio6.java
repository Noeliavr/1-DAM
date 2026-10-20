
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "1234&";
        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        boolean acceso = false;

        while (intentos < 3 && !acceso) {
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            if (USERNAME.equals(user) && PASSWORD.equals(pass)) {
                System.out.println("Acceso concedido.\n");
                acceso = true;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                intentos++;
            }
        }

        if (acceso) {
            int opcion;
            do {
                System.out.println("Menú:");
                System.out.println("1) Suma");
                System.out.println("2) Resta");
                System.out.println("3) Multiplica");
                System.out.println("4) Divide");
                System.out.println("5) Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();

                double num1, num2, resultado;

                switch (opcion) {
                    case 1:
                        System.out.print("Primer número: ");
                        num1 = sc.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = sc.nextDouble();
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        System.out.print("Primer número: ");
                        num1 = sc.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = sc.nextDouble();
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        System.out.print("Primer número: ");
                        num1 = sc.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = sc.nextDouble();
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        System.out.print("Primer número: ");
                        num1 = sc.nextDouble();
                        System.out.print("Segundo número: ");
                        num2 = sc.nextDouble();
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                System.out.println();
            } while (opcion != 5);
        } else {
            System.out.println("Has agotado los 3 intentos. Acceso bloque");

        }
    }
}
