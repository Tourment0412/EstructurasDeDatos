package co.edu.uniquindio.estructuras.repasorecursividad;

public class HallaMayorDividiendo {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        int[] array = {8, 6, 7, 3,22, 2, 7, 9, 9};
        int mayor = hallarMayor(array);
        System.out.println("El mayor elemento del arreglo es: " + mayor);
    }

    /**
     * Método que inicia la recursión para hallar el mayor elemento en el arreglo.
     *
     * @param array El arreglo en el que se buscará el mayor elemento.
     * @return El mayor elemento encontrado en el arreglo.
     */
    public static int hallarMayor(int[] array) {
        return hallarMayorAux(0, array.length - 1, array);
    }

    /**
     * Método auxiliar que realiza la búsqueda del mayor elemento en un rango específico del arreglo.
     *
     * @param inicio El índice de inicio del rango.
     * @param fin    El índice de fin del rango.
     * @param array  El arreglo en el que se realizará la búsqueda.
     * @return El mayor elemento encontrado en el rango especificado del arreglo.
     */
    private static int hallarMayorAux(int inicio, int fin, int[] array) {
        if (inicio == fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = hallarMayorAux(inicio, mitad, array);
            int y = hallarMayorAux(mitad + 1, fin, array);
            if (x < y) {
                return y;
            } else {
                return x;
            }
        }
    }
}
