package Proyectos.TurnoDeLaboratorio;

import java.util.LinkedList;

public class ColaLaboratorio {
    private LinkedList<String> cola;

    public ColaLaboratorio() {
        cola = new LinkedList();
    }

    public void ingresarNormal(String estudiante){
        cola.addLast(estudiante);
        System.out.println("Turno normal asignado a: " + estudiante);
    }

    public void ingresarPreferencial(String estudiante){
        cola.addFirst(estudiante);
        System.out.println("Turno preferencial asignado a: " + estudiante);
    }

    public String atender(){
        if (!cola.isEmpty()){
            String atendido = cola.removeFirst();
            System.out.println("Atendiendo a: " + atendido);
            return atendido;
        } else {
            System.out.println("No hay estudiantes en la cola");
            return null;
        }
    }

    public void mostrarCola(){
        System.out.println("Cola actual: " + cola);
    }
}
