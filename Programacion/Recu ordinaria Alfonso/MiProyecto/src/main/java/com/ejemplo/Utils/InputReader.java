package com.ejemplo.Utils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputReader {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    public static final String patronCodigo = "^[A-Z]{3}+[-]+[0-9]{4}+[-]+[0-9]{3}$";

    public static String mensaje (String mensaje, String ansi){
        return ansi + mensaje + Ansi.RESET;
    }
    public static String mensajeMetodo (Object mensaje, String ansi){
        return ansi + mensaje + Ansi.RESET;
    }
    public static String leerCadenaNoVacia(String mensaje){
        String cadena = "";
        Boolean valido = false;
        do{
            try{
            System.out.println(mensaje);
            }
        }while(!valido);
        return cadena;
    }
}
