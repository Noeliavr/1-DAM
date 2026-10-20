import java.util.Scanner;
public class ArrayPassword {
    public static void main(String[] args) {
        String password="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        password=sc.nextLine();
        if (password.contains(".*[a-z]*.")){
        System.out.println("La contraseña es muy débil");
        }else if (password.contains(".*[a-z]*.")&&(".*[A-Z]*."));{
        System.out.println("La contraseña es débil");
        }


    }
}
