
class Camion extends Vehiculo {

    private int cargaActual;

    public Camion(String matricula, String marca, int velocidadMaxima, int cargaActual) {
        super(matricula, marca, velocidadMaxima);
        this.cargaActual = cargaActual;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public void acelerar() {
        int nuevaVelocidad = getVelocidadActual() + 10;
        if (nuevaVelocidad > getVelocidadMaxima()) {
            nuevaVelocidad = getVelocidadMaxima();
        }
        setVelocidadActual(nuevaVelocidad);
    }

    @Override
    public String toString() {
        return super.toString() + "Carga actual" + cargaActual;
    }

}
