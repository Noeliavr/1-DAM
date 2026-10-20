package proyectoEmpleados;

public class Departamento {
    // Atributos
    // Identificador del departamento
    private String id;
    // Nombre del departamento
    private String nombre;
    // Localización del departamento
    private String localizacion;

    //Constructor
    public Departamento(String id, String nombre, String localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    //Métodos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }    

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", localizacion=" + localizacion + '}';
    }
    
}
