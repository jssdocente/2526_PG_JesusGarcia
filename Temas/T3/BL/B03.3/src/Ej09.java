import java.util.Scanner;

public class Ej09 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una temperatura:");
        double tempCelsius = teclado.nextDouble();

        mostrarTemperaturasEquivalentes(tempCelsius);

    }

    public static void mostrarTemperaturasEquivalentes(double celsius) {

        // La tempera en Celsies es: celsius

        double tempFahren = celsiusAFahrenheit(celsius);
        // La tempoasdf en faasdf es:

        double celsius = fahrenheitACelsius(tempFahren);

    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Crea una función double celsiusAFahrenheit(double celsius). La fórmula es
    // (celsius * 9/5) + 32.
    // Crea una función double fahrenheitACelsius(double fahrenheit). La fórmula es
    // (fahrenheit - 32) * 5/9.
    // Crea un procedimiento void mostrarTemperaturasEquivalentes(double celsius)
    // que reciba una temperatura en Celsius, la

}
