package com.example.Constantes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class InputReader {
  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static String mensaje(String mensaje, String ansi){
    return(ansi + mensaje+ANSI.ANSI_RESET );
  }
  public static String mensajeMetodo(Object mensaje, String ansi){
    return(ansi + mensaje + ANSI.ANSI_RESET);
  }
  public static String leerCadenaNoVacia(String mensaje){
    String cadena ="";
    Boolean valido = false;
    do{
      try{
        System.out.println(mensaje);
        cadena = br.readLine();
        if(cadena==null){
          System.out.println(mensaje("No puede estar vacío",ANSI.ANSI_ROJO));
        }else if(cadena.trim().isEmpty()){
          System.out.println(mensaje("No puede estar vacío",ANSI.ANSI_ROJO));
        }else{
          cadena= cadena.trim();
          valido=true;
        }

      } catch(IOException e){
        System.out.println(mensaje("Error: "+ e.getMessage(),ANSI.ANSI_ROJO));
      }
    }while(!valido);
    return cadena;
  }
  public static String leerRegex(String mensaje, String regex){
    String cadena="";
    Boolean valido=false;
    do{
      cadena=leerCadenaNoVacia(mensaje);
      if(cadena.matches(regex)){
        valido=true;
      }else{
        System.out.println(mensaje("No coincide",ANSI.ANSI_ROJO));
      }
    }while(!valido);
    return cadena;
  }
  public static int leerEnteroMin(String mensaje, int min){
    int numero=0;
    Boolean valido=false;
    do{
      try{
        System.out.println(mensaje);
        numero= Integer.parseInt(br.readLine());
        if(numero>=min){
          valido=true;
        }else{
          throw new NumberFormatException(mensaje("No puede ser menor que: "+min,ANSI.ANSI_ROJO));
        }
      }catch(IOException e){
        System.out.println(mensaje("Error:"+ e.getMessage(), ANSI.ANSI_ROJO));
      }catch(NumberFormatException NFE){
        System.out.println(mensaje("Tiene que ser entero o positivo"+ NFE.getMessage(), ANSI.ANSI_ROJO));
      }
    }while(!valido);
    return numero;
  }
  public static double leerDecimalMin(String mensaje, double min){
    double numero=0;
    Boolean valido=false;
    do{
      try{ 
        System.out.println(mensaje);
        numero= Double.parseDouble(br.readLine());
        if(numero>=min){
          valido=true;
        }else{
          throw new NumberFormatException(mensaje("no puede ser menor que "+min,ANSI.ANSI_ROJO));
        }
      }catch(IOException e){
        System.out.println(mensaje("Error:"+ e.getMessage(),ANSI.ANSI_ROJO));
      }catch(NumberFormatException NFE){
        System.out.println(mensaje("El numero tiene que ser decimal y positivo" + NFE.getMessage(), ANSI.ANSI_ROJO));
      }
    }while(!valido);
    return numero;
  }
  public static int leerEnteroEntre(String mensaje, int min, int max){
    int numero=0;
    Boolean valido=false;
    do{
      try{
        System.out.println(mensaje);
        numero=Integer.parseInt(br.readLine());
        if(numero>=min && numero<=max){
          valido=true;
        }else{
          throw new NumberFormatException(mensaje("No puede que ser menor que "+min+" ni mayor que "+max,ANSI.ANSI_ROJO));
        }
      }catch(IOException e){
        System.out.println(mensaje("Error: "+ e.getMessage(),ANSI.ANSI_ROJO));
      }catch(NumberFormatException NFE){
        System.out.println(mensaje("El numero tiene que ser entero y positivo" + NFE.getMessage(), ANSI.ANSI_ROJO));
      }
    }while(!valido);
    return numero;
  }
}
