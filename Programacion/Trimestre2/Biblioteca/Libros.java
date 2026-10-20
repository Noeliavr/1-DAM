package Biblioteca;

public class Libros {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
 
    //Constructor
    public Libros(String titulo, String autor, String isbn, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.precio=precio;


    }

    //GETTERS y SETTERS
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
