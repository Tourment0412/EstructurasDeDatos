package co.edu.uniquindio.competencias;

public class PeaPattern {
    public static String generarSiguiente(String actual) {
        StringBuilder siguiente = new StringBuilder();
        char actualChar = actual.charAt(0);
        int contador = 1;
        
        // Empezamos desde el segundo caracter
        for (int i = 1; i < actual.length(); i++) {
            if (actual.charAt(i) == actualChar) {
                contador++;
            } else {
                siguiente.append(contador).append(actualChar);
                actualChar = actual.charAt(i);
                contador = 1;
            }
        }
        
        // Agregar el último conjunto de dígitos
        siguiente.append(contador).append(actualChar);
        return siguiente.toString();
    }

    public static void main(String[] args) {
        // Empezamos con el número 1
        String actual = "1";

        // Imprimir los primeros 10 números en la secuencia
        for (int i = 0; i < 10; ++i) {
            System.out.println(actual);
            actual = generarSiguiente(actual);
        }
    }
}


