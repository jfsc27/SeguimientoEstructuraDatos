package Proyectos.CatalogoDeLibros;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private int ISBN;

    public Libro(String titulo, String autor, int anio, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
