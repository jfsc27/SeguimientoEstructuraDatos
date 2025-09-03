package Proyectos.AgendaDeReuniones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.TreeSet;

public class Agenda {
    private TreeSet<Reunion> reuniones;

    public Agenda() {
        reuniones = new TreeSet<>();
    }

    public void agregarReunion(Reunion reunion) {
        if (reuniones.add(reunion)) {
            System.out.println("Reunión agregada: " + reunion);
        } else {
            System.out.println("Ya existe una reunión en esa fecha-hora.");
        }
    }

    public Reunion primeraReunion() {
        return reuniones.first();
    }

    public Reunion ultimaReunion() {
        return reuniones.last();
    }

    public void mostrarAgenda() {
        System.out.println("Agenda completa:");
        for (Reunion reunion : reuniones) {
            System.out.println(" - " + reunion);
        }
    }

    public void mostrarRangoMes() {
        LocalDate hoy = LocalDate.now();
        LocalDateTime inicio = hoy.atStartOfDay();
        LocalDateTime fin = hoy.withDayOfMonth(hoy.lengthOfMonth()).atTime(LocalTime.MAX);

        System.out.println("Reuniones desde hoy hasta fin de mes:");
        for (Reunion reunion : reuniones) {
            if (!reunion.getFechaHora().isBefore(inicio) && !reunion.getFechaHora().isAfter(fin)) {
                System.out.println(" - " + reunion);
            }
        }
    }
}
