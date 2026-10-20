
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine()); // ✅ NO nextInt()

            switch (opcion) {
                case 1:
                    altaCoche();
                    break;
                case 2:
                    altaCamion();
                    break;
                case 3:
                    listarVehiculos();
                    break;
                case 4:
                    acelerarTodos();
                    break;
                case 5:
                    calcularSeguros();
                    break;
                case 0:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    static void menu() {
        System.out.println("\n---------Menú---------");
        System.out.println("1. Añadir coche");
        System.out.println("2. Añadir camión");
        System.out.println("3. Listar vehículos");
        System.out.println("4. Acelerar todos");
        System.out.println("5. Calcular seguros");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    // ---------------- PASO 4 ----------------
    static String leerMatricula() {
        String regex = "^[0-9]{4}[A-Za-z]{3}$";

        System.out.print("Escribe tu matrícula (1234ABC): ");
        String matricula = sc.nextLine().trim().toUpperCase();

        while (!matricula.matches(regex)) {
            System.out.println("Matrícula errónea. Formato válido: 1234ABC");
            System.out.print("Escribe tu matrícula (1234ABC): ");
            matricula = sc.nextLine().trim().toUpperCase();
        }
        return matricula;
    }

    static void altaCoche() {
        System.out.println("\n--- Alta Coche ---");

        String matricula = leerMatricula();

        System.out.print("Introduce la marca: ");
        String marca = sc.nextLine().trim();

        System.out.print("Introduce la velocidad máxima: ");
        int velocidadMaxima = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el número de puertas: ");
        int puertas = Integer.parseInt(sc.nextLine());

        vehiculos.add(new Coche(matricula, marca, velocidadMaxima, puertas));
        System.out.println("✅ Coche añadido.");
    }

    static void altaCamion() {
        System.out.println("\n--- Alta Camión ---");

        String matricula = leerMatricula();

        System.out.print("Introduce la marca: ");
        String marca = sc.nextLine().trim();

        System.out.print("Introduce la velocidad máxima: ");
        int velocidadMaxima = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce la carga actual: ");
        int cargaActual = Integer.parseInt(sc.nextLine());

        vehiculos.add(new Camion(matricula, marca, velocidadMaxima, cargaActual));
        System.out.println("✅ Camión añadido.");
    }

    static void listarVehiculos() {
        System.out.println("\n--- LISTAR VEHÍCULOS ---");

        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos");
            return; // ✅ importante
        }

        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i + 1) + ") " + vehiculos.get(i));
        }
    }

    static void acelerarTodos() {
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos");
        } else {

            for (int i = 0; i < vehiculos.size(); i++) {
                Vehiculo v = vehiculos.get(i);
                v.acelerar();
                System.out.println(v.getMatricula() + " velocidad actual: " + v.getVelocidadActual());
            }
        }
    }

    static void calcularSeguros() {
        boolean hayAsegurables = false;

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if (v instanceof Asegurable) {

                hayAsegurables = true;

                Asegurable a = (Asegurable) v;  // cast clásico

                System.out.println(v.getMatricula() + " -> seguro: " + a.calcularSeguro() + " €");
            }
        }

        if (!hayAsegurables) {
            System.out.println("No hay vehículos asegurables.");
        }
    }
}
