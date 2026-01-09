package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.CRC32;

public class Ejercicio20 {

    public static void main(String[] args) {

        try {

            int edad = pedirNumero("Introduzca su edad:", 3);
            int edadMascota = pedirNumero("Introduzca la edad de su Mascota", 3);

            // Funciona o lógica con la edad
            int edadDividida = edad / 0;

        } catch (ArithmeticException ex) {
            System.out.println("Error en la operación" + ex.getMessage());

        } catch (Exception ex) {
            System.out.println("Un error inespeado ha ocurrido\n" + ex.getMessage());

        } finally {
        }

    }

    public static int pedirNumero(String mensaje, int maxItentos)
            throws Exception {

        Scanner teclado = new Scanner(System.in);
        int intentos = 0;

        while (intentos <= maxItentos) {
            try {

                System.out.println(mensaje);
                int valor = teclado.nextInt();

                teclado.close();

                return valor;

            } catch (InputMismatchException ex) {
                System.out.println("Valor introducido no válido");
                teclado.nextLine();
                intentos++;

            }
        }

        // El máximo de intentos se ha superado.
        teclado.close();
        throw new Exception("Número de intentos superado.");

    }

}
