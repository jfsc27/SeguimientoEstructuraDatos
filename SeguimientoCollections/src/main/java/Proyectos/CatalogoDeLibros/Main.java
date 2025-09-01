package Proyectos.CatalogoDeLibros;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("La divina comedia", "Dante", 1400, 27));
        biblioteca.agregarLibro(new Libro("Game of thrones", "George Martin", 1999, 12));
        biblioteca.agregarLibro(new Libro("Call of Cthulhu", "Howard Lovecraft", 1899, 34));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel Marquez",1067, 56));
        biblioteca.agregarLibro(new Libro("La odisea", "Homero", 931, 90));

        System.out.println("-----------------------------");
        System.out.println("Buscar libro por autor");
        String autor = "Dante";
        biblioteca.buscarLibroPorAutor(autor);

        System.out.println("-----------------------------");
        System.out.println("Lista año ascendente");
        biblioteca.listaAnioAscendente();

        System.out.println("-----------------------------");
        System.out.println("Ultimos cinco libros");
        biblioteca.ultimos5Libros();
    }
}
