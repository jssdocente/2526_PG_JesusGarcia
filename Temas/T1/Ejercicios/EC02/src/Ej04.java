public class Ej04 {
    public static void main(String[] args) throws Exception {
        // --- VARIABLE DE CONTROL ---
        // ¡Cambia este valor para ver pirámides de diferentes tamaños!
        int altura = 3;

        System.out.println("--- Pirámide Normal (Altura " + altura + ") ---");

        // --- BUCLE PARA LA PIRÁMIDE NORMAL ---

        // 1. Bucle Exterior: Controla las filas.
        // Se ejecutará 'altura' veces, una por cada nivel de la pirámide.
        // La variable 'i' representa el número de la fila actual (de 1 a la altura
        // total).
        for (int i = 1; i <= altura; i++) {

            // 2. Primer Bucle Interior: Imprime los espacios en blanco.
            // En la fila 1, necesitamos 'altura - 1' espacios.
            // En la fila 2, necesitamos 'altura - 2' espacios.
            // ...y así sucesivamente. La fórmula es 'altura - i'.
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" "); // Ojo: print, no println
            }

            // 3. Segundo Bucle Interior: Imprime los asteriscos.
            // En la fila 1, necesitamos 1 asterisco.
            // En la fila 2, necesitamos 3 asteriscos.
            // En la fila 3, necesitamos 5 asteriscos.
            // La fórmula para esta secuencia de números impares es '(2 * i) - 1'.
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*"); // Ojo: print, no println
            }

            // 4. Salto de línea.
            // Una vez que los espacios y los asteriscos de una fila se han impreso,
            // hacemos un salto de línea para empezar la siguiente fila.
            System.out.println();
        }
    }
}
