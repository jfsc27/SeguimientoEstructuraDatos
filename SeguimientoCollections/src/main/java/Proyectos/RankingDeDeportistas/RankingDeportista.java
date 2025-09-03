package Proyectos.RankingDeDeportistas;

import java.util.Comparator;
import java.util.TreeSet;

public class RankingDeportista {
    private TreeSet<Deportista> ranking;

    public RankingDeportista() {
        ranking = new TreeSet<>(
                Comparator.comparingInt(Deportista::getPuntaje).reversed()
                        .thenComparing(Deportista::getApellido)
        );
    }

    public void agregarDeportista(Deportista deportista) {
        ranking.add(deportista);
    }

    public void mostrarTop10() {
        System.out.println("===== TOP 10 DEPORTISTAS =====");
        int count = 0;
        for (Deportista deportista : ranking) {
            System.out.println((count + 1) + ". " + deportista);
            count++;
            if (count == 10) break;
        }
    }
}
