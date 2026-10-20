public class EjercicioString3 {
    public static void main(String[] args) {
        String frase = "A ver cuantos asteriscos salen de aqui";
        String nuevaFrase = "";
        for (int posicion = 0; posicion<frase.length(); posicion++) {
             char letra = frase.charAt(posicion);
             if (posicion % 5 == 0) {
                nuevaFrase += "*";
             }
             else {
                nuevaFrase += letra; 
             }
        }
        System.out.println(nuevaFrase);
        // descubri que 0 es multiplo de 5

    }

}