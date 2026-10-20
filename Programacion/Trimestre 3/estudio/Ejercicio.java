import java.util.Scanner; 

public class Ejercicio{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        double decimal = sc.nextDouble();
        String texto = sc.nextLine();
        System.out.println(" Resultado: " + numero);
        if (numero>0){
          System.out.println("Positivo");
        }else{
          System.out.println("Negativo");
        }
        for (int i =0; i< 10; i++) {
          System.out.println(i);
        }
        while (numero !=0){
          numero = sc.nextInt();
        }
      sc.close();
  }

}