package Proyectos.AgendaDeReuniones;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarReunion(new Reunion(LocalDateTime.of(2025, 8, 30, 10, 0), "Reunión con clientes"));
        agenda.agregarReunion(new Reunion(LocalDateTime.of(2025, 9, 2, 15, 30), "Presentación proyecto"));
        agenda.agregarReunion(new Reunion(LocalDateTime.of(2025, 8, 31, 9, 0), "Reunión interna"));

        agenda.mostrarAgenda();

        System.out.println("\nPrimera reunión: " + agenda.primeraReunion());
        System.out.println("Última reunión: " + agenda.ultimaReunion());

        System.out.println();
        agenda.mostrarRangoMes();
    }
}
