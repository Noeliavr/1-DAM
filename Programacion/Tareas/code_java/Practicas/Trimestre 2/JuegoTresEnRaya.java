/*
 * Fecha: Dic 2025
 * Versióh: 1.0
 *
*/
import java.util.Scanner;
public class JuegoTresEnRaya {

    static final int TAMANIO_TABLERO = 3; // variable global de la dimensión del tablero

    // colores ansi
    static final String RESET = "\u001B[om";
    static final String RED = "\u001B[31m";
    static final String BLUE = "\u001B[34m";

    /*
     * Método inicializar tablero
     * Parámetros de entrada: ninguno
     * Salida: un array de TAMANIO_TABLERO con caracteres en blanco
     */
    public static char[][] inicializarTablero() {
        char[][] t = new char[TAMANIO_TABLERO][TAMANIO_TABLERO];
        for (int i = 0; i < TAMANIO_TABLERO; i++) { // bucle recorre filas
            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                t[i][j] = ' ';
            }

        }
        return t; // devuelve el tablero creado y con espacios en blanco

    }

    /*
     * Método mostrarTablero: muestra por consola las posiciones de ese momento en
     * el tablero. Las X en color rojo y las círculos en color AZUL
     * Recibe como parámetro de entrada un array bidimensional que representa el
     * tablero del juego en ese momento
     * No devuelve ningún valor
     */
    public static void mostrarTablero(char[][] t) {
        System.out.println("  0    1    2 ");
        System.out.println("0   |    |   |");
        System.out.println("  --+----+---+");
        System.out.println("1   |    |   |");
        System.out.println("  --+----+---+");
        System.out.println("2   |    |   |");


        for (int i = 0; i < TAMANIO_TABLERO; i++) { // for recorre filas

            for (int j = 0; j < TAMANIO_TABLERO; j++) {
                System.out.println(t[i][j]);

            }

        }

    }

    public static void bienvenidaJuego() {
        String mensaje = "  _______              ______         _____                   \r\n" + //
                " |__   __|            |  ____|       |  __ \\                  \r\n" + //
                "    | |_ __ ___  ___  | |__   _ __   | |__) |__ _ _   _  __ _ \r\n" + //
                "    | | '__/ _ \\/ __| |  __| | '_ \\  |  _  // _` | | | |/ _` |\r\n" + //
                "    | | | |  __/\\__ \\ | |____| | | | | | \\ \\ (_| | |_| | (_| |\r\n" + //
                "    |_|_|  \\___||___/ |______|_| |_| |_|  \\_\\__,_|\\__, |\\__,_|\r\n" + //
                "                                                   __/ |      \r\n" + //
                "                                                  |___/       ";
        System.out.println(mensaje);
        System.out.println("Bienvenido al juego. Comenzamos!!");
    }
    public static void colocarJugadorO(){
        scanner sc=new Scanner(System.in);
        System.out.println("Jugador O, seleccione fila y columna(0-2)");
        System.err.println("Seleccione fila (0-2)");
        int fila=sc.nextInt(new char[fila][]);
        System.out.println("Seleccione columna (0-2)");
        int columna=sc.nextInt(new char[fila][columna]);

     }

    public static void main(String[] args) {
        bienvenidaJuego();
        

        char[][] tablero = inicializarTablero();
        mostrarTablero(tablero);
        colocarJugadorO(tablero);


}
    }


