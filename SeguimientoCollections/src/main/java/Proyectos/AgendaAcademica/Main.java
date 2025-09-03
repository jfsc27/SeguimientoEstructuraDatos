package Proyectos.AgendaAcademica;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarActividad(LocalDate.of(2025, 9, 1), new Actividad("Examen de cálculo"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 3), new Actividad("Entrega de proyecto de programación"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 5), new Actividad("Reunión con tutor"));
        agenda.agregarActividad(LocalDate.of(2025, 9, 3), new Actividad("Presentación de laboratorio"));

        var proxima = agenda.obtenerProximaActividad();
        System.out.println("Próxima actividad: " + proxima.getKey() + " -> " + proxima.getValue());

        agenda.generarReporte(LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 4));
    }
}
