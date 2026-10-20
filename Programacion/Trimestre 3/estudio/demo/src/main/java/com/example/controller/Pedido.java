package com.example.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.example.excepciones.ValorNoValidoException;

public class Pedido{
  private String codigoPedido;
  private Cliente cliente;
  private LocalDateTime fecha;
  private ArrayList <DetallePedido> detallePedidoAsociado;
  private int contador = 1;


  public Pedido(Cliente cliente, LocalDateTime fecha, ArrayList detallePedidoAsociado){
    this.cliente = cliente;
    this.fecha = fecha;
    this.detallePedidoAsociado = detallePedidoAsociado;

    String codigoPedido = String.format("PED%03d", contador);
    this.codigoPedido = codigoPedido;

    contador++;
  }


  public String getCodigoPedido() {
    return codigoPedido;
  }


  public void setCodigoPedido(String codigoPedido) {
    this.codigoPedido = codigoPedido;
  }


  public Cliente getCliente() {
    return cliente;
  }


  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }


  public LocalDateTime getFecha() {
    return fecha;
  }


  public void setFecha(LocalDateTime fecha) {
    this.fecha = fecha;
  }


  public ArrayList<DetallePedido> getDetallePedidoAsociado() {
    return detallePedidoAsociado;
  }


  public void setDetallePedidoAsociado(ArrayList<DetallePedido> detallePedidoAsociado) {
    this.detallePedidoAsociado = detallePedidoAsociado;
  }


  public int getContador() {
    return contador;
  }


  public void setContador(int contador) {
    this.contador = contador;
  }
  public void removeDetalle(Producto p) throws ValorNoValidoException{
    if (detallePedidoAsociado.isEmpty()){
      System.out.println("No hay productos para eliminar");
    } else {
      boolean encontrado = false;
      DetallePedido borrar = null;
      for(DetallePedido pedido : detallePedidoAsociado){
        if(pedido.getProducto() == p){
          Producto devuelto = pedido.getProducto();
          int unidadesDevueltas = pedido.getUnidades();
          devuelto.reponerStock(unidadesDevueltas);
          encontrado =true;
          borrar = pedido;
        }
      }
      if(encontrado == false){
        System.out.println("Producto no encontraod");
      }else{
      if(borrar != null){
        detallePedidoAsociado.remove(borrar);
        System.out.println("Producto cambiado correctamente");
      }else{
        System.out.println("El pedido no existe");
      }
      }
    }
  }
  public static void cabecera(){
    System.out.println("----Listado Producto----");
  }
  public void mostrarInformacion(){
    System.out.println("-- Pedido "+codigoPedido+" --");
    System.out.println("Cliente: "+cliente);
    System.out.println("Fecha: "+fecha);
    double sumaPrecio=0;
    for(DetallePedido pedido:detallePedidoAsociado){
      double totalProducto = pedido.getUnidades()*pedido.getProducto().getPrecio();
      sumaPrecio= totalProducto + sumaPrecio;
      System.out.println("- "+pedido.getProducto().getNombre()+" x " + pedido.getUnidades()+" = "+ totalProducto);
    }
    System.out.println("Total: "+ sumaPrecio);
  }


  
  
}

