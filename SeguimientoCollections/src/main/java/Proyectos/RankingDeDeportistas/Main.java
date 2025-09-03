package Proyectos.RankingDeDeportistas;

public class Main {
    public static void main(String[] args) {
        RankingDeportista rankingDeportista = new RankingDeportista();

        rankingDeportista.agregarDeportista(new Deportista("Gomez", 90));
        rankingDeportista.agregarDeportista(new Deportista("Perez", 95));
        rankingDeportista.agregarDeportista(new Deportista("Lopez", 95));
        rankingDeportista.agregarDeportista(new Deportista("Alvarez", 85));
        rankingDeportista.agregarDeportista(new Deportista("Martinez", 100));
        rankingDeportista.agregarDeportista(new Deportista("Zapata", 95));
        rankingDeportista.mostrarTop10();
    }
}
