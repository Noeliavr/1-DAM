package proyectoEmpleados;


public class Persona {
    
    //Atributos (privados)
    private String DNI;
    private String nombre;
    private int edad;
    private String estado;

    //Constructor
    public Persona(String dni, String nombre, int edad, String estado) {
        this.DNI = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }   

    //Métodos (públicos)
    public String getDNI() {
        return DNI;
    }  

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    

    public void cumpleaños() {
        edad++;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }

}
