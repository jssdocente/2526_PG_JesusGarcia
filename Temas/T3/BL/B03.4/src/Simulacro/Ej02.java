package Simulacro;

public class Ej02 {
    public static void main(String[] args) {

        int contador = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 4) {
                continue;
            }
            if (i == 8) {
                break;
            }
            contador = contador + i;
        }

        System.out.printf("Contador vale %d\n", contador);

    }
}
