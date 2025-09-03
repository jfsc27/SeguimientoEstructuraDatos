package Proyectos.TarifasPorTramos;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class TarifasPeaje {
    public static void main(String[] args) {
        // Tramos: clave = peso mínimo, valor = tarifa
        TreeMap<Integer, BigDecimal> tarifas = new TreeMap<>();
        tarifas.put(0,   new BigDecimal("5000"));   // hasta <1000 kg
        tarifas.put(1000, new BigDecimal("8000"));  // 1000-1999
        tarifas.put(2000, new BigDecimal("12000")); // 2000-2999
        tarifas.put(3000, new BigDecimal("20000")); // 3000 o más

        // Peso de prueba
        int pesoVehiculo = 2200;

        // Buscar tramo aplicable con floorEntry (mayor clave <= peso)
        Map.Entry<Integer, BigDecimal> tramo = tarifas.floorEntry(pesoVehiculo);

        if (tramo != null) {
            System.out.println("Peso: " + pesoVehiculo + " kg");
            System.out.println("Tarifa aplicable: $" + tramo.getValue());
        } else {
            System.out.println("No hay tarifa definida para ese peso");
        }
    }
}
