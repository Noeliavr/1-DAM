package com.ejemplo.modelo;

public class Coche extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;


    public Coche(int identificacion, String marca, String modelo, int anioFabricacion, double precioBase, boolean disponibilidad, int numeroPuertas, String tipoCombustible ) {
        super(identificacion, marca, modelo, anioFabricacion, precioBase, disponibilidad);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
        
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }


    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public String getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    @Override
    public String toString() {
        return super.toString() + "Coche [numeroPuertas=" + numeroPuertas + ", tipoCombustible=" + tipoCombustible + "]";
    }

    
}

