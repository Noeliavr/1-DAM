
import java.util.Scanner;

public class FortalezaPasword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, confirmacion;

        boolean contrasenaValida = false;

        while (!contrasenaValida) {
            System.out.print("Introduce una contraseña : ");
            password = sc.nextLine();
            boolean mayuscula = false;
            boolean minuscula = false;
            boolean digito = false;
            boolean caracterEspecial = false;
            boolean espacios = false;
            boolean longitudCorrecta = password.length() >= 8;
            boolean caracteresValidos = true;
            // Recorre la contraseña carácter a carácter
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                int codigo = password.codePointAt(i);

                if (Character.isUpperCase(c)) {
                    mayuscula = true;
                } else if (Character.isLowerCase(c)) {
                    minuscula = true;
                } else if (Character.isDigit(c)) {
                    digito = true;
                } else if ("!*+-_#$%&?¿¡".indexOf(c) >= 0) {
                    caracterEspecial = true;
                } else if (Character.isWhitespace(c)) {
                    espacios = true;
                } else {
                    caracteresValidos = true;
                }
            }

            if (!mayuscula) {
                System.out.println(" Falta al menos una letra mayúscula.");
            }
            if (!minuscula) {
                System.out.println(" Falta al menos una letra minúscula.");
            }
            if (!digito) {
                System.out.println(" Falta al menos un dígito (0-9).");
            }
            if (!caracterEspecial) {
                System.out.println(" Falta al menos un carácter especial (* + - _ # $ % &). !?¿¡");
            }
            if (espacios) {
                System.out.println(" La contraseña no puede contener espacios en blanco.");
            }
            if (!longitudCorrecta) {
                System.out.println(" La longitud mínima es de 8 caracteres.");
            }
            if (!caracteresValidos) {
                System.out.println(" La contraseña contiene caracteres no permitidos.");
            }

            // Si todas las reglas se cumplen
            if (mayuscula && minuscula && digito && caracterEspecial
                    && !espacios && longitudCorrecta && caracteresValidos) {

                
                System.out.print("Vuelve a introducir la contraseña para confirmar: ");
                confirmacion = sc.nextLine();

                if (password.equals(confirmacion)) {
                    System.out.println(" Contraseña establecida correctamente.");//establece contraseña
                    contrasenaValida = true;
                } else {
                    System.out.println(" Las contraseñas no coinciden. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, corrige los errores y vuelve a intentarlo.\n");
            }
        }

        System.out.println("Fin del Programa.");
        sc.close();

    }
}
