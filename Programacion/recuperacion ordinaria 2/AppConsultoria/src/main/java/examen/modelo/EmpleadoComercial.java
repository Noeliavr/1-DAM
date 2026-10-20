package examen.modelo;

import examen.excepciones.CodigoNoValidoException;

public abstract class EmpleadoComercial extends Empleado {
    private static final long serialVersionUID = 1L;
    private int ventasMensuales;
    private double porcentajeComision;

    public EmpleadoComercial(String codigo, String DNI, String nombre, String correoElectronico, double salarioBase,
            String estadoActivo, int ventasMensuales, double porcentajeComision) throws CodigoNoValidoException {
        super(codigo, DNI, nombre, correoElectronico, salarioBase, estadoActivo);
        this.ventasMensuales = ventasMensuales;
        this.porcentajeComision = porcentajeComision;
    }
    public int getVentasMensuales() {
        return ventasMensuales;
    }
    public void setVentasMensuales(int ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    public double getPorcentajrComision() {
        return porcentajeComision;
    }
    public void setPorcentajrComision(double porcentajrComision) {
        this.porcentajeComision = porcentajrComision;
    }
    public String getTipoEmpleado(){
        return "Empleado comercial";
    }
    public String getDatosEspecificos(){
        return String.format("ventas mensuales: %4d, porcentaje de comision: %2f%n", ventasMensuales, porcentajeComision);
    }
    public double calcularCosteMensual(){
        return(getSalarioBase()+(ventasMensuales *porcentajeComision / 100));
    }
    public double calcularCosteProyecto(int dias){
        return ((calcularCosteMensual()/ DIAS_LABORALES_MES)* dias);
    }
    @Override
    public String toString() {
        return super.toString() + "EmpleadoComercial [ventasMensuales=" + ventasMensuales + ", porcentajrComision=" + porcentajeComision
                + "]";
    }
    
}
