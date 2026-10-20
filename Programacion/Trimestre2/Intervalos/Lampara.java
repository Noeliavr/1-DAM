

public class Lampara {

    private boolean encendida;
    private int intensidad;

    public Lampara() {
        this.encendida = false;
        this.intensidad = 0;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100) {
            this.intensidad = intensidad;
        }
    }

    public void setIntensidad(double voltaje) {
        if (voltaje < 1.5) {
            intensidad = 0;
        } else if (voltaje > 12.5) {
            intensidad = 100;
        } else {
            intensidad = (int) (((voltaje - 1.5) / 11.0) * 100);
        }
        this.encendida = true;
    }

    @Override
public String toString(){
    String estado = encendida ? " ON":" OFF";
    return "Luz" + estado +", Intensidad"+ intensidad;

}
}
