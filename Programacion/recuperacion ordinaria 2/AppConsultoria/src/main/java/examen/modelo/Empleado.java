package examen.modelo;

import examen.excepciones.CodigoNoValidoException;
import examen.utils.Validaciones;
import java.io.Serializable;

public abstract class Empleado implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final double DIAS_LABORALES_MES = 22;
    public static final double HORAS_JORNADA = 8;
    private String codigo;
    private String DNI;
    private String Nombre;
    private String correoElectronico;
    private double salarioBase;
    private String estadoActivo;
    public Empleado(String codigo, String DNI, String nombre, String correoElectronico, double salarioBase,
            String estadoActivo) throws CodigoNoValidoException{
                if(!Validaciones.codigoEmpleadoValido(codigo)){
                    throw new CodigoNoValidoException("El código del empleado no es válido.");
                }
        this.codigo = codigo;
        this.DNI = DNI;
        this.Nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.salarioBase = salarioBase;
        this.estadoActivo = estadoActivo;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getEstadoActivo() {
        return estadoActivo;
    }
    public void setEstadoActivo(String estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public abstract double calcularCosteMensual();
    public abstract double calcularCosteProyecto(int dias);
    public abstract String getTipoProyecto();
    public abstract String getTipoEmpleado();
    public abstract String getDatosEspecificos();
    public double calcularCosteDiaAproximado() {
        double costedia = calcularCosteMensual()/DIAS_LABORALES_MES;
        return costedia;
    }

    @Override
    public String toString() {
        return "Empleado [codigo=" + codigo + ", DNI=" + DNI + ", Nombre=" + Nombre + ", correoElectronico="
                + correoElectronico + ", salarioBase=" + salarioBase + ", estadoActivo=" + estadoActivo + "]";
    }
    
}
