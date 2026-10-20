
public class IntervaloTest {

    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo(2.0, 8.0);
        System.out.println("Intervalo inicial: [" + intervalo.getMinimo() + ", " + intervalo.getMaximo() + "]");
        System.out.println("¿Es válido? " + intervalo.valido());
        System.out.println("Longitud: " + intervalo.longitud());
        System.out.println("Punto medio: " + intervalo.puntoMedio());

        intervalo.desplazar(3.0);
        System.out.println("Después de desplazar 3.0: [" + intervalo.getMinimo() + ", " + intervalo.getMaximo() + "]");

        Intervalo copiaIntervalo = intervalo.copia();
        System.out.println("Copia del intervalo: [" + copiaIntervalo.getMinimo() + ", " + copiaIntervalo.getMaximo() + "]");
    }
}
