package Proyectos.InventarioPorCodigo;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario() {
        productos = new HashMap<>();
    }

    // Agregar producto
    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Actualizar stock de un producto
    public void actualizarStock(String codigo, int nuevoStock) {
        Producto p = productos.get(codigo);
        if (p != null) {
            p.setStock(nuevoStock);
            System.out.println("Stock actualizado: " + p);
        } else {
            System.out.println("No existe producto con código: " + codigo);
        }
    }

    // Consultar precio por código
    public void consultarPrecio(String codigo) {
        Producto producto = productos.get(codigo);
        if (producto != null) {
            System.out.println("El precio de " + producto.getNombre() + " es $" + producto.getPrecio());
        } else {
            System.out.println("No existe producto con código: " + codigo);
        }
    }

    // Listar productos con stock = 0
    public void listarFaltantes() {
        System.out.println("Productos faltantes:");
        for (Producto producto : productos.values()) {
            if (producto.getStock() == 0) {
                System.out.println(" - " + producto);
            }
        }
    }
}
