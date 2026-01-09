package Simulacro;

public class Ej04 {

    public static void main(String[] args) {

        pintarTableroAjedrez(10);

    }

    public static void pintarTableroAjedrez(int filas) {

        // Utilizar un FOR anidado

        for (int fila = 1; fila <= filas; fila++) {

            // pintar fila
            if (esImpar(fila)) {
                // @#@## (fila es Impar)
                for (int columna = 1; columna <= filas; columna++) {
                    if (esImpar(columna)) {
                        // col posición impar
                        System.out.print("@");
                    } else {
                        // col posición par
                        System.out.print("#");
                    }

                }
            } else {
                // #@#@# (fila es Par)
                for (int columna = 1; columna <= filas; columna++) {
                    if (esImpar(columna)) {
                        // col posición impar
                        System.out.print("#");
                    } else {
                        // col posición par
                        System.out.print("@");
                    }

                }
            }

            System.out.println();
        }

    }

    public static boolean esPar(int valor) {
        return valor % 2 == 0;
    }

    public static boolean esImpar(int valor) {
        return !esPar(valor);
    }

    /*
     * @#@#@ (fila es Impar)
     * #@#@# (fila es Par)
     * 
     * @#@## (fila es Impar)
     * #@#@# (fila es Par)
     */

}
