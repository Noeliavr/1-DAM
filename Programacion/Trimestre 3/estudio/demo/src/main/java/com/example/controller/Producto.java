package com.example.controller;
import java.util.Formatter;

import com.example.Constantes.ANSI;
import com.example.Constantes.InputReader;
import com.example.excepciones.ValorNoValidoException;
public class Producto {
  private int idProducto;
  private String nombre;
  private double precio;
  private int stock;



  public Producto(int idProducto, String nombre, double precio, int stock){
    this.idProducto = idProducto;
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) throws ValorNoValidoException {
    if (precio < 0) {
        throw new ValorNoValidoException("El precio no puede ser negativo");
    }
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) throws ValorNoValidoException {
    if (stock < 0){
      throw new ValorNoValidoException("El stock no puede ser negativo");
    }
    this.stock = stock;
  }
  public void reponerStock(int stock) throws ValorNoValidoException {
    if(stock < 0){
      throw new ValorNoValidoException("No se puede reponer una cantidad negativa");
    }else{
      this.stock = this.stock + stock;
    }
  }
  public void vender(int cantidadProducto) throws ValorNoValidoException {
    if ( cantidadProducto < 0){
      throw new ValorNoValidoException("La cantidad tiene que ser positiva");
    }else{
      if (cantidadProducto > stock) {
          throw new ValorNoValidoException("No hay suficiente Stock para la venta");
      }
    }
  }
  public void mostrarInformacionTabulada(){
    if(stock==0){
      System.out.printf("%s %-10d %-10s %15.2f %15d %s %n", ANSI.ANSI_ROJO, idProducto, nombre, precio, stock, ANSI.ANSI_RESET);
    }else{
      System.out.printf("%-10d %-10s %15.2f %15d %n", idProducto, nombre, precio, stock);
    }
  }
    public static void cabecera () {
        System.out.println(InputReader.mensaje("--- LISTADO DE PRODUCTOS -----", ANSI.ANSI_VERDE));
        System.out.printf("%-10s %-10s %15s %15s %n", "ID", "Nombre", "Precio", "Stock");
        System.out.println("--------------------------------------------------------------------------------");
    }
  @Override
  public String toString() {
    return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock
        + "]";
  }

  public Producto() {
  }
  public static String cabeceraReturn (){
    StringBuilder sb = new StringBuilder();
    sb.append("----Listado productos----\n");
    Formatter formatter = new Formatter(sb);
    formatter.format("%-10s %-10s %15s %15s %n", "ID", "Nombre", "Precio", "Stock");
    sb.append("-----------------------------------------------------------------\n");
    formatter.close();
    return sb.toString();
  }

}

