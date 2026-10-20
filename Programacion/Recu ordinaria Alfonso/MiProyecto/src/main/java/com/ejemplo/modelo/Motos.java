package com.ejemplo.modelo;

public class Motos extends Vehiculo {
    private int cilindrada;
    private boolean Baul;
    public Motos(int identificacion, String marca, String modelo, int anioFabricacion, double precioBase,
            boolean disponibilidad, int cilindrada, boolean baul) {
        super(identificacion, marca, modelo, anioFabricacion, precioBase, disponibilidad);
        this.cilindrada = cilindrada;
        Baul = baul;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public boolean isBaul() {
        return Baul;
    }
    public void setBaul(boolean baul) {
        Baul = baul;
    }
    @Override
    public String toString() {
        return super.toString() +"Motos [cilindrada=" + cilindrada + ", Baul=" + Baul + "]";
    }

    
}
