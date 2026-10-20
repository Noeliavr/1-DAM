import java.util Scanner;

public class PalabraMisteriosa1 {
  public static void main(String[] args) {
    int fallos = MAX_FALLOS, intentos = 0;
    boolean terminado = false, ganado = false;
    Set<Character> intentadas = new HashSet<>();

    System.out.println("--- JUEGO DE ADIVINANZA DE PALABRAS ---\nTienes " + MAX_FALLOS + " oportunidades de fallar.");

    while (!terminado) {
      // Mostrar estado (compactado)
      System.out.println("\n=================================================\n  Palabra: " + enmascarada);
      System.out.println("  Intentos: " + intentos + " | Fallos restantes: " + fallos + " / " + MAX_FALLOS);

      // Mostrar letras falladas (compactado)
      if (!intentadas.isEmpty()) {
        StringBuilder f = new StringBuilder();
        for (char c : intentadas)
          if (secreta.indexOf(c) == -1)
            f.append(c).append(", ");
        if (f.length() > 0) {
          f.setLength(f.length() - 2);
          System.out.println("  Letras falladas: [" + f + "]");
        }
      }
      System.out.println("=================================================");

      System.out.print("Introduce letra o palabra: ");
      String entrada = s.nextLine().toUpperCase().trim();

      if (entrada.isEmpty())
        continue;
      intentos++;

      if (entrada.length() > 1) { // Adivinar palabra completa
        if (entrada.equals(secreta)) {
          ganado = terminado = true;
        } else {
          fallos--;
          System.out.println("\n*** ¡Fallaste! No es '" + entrada + "'. Te quedan " + fallos + " fallos. ***");
        }
      } else { // Adivinar letra
        char letra = entrada.charAt(0);

        if (!Character.isLetter(letra)) {
          System.out.println("\n[ERROR] Entrada inválida.");
          intentos--;
          continue;
        }

        if (intentadas.contains(letra)) {
          System.out.println("\nYa intentaste '" + letra + "'.");
          intentos--;
          continue;
        }

        intentadas.add(letra);

        if (secreta.contains(String.valueOf(letra))) {
          System.out.println("\n*** ¡Correcto! La letra '" + letra + "' está. ***");
          for (int i = 0; i < secreta.length(); i++)
            if (secreta.charAt(i) == letra)
              enmascarada.setCharAt(i, letra);
        } else {
          fallos--;
          System.out.println("\n*** ¡Incorrecto! La letra '" + letra + "' NO está. ***");
        }
      }

      // Comprobación de fin de juego y victoria/derrota (compactado)
      if (fallos <= 0)
        terminado = true;
      if (enmascarada.toString().equals(secreta))
        terminado = ganado = true;

      if (!terminado)
        System.out.println("\n-------------------------------------------------");
    }

    // Resultado final (compactado)
    System.out.println("\n*************************************************");
    if (ganado) {
      System.out.println("          ¡¡¡ F E L I C I D A D E S !!!        ");
      System.out.println("          ¡Has ADIVINADO la palabra!           ");
    } else {
      System.out.println("               ¡Oh, qué lástima!               ");
      System.out.println("    Has agotado tus oportunidades de fallo.");
    }
    System.out.println("La palabra misteriosa era: '" + secreta + "'");
    System.out.println("Total de intentos realizados: " + intentos);
    System.out.println("*************************************************");

    s.close();
  }
}
