public class Ej08 {
    public static void main(String[] args) throws Exception {

        System.out.println("Imprimiendo solo los números impares del 1 al 10:");

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) { // Si el número es par
                continue; // Omitimos el resto de esta iteración y vamos a la siguiente
            }

        }
    }
}
