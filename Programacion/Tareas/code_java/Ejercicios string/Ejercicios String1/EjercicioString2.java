public class EjercicioString2 {
    public static void main(String[] args) {
        String frase = "Esta es una frase cualquiera";

        String frase_nueva = frase.replace (" ", "");

        for (int contador = 0; contador<=frase_nueva.length(); contador = contador+5) {
            System.out.print(frase.charAt(contador));
            System.out.println (); // asi queda mas limpio

        }


    }

}
