package examen.utils;

public class Validaciones {
        public static boolean codigoEmpleadoValido(String codigo) {

        return codigo.matches("(FIJ|HOR|COM)-[0-9]{4}-[0-9]{3}");
    }
}
