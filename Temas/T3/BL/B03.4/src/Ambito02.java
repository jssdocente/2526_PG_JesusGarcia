public class Ambito02 {

    // static int contador = 0;
    static final double NUMERO_PI = 3.1434343;;

    public static void main(String[] args) throws Exception {

        int contador = 0;

        String plantilla = "424313421";

        for (int numPregunta = 1; numPregunta <= 10; numPregunta++) {

            if (testPregunta(numPregunta, plantilla.charAt(numPregunta))) {
                contador++;
            }
        }

        // if (testPregunta(2, 4)) {
        // contador++;
        // }

        // if (testPregunta(3, 3)) {
        // contador++;
        // }

        // if (testPregunta(4, 1)) {
        // contador++;
        // }

        System.out.printf("El total de respuestas correctas es: %d", contador);
    }

    static boolean testPregunta(int numero, int numRespuestaCorrecta) {

        // Mostrar las preguntas al usuario

        // Entrada del usuario
        int numResUsuario = 3;
        if (numResUsuario == numRespuestaCorrecta) {
            return true;
        }

        return false;

    }

}
