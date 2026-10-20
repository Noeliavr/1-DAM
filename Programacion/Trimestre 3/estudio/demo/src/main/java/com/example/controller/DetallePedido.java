package com.example.controller;
public class DetallePedido {
    private Producto producto;
    private int unidades;

    public DetallePedido(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    public Producto getProducto() {
      return producto;
    }

    public void setProducto(Producto producto) {
      this.producto = producto;
    }

    public int getUnidades() {
      return unidades;
    }

    public void setUnidades(int unidades) {
      this.unidades = unidades;
    }

    @Override
    public String toString() {
      return "DetallePedido [producto=" + producto + ", unidades=" + unidades + "]";
    }
    
  }