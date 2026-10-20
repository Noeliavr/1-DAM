
class Coche extends Vehiculo implements Asegurable {

    private int puertas;

    public Coche(String matricula, String marca, int velocidadMaxima, int puertas) {
        super(matricula, marca, velocidadMaxima);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        int nuevaVelocidad = getVelocidadActual() + 20;

        if (nuevaVelocidad > getVelocidadMaxima()) {
            nuevaVelocidad = getVelocidadMaxima();
        }
        setVelocidadActual(nuevaVelocidad);
    }

    @Override
    public double calcularSeguro() {
        return getVelocidadMaxima() * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "puertas: " + puertas;
    }
}
