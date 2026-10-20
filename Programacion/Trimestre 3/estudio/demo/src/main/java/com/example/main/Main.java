package com.example.main;
import com.example.Constantes.ANSI;
import com.example.Constantes.InputReader;
import com.example.controller.*;
import com.example.excepciones.ValorNoValidoException;
/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args)throws ValorNoValidoException {
        Controlador.procesarMenu();
    }
public static int mostrarMenu () {
        System.out.println(InputReader.mensaje("BIENVENIDO AL MENU", ANSI.ANSI_AZUL));
        System.out.println("1.AÑADIR PRODUCTOS");
        System.out.println("2.AÑADIR CLIENTES");
        System.out.println("3.CREAR PEDIDOS");
        System.out.println("4.MOSTRAR TODOS LOS PEDIDOS");
        System.out.println("5.MOSTRAR PRODUCTOS");
        System.out.println("6.EXPORTAR PRODUCTO A TXT");
        System.out.println("7.IMPORTAR PRODUCTOS DESDE ARCHIVO A MySQL");
        System.out.println("8.SALIR");
        return InputReader.leerEnteroEntre("INTRODUCE TU OPCION", 0, 8);
    }
}
