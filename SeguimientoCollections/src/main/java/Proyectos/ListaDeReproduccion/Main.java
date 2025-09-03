package Proyectos.ListaDeReproduccion;

public class Main {
    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();

        lista.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen"));
        lista.agregarCancion(new Cancion("Imagine", "John Lennon"));
        lista.agregarCancion(new Cancion("Billie Jean", "Michael Jackson"));
        lista.agregarCancion(new Cancion("Smells Like Teen Spirit", "Nirvana"));

        lista.mostrarLista();
        lista.siguiente();
        lista.siguiente();
        lista.anterior();

        lista.mover(0, 3); // mover Queen al final
        lista.mostrarLista();
    }
}
