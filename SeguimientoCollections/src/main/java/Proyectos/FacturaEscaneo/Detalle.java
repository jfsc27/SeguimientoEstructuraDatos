package Proyectos.FacturaEscaneo;

public class Detalle {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Detalle(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarCantidad(int extra) {
        this.cantidad += extra;
    }

    public double getSubtotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " x" + cantidad + " @ $" + precioUnitario + " = $" + getSubtotal();
    }
}
