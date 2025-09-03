package Proyectos.FacturaEscaneo;

import java.util.LinkedHashMap;

public class Factura {
    private LinkedHashMap<String, Detalle> items;

    public Factura() {
        items = new LinkedHashMap<>();
    }

    public void escanearProducto(String codigo, String nombre, double precioUnitario, int cantidad) {
        if (items.containsKey(codigo)) {
            items.get(codigo).agregarCantidad(cantidad);
        } else {
            items.put(codigo, new Detalle(nombre, precioUnitario, cantidad));
        }
    }

    public void imprimirFactura() {
        double subtotal = 0;
        double iva;
        double total;

        System.out.println("=========== FACTURA ===========");
        for (Detalle detalle : items.values()) {
            System.out.println(detalle);
            subtotal += detalle.getSubtotal();
        }

        iva = subtotal * 0.19; // 19% de IVA
        total = subtotal + iva;

        System.out.println("-------------------------------");
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("TOTAL:    $" + total);
        System.out.println("===============================");
    }
}
