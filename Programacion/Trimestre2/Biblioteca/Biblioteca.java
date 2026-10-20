package Biblioteca;

public class Biblioteca {
    //Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private int numLibrosTotales;
    //Constructor
    public Biblioteca(String nombre,String direccion,String telefono,int numLibrosTotales){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.numLibrosTotales=numLibrosTotales;
        

        
    
    }
    //Metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getNumLibrosTotales() {
        return numLibrosTotales;
    }
    public void setNumLibrosTotales(int numLibrosTotales) {
        this.numLibrosTotales = numLibrosTotales;
    }
    

}
