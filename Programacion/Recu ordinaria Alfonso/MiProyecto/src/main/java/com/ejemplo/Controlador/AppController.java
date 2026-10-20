package com.ejemplo.Controlador;

public class AppController {
    public static int mostrarMenu () {
        System.out.println("===== GESTIÓN DE ALQUILERES DE VEHÍCULOS =====");
        System.out.println("1. Cargar vehículos desde fichero");
        System.out.println("2. Alta de vehículo");
        System.out.println("3. Mostrar todos los vehículos");
        System.out.println("4. Buscar vehículo por matrícula/código");
        System.out.println("5. Realizar alquiler");
        System.out.println("6. Devolver vehículo");
        System.out.println("7. Mostrar alquileres");
        System.out.println("8. Exportar vehículos a fichero de texto");
        System.out.println("9. Guardar alquileres en fichero binario");
        System.out.println("10. Cargar alquileres desde fichero binario");
        System.out.println("11. Insertar vehículos en base de datos");
        System.out.println("0. Salir");
        return 0;
    }

    public static String procesarMenu() {
        boolean valido =false;
        int opcion = mostrarMenu();

        switch (opcion) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1:
                cargarVehiculoFichero();
                break;
            case 2:
                altaVehiculo();
                break;
            case 3:
                mostrarVehiculos();
                break;
            case 4:
                buscarVehiculoMatricula();
                break;
            case 5:
                realizarAlquiler();
                break;
            case 6:
                devolverVehiculo();
                break;
            case 7:
                mostrarAlquiler();
                break;
            case 8:
                exportarVehiculoFicheroTexto();
                break;
            case 9:
                guardarAlquilerFicheroBinario();
                break;
            case 10:
                cargarAlquilerFicheroBinario();
                break;
            case 11:
                insertarVehiculoBaseDatos();
                break;
        
            default:
            System.out.println("Error");
                break;
        }
        return;
    }
    public static void cargarVehiculoFichero(){}
    public static void altaVehiculo(){}
    public static void mostrarVehiculos(){}
    public static void buscarVehiculoMatricula(){}
    public static void realizarAlquiler(){}
    public static void devolverVehiculo(){}
    public static void mostrarAlquiler(){}
    public static void exportarVehiculoFicheroTexto(){}
    public static void guardarAlquilerFicheroBinario(){}
    public static void cargarAlquilerFicheroBinario(){}
    public static void insertarVehiculoBaseDatos(){}
}
