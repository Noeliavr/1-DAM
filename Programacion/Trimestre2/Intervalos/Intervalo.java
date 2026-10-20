

public class Intervalo {

    private double minimo;
    private double maximo;

    // Constructor vacío
    public Intervalo() {
        this.minimo = 0.0;
        this.maximo = 0.0;
    }

    // Constructor con dos doubles
    public Intervalo(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    // Constructor con un double (maximo)
    public Intervalo(double maximo) {
        this.minimo = 0.0;
        this.maximo = maximo;
    }

    // Constructor de copia
    public Intervalo(Intervalo otro) {
        this.minimo = otro.minimo;
        this.maximo = otro.maximo;
    }

    // Getters y Setters
    public double getMinimo() {
        return minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public boolean valido() {
        return minimo <= maximo;
    }

    public double longitud() {
        return maximo - minimo;
    }

    public double puntoMedio() {
        return (minimo + maximo) / 2.0;
    }

    public void desplazar(double cantidad) {
        minimo += cantidad;
        maximo += cantidad;
    }

    public Intervalo copia() {
        return new Intervalo(this);
    }

    public boolean iguales(Intervalo otro) {
        return minimo == otro.minimo && maximo == otro.maximo;
    }

    public boolean incluye(double valor) {
        return valido() && valor >= minimo && valor <= maximo;
    }

    public boolean incluye(Intervalo otro) {
        return valido() && otro.valido() && minimo <= otro.minimo && maximo >= otro.maximo;
    }

    public Intervalo[] troceado(int partes) {
        if (partes <= 0 || !valido()) {
            return new Intervalo[0];
        }
        Intervalo[] trozos = new Intervalo[partes];
        double paso = longitud() / partes;
        for (int i = 0; i < partes; i++) {
            trozos[i] = new Intervalo(minimo + i * paso, minimo + (i + 1) * paso);
        }
        return trozos;
    }

    public void escalar(double factor) {
        if (factor < 0) {
            factor = 0; // Evita negativos

        }
        double centro = puntoMedio();
        double nuevaLong = longitud() * factor;
        minimo = centro - (nuevaLong / 2);
        maximo = centro + (nuevaLong / 2);
    }

    public Intervalo desplazado(double cantidad) {
        return new Intervalo(minimo + cantidad, maximo + cantidad);
    }

    public Intervalo interseccion(Intervalo otro) {
        double ini = Math.max(minimo, otro.minimo);
        double fin = Math.min(maximo, otro.maximo);
        if (ini > fin + 1e-10) { // Tolerancia para doubles
            return null;
        }
        return new Intervalo(ini, fin);
    }

    public Intervalo simetrico() {
        return new Intervalo(0.0, minimo);
    }
}
