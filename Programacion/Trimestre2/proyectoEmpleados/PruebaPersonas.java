package proyectoEmpleados;

public class PruebaPersonas {

    public static void main(String args[]) {
        //Creamos personas
        Persona per1 = new Persona("153647458S", "Pepe", 35, "casado");
        Persona per2 = new Persona("452697419Z", "Maria", 25, "soltera");

        //Aplicamos métodos
        System.out.println("Nombre: " + per2.getNombre());
        per2.cumpleaños();
        System.out.println("Edad: " + per2.getEdad());
        per2.setEstado("casada");
        System.out.println("Estado: "+ per2.getEstado());
        System.out.println("Información completa: " + per2.toString());
    }
}
