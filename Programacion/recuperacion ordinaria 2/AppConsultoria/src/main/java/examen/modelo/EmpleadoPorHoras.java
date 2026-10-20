package examen.modelo;

import examen.excepciones.CodigoNoValidoException;

public abstract class EmpleadoPorHoras extends Empleado {
    private static final long serialVersionUID = 1L;
    private double precioHora;
    private double horasMensuales;
    
    public EmpleadoPorHoras(String codigo, String DNI, String nombre, String correoElectronico, double salarioBase,
            String estadoActivo, double precioHora, double horasMensuales) throws CodigoNoValidoException {
        super(codigo, DNI, nombre, correoElectronico, salarioBase, estadoActivo);
        this.precioHora = precioHora;
        this.horasMensuales = horasMensuales;
    }
    public double getPrecioHora() {
        return precioHora;
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    public double getHorasMensuales() {
        return horasMensuales;
    }
    public void setHorasMensuales(double horasMensuales) {
        this.horasMensuales = horasMensuales;
    }
    @Override
    public double calcularCosteMensual(){
        return (getSalarioBase()+ (precioHora*horasMensuales));
    }
    @Override
    public String getTipoEmpleado(){
        return "Empleado por horas";
    }
    @Override
    public String getDatosEspecificos(){
        return String.format("precio por hora: %2f, horas mensuales: %2f%n", precioHora, horasMensuales);
    }
    @Override
    public double calcularCosteProyecto(int dias){
        return (dias * HORAS_JORNADA *precioHora);
    }
    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorHoras [precioHora=" + precioHora + ", horasMensuales=" + horasMensuales + "]";
    }
    
}
