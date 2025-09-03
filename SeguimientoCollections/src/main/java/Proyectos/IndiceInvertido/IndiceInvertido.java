package Proyectos.IndiceInvertido;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IndiceInvertido {
    private Map<String, TreeSet<Integer>> indice;

    public IndiceInvertido() {
        indice = new HashMap<>();
    }

    // Agregar una ocurrencia de palabra en una página
    public void agregar(String palabra, int pagina) {
        indice.putIfAbsent(palabra, new TreeSet<>()); // si no existe, lo crea
        indice.get(palabra).add(pagina); // TreeSet evita duplicados y ordena
    }

    // Consultar páginas de una palabra
    public Set<Integer> consultar(String palabra) {
        return indice.getOrDefault(palabra, new TreeSet<>());
    }

    // Mostrar todo el índice
    public void mostrarIndice() {
        System.out.println("===== ÍNDICE INVERTIDO =====");
        for (var entry : indice.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
