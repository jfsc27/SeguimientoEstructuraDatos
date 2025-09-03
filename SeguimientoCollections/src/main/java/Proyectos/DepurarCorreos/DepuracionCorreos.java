package Proyectos.DepurarCorreos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DepuracionCorreos {
    public static void main(String[] args) {

        Set<String> correos = new HashSet<>();
        correos.add("juan@gmail.com");
        correos.add("ana@yahoo.com");
        correos.add("carlos@outlook.com");
        correos.add("maria@gmail.com");
        correos.add("pedro@spam.com");
        correos.add("sofia@banned.com");

        Set<String> dominiosVetados = Set.of("spam.com", "banned.com");

        System.out.println("Tamaño antes de depuración: " + correos.size());

        Iterator<String> it = correos.iterator();
        while (it.hasNext()) {
            String correo = it.next();

            String dominio = correo.substring(correo.indexOf("@") + 1);

            if (dominiosVetados.contains(dominio)) {
                it.remove();
            }
        }

        System.out.println("Tamaño después de depuración: " + correos.size());
        System.out.println("Correos válidos: " + correos);
    }
}
