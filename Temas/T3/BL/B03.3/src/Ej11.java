import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) throws Exception {

        // Probar con diferentes números
        long fibonacci = fib(7);

        System.out.printf("El número de fibonacci es: %d", fibonacci);

    }

    public static long fib(int numero) {

        if (numero == 0)
            return 0;

        if (numero == 1)
            return 1;

        long resultado = fib(numero - 1) + fib(numero - 2);

        return resultado;
    }

}
