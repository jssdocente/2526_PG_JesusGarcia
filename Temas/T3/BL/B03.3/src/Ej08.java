import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) throws Exception {

        // Solicitar al usurio un número
        // Calcular si ese número es primo o no.
        // Indicar al usuario si el es primo o no.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número para saber si es primo o no:");
        int numVerificar = teclado.nextInt();

        if (esPrimo(numVerificar))
            System.out.printf("El número: %d ES PRIMO", numVerificar);
        else
            System.out.printf("El número: %d NO ES PRIMO", numVerificar);
    }

    public static boolean esPrimo(int numeroVerificar) {

        // Con For, recorrer desde 1 hasta N (numero). Si el divisible por otro número
        // distinto
        // a 1 y el propio numero, NO ES PRIMO.
        boolean esPrimo = true;

        for (int i = 1; i < numeroVerificar; i++) {
            if (i == 1) {
                // Cualquier número es divisible por
                continue;
            }

            // Si es divible por I
            if (numeroVerificar % i == 0) {
                // Es divible ==> no es primo.
                esPrimo = false;
                System.out.printf("El número: %d NO ES PRIMO", numeroVerificar);
                break;
            }
        }

        return esPrimo;
    }

}
