package Proyectos.IndiceInvertido;

public class Main {
    public static void main(String[] args) {
        IndiceInvertido indice = new IndiceInvertido();

        // Simulación de ocurrencias
        indice.agregar("java", 10);
        indice.agregar("java", 5);
        indice.agregar("java", 20);
        indice.agregar("programacion", 5);
        indice.agregar("programacion", 15);
        indice.agregar("codigo", 7);
        indice.agregar("codigo", 7); // duplicado, no se repite

        // Consultas
        System.out.println("Páginas de 'java': " + indice.consultar("java"));
        System.out.println("Páginas de 'programacion': " + indice.consultar("programacion"));
        System.out.println("Páginas de 'codigo': " + indice.consultar("codigo"));
        System.out.println("Páginas de 'python': " + indice.consultar("python")); // no existe

        indice.mostrarIndice();
    }
}

