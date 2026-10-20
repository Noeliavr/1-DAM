
import java.io.BufferedReader;
import java.io.IOException;

public class Eje1 {
    
    public static double suma(double dato1, double dato2) {
        return dato1 + dato2;
    }
    public static double resta(double dato1, double dato2) {
        return dato1 - dato2;
    }
    public static  double multiplicacion(double dato1, double dato2) {
        return dato1 * dato2;
    }
    public static double division(double dato1, double dato2) {
        return dato1 / dato2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
        Boolean salirbucle=false;
    do{
    System.out.println("Indique dato 1: ");
    int dato1=Integer.parseInt(br.readLine());
    System.out.println("Indique dato 2: ");
    int dato2=Integer.parseInt(br.readLine());


    System.out.println("==== Menú Calculadora Modular ====");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");
    System.out.println("5. Salir");
    System.out.print("Seleccione una opcion: ");
    String entrada=br.readLine();

        switch (entrada) {
            case "1":
                suma(dato1, dato2);
                System.out.println("La suma es: " + suma(dato1, dato2));
                break;
            case "2":
                resta(dato1, dato2);
                System.out.println("La resta es: " + resta(dato1, dato2));
                break;
            case "3":
                multiplicacion(dato1, dato2);
                System.out.println("La multiplicacion es: " + multiplicacion(dato1, dato2));
                break;
            case "4":
                if (dato2 != 0) {
                    division(dato1, dato2);
                System.out.println("La division es: " + division(dato1, dato2));
                } else {
                    System.out.println("Error: Division por cero no permitida.");
                }
                break;
            case "5":
                System.out.println("Saliendo del programa.");
                salirbucle=false;
                
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    } while (salirbucle==true);

    }
}
