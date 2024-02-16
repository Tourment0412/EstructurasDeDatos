package co.edu.uniquindio.estructuras.repasorecursividad;

/**
 * Esta clase implementa un algoritmo de multiplicación de elementos en un arreglo utilizando el enfoque de Divide y Vencerás.
 */
public class MultiplicacionElementosDivide {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] array = {9,4,7,2};
        // Se calcula el resultado de la multiplicación de los elementos del arreglo
        int resul = multiplicarDivideVenceras(array);
        // Se muestra el resultado al usuario
        System.out.println("El resultado de la multiplicación de los elementos del arreglo es: " + resul);
    }

    /**
     * Método que inicia la recursión para calcular la multiplicación de los elementos en el arreglo.
     *
     * @param array El arreglo en el que se realizará la multiplicación.
     * @return El resultado de la multiplicación de los elementos del arreglo.
     */
    public static int multiplicarDivideVenceras(int[] array) {
        return multiplicarDivideVencerasAux(0, array.length - 1, array);
    }

    /**
     * Método auxiliar que realiza la multiplicación de los elementos en un rango específico del arreglo.
     *
     * @param inicio El índice de inicio del rango.
     * @param fin    El índice de fin del rango.
     * @param array  El arreglo en el que se realizará la multiplicación.
     * @return El resultado de la multiplicación de los elementos del rango especificado del arreglo.
     */
    private static int multiplicarDivideVencerasAux(int inicio, int fin, int[] array) {
        // Caso base: Cuando solo hay un elemento en el rango
        if (inicio == fin) {
            return array[inicio];
        } else {
            // Se calcula la mitad del rango
            int mitad = (inicio + fin) / 2;
            // Se calcula la multiplicación de los elementos en la primera mitad del rango
            int x = multiplicarDivideVencerasAux(inicio, mitad, array);
            // Se calcula la multiplicación de los elementos en la segunda mitad del rango
            int y = multiplicarDivideVencerasAux(mitad + 1, fin, array);
            // Se retorna el resultado de la multiplicación de los elementos de ambas mitades
            return x + y;
        }
    }
}
