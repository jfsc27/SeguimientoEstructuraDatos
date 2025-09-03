package Proyectos.PlataformaDeCursos;

public class Main {
    public static void main(String[] args) {
        Favorito fav = new Favorito();

        fav.agregarFavorito("Java");
        fav.agregarFavorito("Python");
        fav.agregarFavorito("JavaFX");
        fav.agregarFavorito("Java");

        fav.mostrarFavoritos();

        fav.eliminarFavorito("Python");
        fav.mostrarFavoritos();

        fav.agregarFavorito("Python");
        fav.mostrarFavoritos();
    }
}
