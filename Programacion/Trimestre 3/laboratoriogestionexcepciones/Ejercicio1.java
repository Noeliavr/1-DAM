package laboratoriogestionexcepciones;

import java.util.Scanner;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            try {
                System.out.println("Indique un numero");    
                Double num1 = sc.nextDouble();

                System.out.println("Indique otro numero");
                Double num2 = sc.nextDouble();
                System.out.println("--------Menu---------");
                System.out.println("1.Sumar");
                System.out.println("2.Restar");
                System.out.println("3.Salir");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        Double resultado = num1 + num2;
                        System.out.println("La suma tiene como resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("La resta tiene como resultado: " + resultado);
                        break;
                        case 4:
                        System.out.println("Elige la cantidad porfi");
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Indique numero valido");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error" + e.getMessage() + "Escribe numero valido");
            } catch (IOException ioe) {
                System.out.println("Error" + ioe.getMessage());

            }

        } while (!salir);
    }

}
