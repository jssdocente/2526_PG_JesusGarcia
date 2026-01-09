public class Seccion01 {
    public static void main(String[] args) throws Exception {

        int opcion = 1;

        switch (opcion) {
            case 1:
                Saludar();
                Saludar("Eva");
                break;

            case 2:
                CalcularArea(50);
                CalcularArea(50, 50);
                break;

            case 3:
                encontrarMaximo(4, 5);
                encontrarMaximo(4.5, 5.4);
                encontrarMaximo(4, 5, 7);
                break;

            case 4:
                Ejercicio4();
                break;

            default:
                break;
        }

    }

    // Ejercicio 1
    static void Saludar() {
        System.out.println("Hola, mundo!!");
    }

    static void Saludar(String valor) {
        System.out.printf("Hola, %s!!", valor);
    }

    // Ejercicio 2
    static double CalcularArea(int lado) {
        return lado * lado;
    }

    static double CalcularArea(int base, int altura) {
        return base * altura;
    }

    // Ejercicio 3
    // Crea una función encontrarMaximo.

    // Una versión que reciba dos int y devuelva el mayor.
    // Una versión que reciba tres int y devuelva el mayor.
    // Una versión que reciba dos double y devuelva el mayor.

    static double encontrarMaximo(double valor1, double valor2) {

        if (valor1 > valor2)
            return valor1;

        return valor2;
    }

    static int encontrarMaximo(int valor1, int valor2) {

        if (valor1 > valor2)
            return valor1;

        return valor2;
    }

    static int encontrarMaximo(int valor1, int valor2, int valor3) {

        if (valor1 > valor2 && valor1 > valor3)
            return valor1;

        if (valor2 > valor1 && valor2 > valor3)
            return valor2;

        return valor3;
    }
}
