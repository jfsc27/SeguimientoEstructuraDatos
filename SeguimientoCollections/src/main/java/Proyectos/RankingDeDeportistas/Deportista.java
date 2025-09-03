package Proyectos.RankingDeDeportistas;

public class Deportista {
    private String apellido;
    private int puntaje;

    public Deportista(String apellido, int puntaje) {
        this.apellido = apellido;
        this.puntaje = puntaje;
    }

    public String getApellido() {
        return apellido;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return apellido + " (" + puntaje + ")";
    }
}
