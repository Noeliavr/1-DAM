package proyectoEmpleados;

public class PruebaEmpleados {

    public static void main(String args[]) {
        //Creamos un departamento
        Departamento informatica = new Departamento("1Inf", "Informática", "Madrid");
        //Creamos empleados
        Empleado emp1 = new Empleado("153647458S", "Pepe", 35, "casado", "Analista", 1500, informatica);
        Empleado emp2 = new Empleado("452697419Z", "Maria", 25, "soltera", "Programadora", 1000, informatica);

        //Aplicamos métodos
        System.out.println(emp2.toString());
        emp2.subeSueldo(100);
        System.out.println("Sueldo: " + emp2.getSueldo());
    }
}
