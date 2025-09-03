package Proyectos.InventarioPorCodigo;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.agregarProducto(new Producto("A1", "Martillo", 25000, 5));
        inv.agregarProducto(new Producto("B2", "Clavos", 5000, 0));
        inv.agregarProducto(new Producto("C3", "Taladro", 150000, 2));

        inv.consultarPrecio("A1");
        inv.consultarPrecio("B2");

        inv.actualizarStock("A1", 0);

        inv.listarFaltantes();
    }
}
