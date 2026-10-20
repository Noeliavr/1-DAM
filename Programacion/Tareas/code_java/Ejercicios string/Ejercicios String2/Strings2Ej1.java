public class Strings2Ej1{
    public static void main(String[] args) {
        String frase = "Esta es una frase completa de principio a fin";

        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");

        // Strings para palabras impares y pares
        StringBuilder palabrasImpares = new StringBuilder();
        StringBuilder palabrasPares = new StringBuilder();

        // Recorrer array, empezando en posición 1 (índice 0 es posición 1)
        for (int i = 0; i < palabras.length; i++) {
            // La primera palabra es la posición 1, que es índice 0
            if ((i + 1) % 2 != 0) {
                // Palabra impar (posición impar)
                palabrasImpares.append(palabras[i]).append(" ");
            } else {
                // Palabra par (posición par)
                palabrasPares.append(palabras[i]).append(" ");
            }
        }

        // Mostrar resultados
        System.out.println("Frase original: " + frase);
        System.out.println("Palabras en posiciones impares: " + palabrasImpares.toString().trim());
        System.out.println("Palabras en posiciones pares: " + palabrasPares.toString().trim());
    }
}