import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) throws Exception {

        // Calculo de año bisiesto
        /*
         * Luego, busca la regla para los años bisiestos. Te la resumo aquí:
         * Un año es bisiesto si es divisible por 4.
         * Excepción: Si es divisible por 100, entonces no es bisiesto.
         * Excepción a la excepción: A menos que también sea divisible por 400. En ese
         * caso, sí es bisiesto.
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el año:\n");

        int año = teclado.nextInt();

        boolean esBisiesto = false;

        if (año % 4 == 0) {
            // De forma general es bisiesto
            esBisiesto = true;
            if (año % 100 == 0) {
                // No es bisiesto
                if (año % 400 == 0) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            }
        }

        if (esBisiesto)
            System.out.println("El año es BISIESTO");
        else
            System.out.println("El año es NO es BISIESTO");

    }

}
