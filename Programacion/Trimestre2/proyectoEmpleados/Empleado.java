package proyectoEmpleados;
public class Empleado extends Persona {

    //Atributos
    private String cargo;
    private double sueldo;
    private Departamento departamento;  //asociación

    //Constructor
    public Empleado(String dni, String nombre, int edad, String estado, 
            String categoria, double sueldo, Departamento departamento) {
        super(dni, nombre, edad, estado);
        this.cargo = categoria;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    //Métodos

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void subeSueldo(int cantidad) {
        sueldo += cantidad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado{" + "cargo=" + cargo + ", sueldo=" + sueldo + ", departamento=" + departamento + '}';
    } 

}
