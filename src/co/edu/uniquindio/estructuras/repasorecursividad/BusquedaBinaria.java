package co.edu.uniquindio.estructuras.repasorecursividad;

import java.util.Arrays;

/**
 * Esta clase implementa un algoritmo de búsqueda binaria en un arreglo ordenado.
 */
public class BusquedaBinaria {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] array = {1, 2, 3, 4, 5, 6};
        // Se busca el elemento '2' en el arreglo utilizando búsqueda binaria
        int pos = buscarBinaria(array, 0, array.length - 1, 2);
        // Se muestra la posición del elemento encontrado (si existe)
        System.out.println("La posición del elemento 2 en el arreglo es: " + pos);
    }

    /**
     * Método que realiza la búsqueda binaria de un elemento en un arreglo ordenado.
     *
     * @param array  El arreglo ordenado en el que se realizará la búsqueda.
     * @param inicio El índice de inicio del rango de búsqueda.
     * @param fin    El índice de fin del rango de búsqueda.
     * @param target El elemento que se desea buscar en el arreglo.
     * @return La posición del elemento en el arreglo si se encuentra, de lo contrario, retorna -1.
     */
    public static int buscarBinaria(int[] array, int inicio, int fin, int target) {
        if (fin >= inicio) {
            int mid = inicio + (fin - inicio) / 2;

            if (array[mid] == target)
                return mid;
            if (array[mid] > target)
                return buscarBinaria(array, inicio, mid - 1, target);

            return buscarBinaria(array, mid + 1, fin, target);

        }

        return -1;
    }
}
