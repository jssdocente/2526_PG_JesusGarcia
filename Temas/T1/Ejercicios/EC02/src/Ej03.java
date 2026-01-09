public class Ej03 {
    public static void main(String[] args) throws Exception {

        int altura = 5;

        // Bucle externo
        for (int fila = 1; fila <= altura; fila++) {

            // Pintar los espacios (' ')
            int totalEspacios = altura - fila;
            for (int j = 1; j <= totalEspacios; j++) {
                System.out.print(" ");
            }

            // Pintar los asteriscos (*)
            int totalAstericos = (2 * fila) - 1;
            for (int j = 1; j <= totalAstericos; j++) {
                System.out.print("*");
            }

            // Saltar de línea
            System.out.println("");

        }

    }
}

