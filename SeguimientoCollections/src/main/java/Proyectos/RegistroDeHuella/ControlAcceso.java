package Proyectos.RegistroDeHuella;

import java.util.HashSet;

public class ControlAcceso {
    private HashSet<String> huellas;

    public ControlAcceso() {
        huellas = new HashSet<>();
    }

    public void registrarHuella(String id) {
        if (huellas.add(id)) {
            System.out.println("Huella " + id + " registrada con éxito.");
        } else {
            System.out.println("ERROR: La huella " + id + " ya está registrada.");
        }
    }

    public void mostrarTotalHuellas(){
        System.out.println("Total huellas " + huellas.size());
    }

    public void mostrarHuellasAlmacendas(){
        System.out.println("Total huellas almacenadas " + huellas);
    }
}
