package Proyectos.AgendaAcademica;

public class Actividad {
    private String descripcion;

    public Actividad(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
