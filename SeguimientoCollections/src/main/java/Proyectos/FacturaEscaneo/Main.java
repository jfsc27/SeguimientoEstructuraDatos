package Proyectos.FacturaEscaneo;

public class Main {
    public static void main(String[] args) {
        Factura factura = new Factura();

        factura.escanearProducto("A1", "Leche", 3500, 2);
        factura.escanearProducto("B2", "Pan", 2000, 1);
        factura.escanearProducto("C3", "Huevos", 12000, 1);
        factura.escanearProducto("B2", "Pan", 2000, 2); // Escaneado otra vez

        factura.imprimirFactura();
    }
}
