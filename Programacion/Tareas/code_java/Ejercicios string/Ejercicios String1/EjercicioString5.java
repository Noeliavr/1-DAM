public class EjercicioString5 {
public static void main(String[] args) {
    String cadena="Esta es una cadena cualquiera";
    System.out.println(cadena);
    String cadenaInvertida= new StringBuilder(cadena).reverse().toString();
    System.out.println(cadenaInvertida);
}
}
