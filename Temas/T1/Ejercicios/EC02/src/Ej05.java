public class Ej05 {
    public static void main(String[] args) throws Exception {
        
        // ¡Cambia este valor para ver pirámides de diferentes tamaños!
        int altura = 7;

        System.out.println("--- Pirámide Invertida (Altura " + altura + ") ---");

        // 1. Bucle Exterior: Controla las filas, pero esta vez en orden descendente.
        // Empezamos en la fila más ancha (i = altura) y vamos hacia la más estrecha (i = 1).
        for (int i = altura; i >= 1; i--) {

            // 2. Primer Bucle Interior: Imprime los espacios en blanco.
            // La lógica es la misma que antes: 'altura - i'.
            // Cuando i = altura, (altura - altura) = 0 espacios.
            // Cuando i = altura - 1, (altura - (altura - 1)) = 1 espacio.
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            // 3. Segundo Bucle Interior: Imprime los asteriscos.
            // La fórmula también es la misma: '(2 * i) - 1'.
            // Como 'i' va disminuyendo, el número de asteriscos también lo hará.
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            // 4. Salto de línea para pasar a la siguiente fila.
            System.out.println();

    }
}
