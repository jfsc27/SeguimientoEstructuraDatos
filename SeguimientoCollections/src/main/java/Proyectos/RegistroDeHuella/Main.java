package Proyectos.RegistroDeHuella;

public class Main {
    public static void main(String[] args) {
        ControlAcceso sistema = new ControlAcceso();

        sistema.registrarHuella("A123");
        sistema.registrarHuella("B456");
        sistema.registrarHuella("C789");
        sistema.registrarHuella("B456");
        sistema.registrarHuella("A123");

        sistema.mostrarTotalHuellas();
        sistema.mostrarHuellasAlmacendas();
    }
}
