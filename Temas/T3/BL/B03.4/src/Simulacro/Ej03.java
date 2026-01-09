package Simulacro;

import java.util.Scanner;

public class Ej03 {

    /*
     * El programa solicitará al usuario que introduzca el PIN hasta que lo acierte.
     * Debe utilizar obligatoriamente un bucle
     * do-while.
     * Por cada intento fallido, deberá mostrar el mensaje
     * "PIN incorrecto. Inténtelo de nuevo.".
     * Cuando el usuario acierte, el programa mostrará "Acceso concedido." y
     * terminará.
     * Si el número de intentos supera los 3, el programa mostrará
     * "Número máximo de intentos superado. Acceso bloqueado."
     * y finalizará.
     */

    public static void main(String[] args) {

        String pin = "1337";

        Scanner teclado = new Scanner(System.in);
        int numIntentos = 0;
        boolean pinCorrecto = false;

        do {

            System.out.printf("Introduzca el PIN. Intento nº %d\n", numIntentos + 1);
            String pinValidar = teclado.nextLine();
            // String pinValidar = "1335";

            if (!esPinCorrecto(pin, pinValidar)) {
                System.out.println("PIN incorrecto. Inténtelo de nuevo.");
                numIntentos = numIntentos + 1;
            } else {
                pinCorrecto = true;
            }

        } while (numIntentos < 3 && !pinCorrecto);

        if (numIntentos >= 3) {
            System.out.println("Número máximo de intentos superado. Acceso bloqueado");
        } else if (pinCorrecto) {
            System.out.println("Acceso concedido");
        }

    }

    public static boolean esPinCorrecto(String pin, String valor) {

        return pin.equals(valor);

    }

}
