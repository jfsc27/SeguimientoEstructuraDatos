package Proyectos.TurnoDeLaboratorio;

public class Main {
    public static void main(String[] args) {
        ColaLaboratorio lab = new ColaLaboratorio();

        lab.ingresarNormal("Juan");
        lab.ingresarNormal("Ana");
        lab.ingresarPreferencial("Pedro (Equipo Reservado)");
        lab.ingresarNormal("Lucía");

        lab.mostrarCola();

        lab.atender();
        lab.mostrarCola();

        lab.atender();
        lab.mostrarCola();
    }
}
