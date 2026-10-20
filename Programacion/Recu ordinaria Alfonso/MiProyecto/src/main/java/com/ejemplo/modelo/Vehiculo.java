package com.ejemplo.modelo;

public class Vehiculo {
    private int identificacion;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precioBase;
    private boolean disponibilidad;

    public Vehiculo(int identificacion, String marca, String modelo, int anioFabricacion, double precioBase, boolean disponibilidad) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precioBase = precioBase;
        this.disponibilidad = disponibilidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    @Override
    public String toString() {
        return "Vehiculo [identificacion=" + identificacion + ", marca=" + marca + ", modelo=" + modelo
                + ", anioFabricacion=" + anioFabricacion + ", precioBase=" + precioBase + ", disponibilidad="
                + disponibilidad + "]";
    }

}