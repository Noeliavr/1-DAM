package examen.modelo;
import java.util.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashMap;
import java.util.Map;

public class Proyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codigoProyecto;
    private String nombreProyecto;
    private String cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaFinReal;
    private EstadoProyecto estado;
    private LinkedHashMap <String, Empleado> empleadosActivos;
    private LinkedHashMap<String, Integer> diasAsignadosPorEmpleado;
    public Proyecto(int codigoProyecto, String nombreProyecto, String cliente, LocalDate fechaInicio,
            LocalDate fechaFin, LocalDate fechaFinReal, EstadoProyecto estado,
            LinkedHashMap<String, Empleado> empleadosActivos, LinkedHashMap<String, Integer> diasAsignadosPorEmpleado) {
        this.codigoProyecto = codigoProyecto;
        this.nombreProyecto = nombreProyecto;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaFinReal = null;
        this.estado = estado.ABIERTO;
        this.empleadosActivos = new LinkedHashMap<>();
        this.diasAsignadosPorEmpleado = new LinkedHashMap<>();

        
    }
    public void asignarEmpleado(Empleado empleado, int dias) {
        empleadosActivos.put(empleado.getCodigo(), empleado);
        diasAsignadosPorEmpleado.put(empleado.getCodigo(), dias);
    }

    public boolean tieneEmpleadoAsignado(String codigoEmpleado) {
        boolean existe = empleadosActivos.containsKey(codigoEmpleado);
        return existe;
    }

    public int calcularDuracionPrevistaEnDias() {
        int dias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1;
        return dias;
    }

    public double calcularCosteTotalEstimado() {
        double total = 0;
        for (Map.Entry<String, Empleado> entrada : empleadosActivos.entrySet()) {
            String codigoEmpleado = entrada.getKey();
            Empleado empleado = entrada.getValue();
            int dias = diasAsignadosPorEmpleado.get(codigoEmpleado);
            total += empleado.calcularCosteProyecto(dias);
        }
        return total;
    }

    public void cerrar(LocalDate fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
        this.estado = EstadoProyecto.CERRADO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getCodigoProyecto() {
        return codigoProyecto;
    }
    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }
    public String getNombreProyecto() {
        return nombreProyecto;
    }
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public LocalDate getFechaFinReal() {
        return fechaFinReal;
    }
    public void setFechaFinReal(LocalDate fechaFinReal) {
        this.fechaFinReal = fechaFinReal;
    }
    public EstadoProyecto getEstado() {
        return estado;
    }
    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }
    public LinkedHashMap<String, Empleado> getEmpleadosActivos() {
        return empleadosActivos;
    }
    public void setEmpleadosActivos(LinkedHashMap<String, Empleado> empleadosActivos) {
        this.empleadosActivos = empleadosActivos;
    }
    public LinkedHashMap<String, Integer> getDiasAsignadosPorEmpleado() {
        return diasAsignadosPorEmpleado;
    }
    public void setDiasAsignadosPorEmpleado(LinkedHashMap<String, Integer> diasAsignadosPorEmpleado) {
        this.diasAsignadosPorEmpleado = diasAsignadosPorEmpleado;
    }

    


}
