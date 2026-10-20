
import java.util.Scanner;

public class PalabraMisteriosa {

    public static void palabraMisteriosa(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraMisteriosa;
        System.out.print("Introduce la palabra misteriosa : ");
        palabraMisteriosa = sc.nextLine();
        String[] guiones_palabraMisteriosa = {"_ ", "_", "_", "_", "_"};
        String[] letras_adivinadas = new String[palabraMisteriosa.length()];
        String palabraAdivinada = String.join("", guiones_palabraMisteriosa);

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        if (palabraMisteriosa.equals(palabraMisteriosa)) {
            System.out.println("¡Has adivinado la palabra misteriosa!");
        } else {
            System.out.println("La palabra misteriosa es incorrecta. Inténtalo de nuevo.");
        }

    }

}
