public class Ej02 {
    public static void main(String[] args) throws Exception {

        // Usamos System.out.print() para que el cursor se quede en la misma línea.
        // Es crucial añadir los espacios manualmente al final de cada texto.

        int numPasos = 4;

        for (int i = 1; i <= numPasos; i++) {
            // System.out.print("Paso " + i + "... ");
            System.out.printf("Paso %d... ", i);
        }

        // Usamos System.out.println() al final para imprimir el último mensaje
        // y ahora sí, hacer un salto de línea.
        System.out.printf("¡He llegado!\n");

    }
}
