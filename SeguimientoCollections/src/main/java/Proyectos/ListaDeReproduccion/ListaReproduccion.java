package Proyectos.ListaDeReproduccion;

import java.util.LinkedList;

public class ListaReproduccion {
    private LinkedList<Cancion> canciones;
    private int cursor; // posición actual

    public ListaReproduccion() {
        canciones = new LinkedList<>();
        cursor = -1; // aún no hay canción seleccionada
    }

    // Agregar canción al final
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
        if (cursor == -1) cursor = 0; // primera canción agregada
    }

    // Avanzar
    public void siguiente() {
        if (cursor < canciones.size() - 1) {
            cursor++;
            System.out.println("▶ Ahora suena: " + canciones.get(cursor));
        } else {
            System.out.println("🚫 Fin de la lista.");
        }
    }

    // Retroceder
    public void anterior() {
        if (cursor > 0) {
            cursor--;
            System.out.println("▶ Ahora suena: " + canciones.get(cursor));
        } else {
            System.out.println("🚫 Inicio de la lista.");
        }
    }

    // Mover canción de una posición a otra
    public void mover(int desde, int hasta) {
        if (desde < 0 || desde >= canciones.size() || hasta < 0 || hasta >= canciones.size()) {
            System.out.println("⚠ Posiciones inválidas");
            return;
        }
        Cancion c = canciones.remove(desde);
        canciones.add(hasta, c);
        System.out.println("🔀 Canción movida: " + c);
    }

    // Mostrar lista completa
    public void mostrarLista() {
        System.out.println("🎶 Lista de reproducción:");
        for (int i = 0; i < canciones.size(); i++) {
            String actual = (i == cursor) ? " << en reproducción" : "";
            System.out.println((i + 1) + ". " + canciones.get(i) + actual);
        }
    }
}
