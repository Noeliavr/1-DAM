package examen.modelo;

import examen.excepciones.CodigoNoValidoException;

public abstract class EmpleadoFijo extends Empleado {
    private static final long serialVersionUID = 1L;
    private static final double importeTrienio = 45.0;
    private double plusResponsabilidad;
    private int numeroTrienios;

    public EmpleadoFijo(String codigo, String DNI, String nombre, String correoElectronico, double salarioBase,
            String estadoActivo, double plusResponsabilidad, int numeroTrienios) throws CodigoNoValidoException {
        super(codigo, DNI, nombre, correoElectronico, salarioBase, estadoActivo);
        this.plusResponsabilidad = plusResponsabilidad;
        this.numeroTrienios = numeroTrienios;
    }
    public double getPlusResponsabilidad() {
        return plusResponsabilidad;
    }
    public void setPlusResponsabilidad(double plusResponsabilidad) {
        this.plusResponsabilidad = plusResponsabilidad;
    }
    public int getNumeroTrienios() {
        return numeroTrienios;
    }
    public void setNumeroTrienios(int numeroTrienios) {
        this.numeroTrienios = numeroTrienios;
    }
    public double calcularCosteMensual(){
        return (getSalarioBase()+getPlusResponsabilidad()+(getNumeroTrienios()* importeTrienio));
    }
    public String getTipoEmpleado(){
        return "Empleado fijo";
    }
    public String getDatosEspecificos(){
        return String.format("Plus de responsabilidad: %2f, numero trienios %4d%n", plusResponsabilidad, numeroTrienios);
    }
    public double calcularCosteProyecto(int dias){
        return ((calcularCosteMensual() / 22)* calcularCosteDiaAproximado());
    }
    @Override
    public String toString() {
        return super.toString() +"EmpleadoFijo [plusResponsabilidad=" + plusResponsabilidad + ", numeroTrienios=" + numeroTrienios + "]";
    }
    
}
