package com.ejemplo.modelo;

public class Furgonetas extends Vehiculo {

    private double capacidadCarga;
    private double volumen;
    public Furgonetas(int identificacion, String marca, String modelo, int anioFabricacion, double precioBase,
            boolean disponibilidad, double capacidadCarga, double volumen) {
        super(identificacion, marca, modelo, anioFabricacion, precioBase, disponibilidad);
        this.capacidadCarga = capacidadCarga;
        this.volumen = volumen;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    @Override
    public String toString() {
        return super.toString() +  "Furgonetas [capacidadCarga=" + capacidadCarga + ", volumen=" + volumen + "]";
    }
    
    
}
