package Proyectos.PlataformaDeCursos;

import java.util.LinkedHashSet;

public class Favorito {
    private LinkedHashSet<String> cursosFav;

    public Favorito() {
        cursosFav = new LinkedHashSet<>();
    }

    public void agregarFavorito(String curso) {
        if (cursosFav.add(curso)) {
            System.out.println("Curso agregado: " + curso);
        } else {
            System.out.println("El curso '" + curso + "' ya está en favoritos.");
        }
    }

    public void eliminarFavorito(String curso) {
        if (cursosFav.remove(curso)) {
            System.out.println("Curso eliminado: " + curso);
        } else {
            System.out.println("El curso '" + curso + "' no estaba en favoritos.");
        }
    }

    public void mostrarFavoritos() {
        System.out.println("Cursos favoritos: " + cursosFav);
    }
}
