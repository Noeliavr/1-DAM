package com.example.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;

import com.example.Constantes.ANSI;
import com.example.Constantes.InputReader;
import com.example.excepciones.ValorNoValidoException;
import com.example.main.Main;


public class Controlador {
    private static HashSet<Producto> productos = new HashSet<>();
    private static HashSet<Cliente> clientes = new HashSet<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static final String URL = "jdbc:mysql://localhost:3306/tiendaonline";
    private static final String USUARIO ="root";
    private static final String CONTRASENA= "Password1234";
    private static File nombreDirectorio= new File("src/main/java/com/example/txt");
    private static File nombreArchivo = new File(nombreDirectorio,"TeAmo.txt");


public static void procesarMenu() throws ValorNoValidoException{
        try {
            boolean salir = false;
        do {
            switch (Main.mostrarMenu()) {
            case 1:
                añadirProducto();    
                break;

            case 2:
                añadirClientes();
                break;
            case 3:
                crearPedido(); 
                break;
            case 4:
                mostrarPedidos();
                break;

            case 5:
                mostrarProductos();
                break;

            case 6:
                exportarProductosTxt();
                break;

            case 7:
                importarProductos();
                break;

            case 8:
                salir = true;
                break;
        
        }     
        } while (!salir);
            
        } catch (NumberFormatException NFE) {
            System.out.println(NFE.getMessage());
            
        } catch (ValorNoValidoException VNVE) {
            System.out.println(VNVE.getMessage());
        }
    }
    public static void añadirProducto () {
        int idProducto = InputReader.leerEnteroMin("Introduce el id", 0);
        String nombre = InputReader.leerCadenaNoVacia("Introduce el nombre");
        double precio = InputReader.leerDecimalMin("Introduce el precio de tu producto", 0);
        int stock = InputReader.leerEnteroMin("Introduce el stock", 0);

        try {
            Producto producto = new Producto(idProducto, nombre, precio, stock);
            productos.add(producto);
            System.out.println(InputReader.mensaje("Producto añadido correctamente", ANSI.ANSI_VERDE));
        } catch (NumberFormatException NFE) {
            System.out.println(NFE.getMessage());
        }

    }

    public static void añadirClientes () {
        String cif = InputReader.leerRegex("Introduce en cif: ","^[A-HJNPQRSUVW][0-9]{7}[0-9A-J]$");
        String nombre = InputReader.leerCadenaNoVacia("Introduce el nombre: ");
        String direccion =InputReader.leerCadenaNoVacia("Introduce la direccion: ");
        String telefono = InputReader.leerRegex("Introduce el numero de telefono: ", "^[679][0-9]{8}$");
        String nombreContacto =InputReader.leerCadenaNoVacia("Introduce el nombre de la persona de contacto: ");
        String apellido= InputReader.leerCadenaNoVacia("Introduce el apellido de la persona de contacto: ");
        String email= InputReader.leerRegex("Introduce el email: ","^[A-Za-z0-9._-]+\\@[A-Za-z0-9]+\\.[a-z]{2,6}$");

        Persona personaContacto = new Persona(nombreContacto, apellido, email);
        Cliente cliente = new Cliente(cif, nombre, direccion, telefono, personaContacto);
        clientes.add(cliente);
        System.out.println(InputReader.mensaje("Cliente añadido correctamente", ANSI.ANSI_VERDE));
    } 
    public static void crearPedido () throws ValorNoValidoException{
        Cliente c = new Cliente();
        ArrayList<DetallePedido> detallesPedidos = new ArrayList<>();
        if(productos.isEmpty()){
            System.out.println("Debe de tener minimo un producto"+ANSI.ANSI_ROJO);
        }else{
            if(clientes.isEmpty()){
                System.out.println("Debe de tener minimo un cliente"+ANSI.ANSI_ROJO);
            }else{
                System.out.println("Ya existen clientes");
                for (Cliente cliente : clientes){
                    System.out.println("Inserta el nombre de la empresa: "+cliente.getNombre());
                    System.out.println("Inserta tu CIF: "+cliente.getCif());
                }
                boolean cifValido = false;

                do { 
                    String cifAuxiliar = InputReader.leerRegex("Introduce el cif de la empresa: ", "^[A-HJNPQRSUVW][0-9]{7}[0-9A-J]$");
                    for(Cliente cliente: clientes){
                        if(cliente.getCif().equals(cifAuxiliar)){
                            System.out.println("CIF VALIDO"+ ANSI.ANSI_VERDE);
                            c = cliente;
                            cifValido = true;
                        }
                    }
                    if(!cifValido){
                        System.out.println("CIF NO VALIDO" + ANSI.ANSI_ROJO);
                    }
                } while (!cifValido);
                Producto.cabecera();
                boolean seguir=true;
                do{
                    for(Producto producto : productos){
                        producto.mostrarInformacionTabulada();
                    }

                    int id= InputReader.leerEnteroMin("Introduce el ID del producto: ", 0);
                    boolean disponible = false;
                    int unidades=0;
                    Producto p = new Producto();
                    for(Producto producto : productos){
                        if(producto.getIdProducto() == id){
                            unidades = producto.getStock();
                            p = producto;
                            disponible=true;
                        }
                    }

                    if(disponible == false || unidades ==0){
                        System.out.print("No tiene stock este producto, prueba con otro"+ ANSI.ANSI_ROJO);
                    }else{
                        int unidadesParaLlevar = InputReader.leerEnteroEntre("Unidades disponibles del producto: " + unidades, 1, unidades);
                        p.setStock(unidades - unidadesParaLlevar);
                        DetallePedido pedido = new DetallePedido(p, unidadesParaLlevar);
                        detallesPedidos.add(pedido);
                        System.out.println(InputReader.mensaje("Se ha añadido correctamente a la cesta", ANSI.ANSI_VERDE));
                    }
                    String opcion =InputReader.leerCadenaNoVacia("Queres añadir mas productos? (s/n)");
                    char a = opcion.charAt(0);
                    if(Character.toLowerCase(a)=='n'){
                        LocalDateTime ahora = LocalDateTime.now();
                        Pedido pe = new Pedido(c, ahora, detallesPedidos);
                        pedidos.add(pe);
                        System.out.println(InputReader.mensaje("Pedido realizado correctamente ", ANSI.ANSI_VERDE));
                        seguir=false;
                    }
                    
                }while(seguir==true);
            }
        }
    }   
    public static void mostrarPedidos(){
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos");
        } else{
            Pedido.cabecera();
            for(Pedido pedido: pedidos){
                pedido.mostrarInformacion();
            }
        }
    }
    public static void mostrarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay productos");
        }else{
            Producto.cabecera();
            for(Producto producto: productos){
                producto.mostrarInformacionTabulada();
            }
        }
    }
    public static void exportarProductosTxt(){
        nombreDirectorio.mkdirs();
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            pw.println(Producto.cabeceraReturn());
            for(Producto producto: productos){
                pw.println(producto.getIdProducto() + ";" + producto.getNombre() + ";" + producto.getPrecio() + ";" + producto.getStock());
            }
        } catch (IOException e) {
            System.out.println(InputReader.mensaje("Productos exportados correctamente", ANSI.ANSI_VERDE));

        }
    }
    public static void importarProductos(){
        String sql = "insert into productos(idProducto, nombre, precio, stock) values (?, ?, ?, ?) on duplicate key update nombre = values (nombre), precio = values (precio), stock = values (stock)";
        try (Connection con = DriverManager.getConnection(URL, USUARIO,CONTRASENA); PreparedStatement ps = con.prepareStatement(sql); BufferedReader br = new BufferedReader(new FileReader(nombreArchivo)))  {
            br.readLine();
            br.readLine();
            br.readLine();
            String linea;
            while((linea = br.readLine())!=null){
                String[] lineaseparada = linea.split(";");
                int idProducto = Integer.parseInt(lineaseparada[0]);
                String nombre = lineaseparada[1];
                double precio = Double.parseDouble(lineaseparada[2]);
                int stock = Integer.parseInt(lineaseparada[3]);

                ps.setInt(1, idProducto);
                ps.setString(2, nombre);
                ps.setDouble(3, precio);
                ps.setInt(4, stock);
                int registrosAfectados= ps.executeUpdate();
                System.out.println("Registro afectados "+ registrosAfectados);
            }
        } catch (SQLException e) {
            InputReader.mensaje("Error en la importacion de productos"+ e.getMessage(), ANSI.ANSI_ROJO);
        } catch (IOException ioe) {
            InputReader.mensaje("Error"+ ioe.getMessage(), ANSI.ANSI_ROJO);
        }
    }
}