package Proyectos.AgendaAcademica;

import java.time.LocalDate;
import java.util.*;

public class Agenda {
    private TreeMap<LocalDate, List<Actividad>> agenda;

    public Agenda() {
        agenda = new TreeMap<>();
    }

    public void agregarActividad(LocalDate fecha, Actividad actividad) {
        agenda.computeIfAbsent(fecha, k -> new ArrayList<>()).add(actividad);
    }

    public Map.Entry<LocalDate, List<Actividad>> obtenerProximaActividad() {
        LocalDate hoy = LocalDate.now();
        return agenda.ceilingEntry(hoy);
    }

    public void generarReporte(LocalDate desde, LocalDate hasta) {
        SortedMap<LocalDate, List<Actividad>> rango = agenda.subMap(desde, true, hasta, true);

        System.out.println("===== REPORTE DE ACTIVIDADES =====");
        for (Map.Entry<LocalDate, List<Actividad>> entry : rango.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Actividad act : entry.getValue()) {
                System.out.println(" - " + act);
            }
        }
    }
}
