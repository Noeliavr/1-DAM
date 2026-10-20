import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Pedir una letra
    System.out.print("Dime una vocal: ");
    char letra = scanner.next().charAt(0);
    // Comprobar si es vocal a traves de un switch
    switch (letra) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("La letra es una vocal.");
        break;
      default:
        System.out.println("La letra no es una vocal.");
        break;
    }
  }
}