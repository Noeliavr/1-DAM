import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        String InputUsuario, InputContraseña;
        String usuario = "admin";
        String contraseña = "1234&";
        do {
            System.out.println("Introduce el usuario:");
            InputUsuario = sc.nextLine();
            System.out.println("Intoduce la contraseña:");
            InputContraseña = sc.nextLine();
            intentos++;
            if (usuario.equals(InputUsuario) || contraseña.equals(InputContraseña)) {
                System.out.println("Has iniciado sesión correctamente");
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intento " + intentos);

            }
        } while (intentos < 3);
        sc.close();
    }

}
