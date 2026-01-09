import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) throws Exception {

        // Probar con diferentes números

        if (esPerfecto(6)) {
            System.out.println("El numero 6 es perfecto");
        } else {
            System.out.println("El numero 6 No es perfecto");
        }

        //
        if (esPerfecto(28)) {
            System.out.println("El numero 28 es perfecto");
        } else {
            System.out.println("El numero 28 No es perfecto");
        }

        if (esPerfecto(12)) {
            System.out.println("El numero 12 es perfecto");
        } else {
            System.out.println("El numero 12 No es perfecto");
        }

    }

    public static boolean esNoPerfecto(int numero) {

        return (numero == sumarDivisoresPropios(numero));
    }

    public static int sumarDivisoresPropios(int numero) {

        int suma = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }

        return suma;
    }

    // Crea una función double celsiusAFahrenheit(double celsius). La fórmula es
    // (celsius * 9/5) + 32.
    // Crea una función double fahrenheitACelsius(double fahrenheit). La fórmula es
    // (fahrenheit - 32) * 5/9.
    // Crea un procedimiento void mostrarTemperaturasEquivalentes(double celsius)
    // que reciba una temperatura en Celsius, la

}
