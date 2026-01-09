public class Seccion02 {
    public static void main(String[] args) throws Exception {

        char PrimeraLetra = obtenerPrimeraLetra("Antonio");
        Deletear("Antonio");
        CuentaLetraEnFrase("El mar es azul", 'a');

        System.out.println(esPalindromo("amigo"));

    }

    // Ejercicio 1
    static char obtenerPrimeraLetra(String frase) {
        return frase.charAt(0);
    }

    static void Deletear(String frase) {

        System.out.printf("Deletrear la frase: %s", frase);

        for (int i = 0; i <= frase.length() - 1; i++) {
            System.out.printf("Caracter: %s\n", frase.charAt(i));
        }

    }

    static int CuentaLetraEnFrase(String frase, char letra) {

        return 0;// numero de ocurrencias de esa letra en la frasel
    }

    static boolean esPalindromo(String palabra) {

        for (int i = 0; i <= palabra.length() - 1; i++) {

            char letraEspejo = palabra.charAt((palabra.length() - 1) - i);
            char letra = palabra.charAt(i);

            if (letra != letraEspejo)
                return false;
        }

        return true;

    }

}
