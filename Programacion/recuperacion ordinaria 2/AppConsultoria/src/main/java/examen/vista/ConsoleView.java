package examen.vista;

import examen.utils.Ansi;

public class ConsoleView {
    public void mostrarMenu(){
        System.out.println(Ansi.ANSI_NEGRITA +"==== Gestión de Consultoría Tecnológica ===="+ Ansi.ANSI_RESET);

        System.out.println("1. Cargar empleados desde fichero");
        System.out.println("2. Alta empleado");
        System.out.println("3. Mostrar todos los empleados");
        System.out.println("4. Buscar empleado ppr código");
        System.out.println("5. Crear proyecto");
        System.out.println("6. Asignar empleado a proyecto");
        System.out.println("7. Mostrar proyectos");
        System.out.println("8. Calcular coste de un proyecto");
        System.out.println("9. Cerrar proyecto");
        System.out.println("10. Exportar empleados a fichero de texto");
        System.out.println("11. Guardar proyectos en fichero binario");
        System.out.println("12. Cargar proyecto en fichero binario");
        System.out.println("13. Insertar empleados en base de datos");
        System.out.println("0.Salir");
    }
    public void mostrarMenuAltaEmpleado(){
        System.out.println(Ansi.ANSI_NEGRITA+"==== ALTA DE EMPLEADO ===="+Ansi.ANSI_RESET);

        System.out.println("1. Empleado fijo");
        System.out.println("2. Empleo por horas");
        System.out.println("3. Empleado comercial");
        System.out.println("0. Volver");
    }
}
