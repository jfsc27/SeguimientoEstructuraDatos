package Proyectos.AgendaDeReuniones;

import java.time.LocalDateTime;

public class Reunion implements Comparable<Reunion>{
    private LocalDateTime fechaHora;
    private String asunto;

    public Reunion(LocalDateTime fechaHora, String asunto) {
        this.fechaHora = fechaHora;
        this.asunto = asunto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getAsunto() {
        return asunto;
    }

    @Override
    public int compareTo(Reunion o) {
        return this.fechaHora.compareTo(o.fechaHora);
    }

    @Override
    public String toString() {
        return fechaHora + " → " + asunto;
    }
}
