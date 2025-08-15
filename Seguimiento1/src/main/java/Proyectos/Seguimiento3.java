package Proyectos;

//Me toco el enunciado numero 3 de contar los numeros pares de una lista de arreglos

public class Seguimiento3 {
    public static void main(String[] args) {
        int numeros[] = {2,5,8,11,14,7,6,4,9};
        System.out.println(contarParesArreglo(numeros, 0, numeros.length-1, 0));
    }

    public static int contarParesArreglo(int[] numeros, int inicio, int fin, int cont){
        if (inicio > fin) {
            return cont; // Caso base
        }

        if (inicio == fin) { // Hay un solo valor
            if (numeros[inicio] % 2 == 0) {
                return cont + 1;
            }
            return cont;
        }

        int medio = (fin + inicio) / 2;
        cont = contarParesArreglo(numeros, inicio, medio, cont);
        return contarParesArreglo(numeros, medio + 1, fin, cont);
    }
}