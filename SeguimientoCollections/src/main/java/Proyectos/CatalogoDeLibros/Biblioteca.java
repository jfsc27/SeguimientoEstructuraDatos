package Proyectos.CatalogoDeLibros;

import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    public void agregarLibro(Libro libro) {
       if (!buscarLibroISBN(libro)) {
           libros.add(libro);
       }
    }

    public void eliminarLibro(Libro libro) {
        if (buscarLibroISBN(libro)) {
            libros.remove(libro);
        }
    }

    private boolean buscarLibroISBN(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getISBN() == (libro.getISBN())) {
                return true;
            }
        }
        return false;
    }

    public void buscarLibroPorAutor(String autorBuscar) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autorBuscar)) {
                System.out.println(libro.getTitulo());
            }
        }
    }

    public void listaAnioAscendente() {
        libros.sort(Comparator.comparingInt(Libro::getAnio));
        for (Libro libro : libros) {
            System.out.println(libro.getAutor() + " - " + libro.getAnio());
        }
    }

    public void ultimos5Libros (){
        libros.sort(Comparator.comparingInt(Libro::getAnio).reversed());
        for (Libro libro : libros) {
            System.out.println(libro.getAutor() + " - " + libro.getAnio());
        }
    }
}
