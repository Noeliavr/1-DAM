
public abstract class Vehiculo {

    private String matricula;
    private String marca;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculo(String matricula, String marca, int velocidadMaxima) {

        this.matricula = matricula;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public abstract void acelerar();

    @Override
    public String toString() {
        return "Vehiculo{matricula='" + matricula
                + "', marca='" + marca
                + "', vmax=" + velocidadMaxima
                + ", vActual=" + velocidadActual + "}";
    }
}
