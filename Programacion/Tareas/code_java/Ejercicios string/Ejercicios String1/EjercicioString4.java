public class EjercicioString4
 {
  public static void main(String[] args) {
    String frase = "Vamos a ver que es lo que sale de este cambio de letras";
    String letra_remplazar = "a";
    String remplazo = "i";
    int limite_remplazos = 3;

    String frase_modificada = frase;

    for (int i = 0; i < limite_remplazos; i++) {
      for (int j = 0; j < letra_remplazar.length(); j++) {
        // char letra_actual=letra_remplazar.charAt(j);
        // frase_modificada=frase_modificada.replaceFirst(String.valueOf(letra_actual),remplazo);
        frase_modificada = frase_modificada.replaceFirst(letra_remplazar, remplazo);
      }

      System.out.println("Frase Modificada: " + frase_modificada);

    }
  }
}