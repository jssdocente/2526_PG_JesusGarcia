package Excepciones;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Ejemplo1 {

    public static void main(String[] args) {

        versionSinCapturarError();
        // versionCapturarError();

    }

    public static void versionCapturarError() {
        try {

            // Bloque para controlar excepciones
            dividir(8, 5);
            dividir(10, 0);
            dividir(9, 5);

        } catch (Exception ex) {
            System.out.println("Se ha producido un error.\n"
                    + ex.getMessage());

        } finally {
            System.out.println("Programa finalizado");

        }
    }

    public static void versionSinCapturarError() {
        dividir(8, 5);
        dividir(10, 0);
        dividir(9, 5);
    }

    public static double dividir(int valor, int cociente) {

        try {
            return valor / cociente;

        } catch (Exception ex) {
            return 0;
        }

    }

    public static String getStackTrace(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        e.printStackTrace(pw);
        String sStackTrace = sw.toString(); // stack trace as a string

        return sStackTrace;
    }

}
