public class Sobrecarga01 {
    public static void main(String[] args) throws Exception {

        // Calcular de un rectangulo
        // int areaRectangulo = calcularAreaRectangulo(10, 20);

        // Calcular de un cuadrado
        double areaCuadrado = calcularArea(10, true);

        double areaCuadrado2 = calcularArea(10);

        // // Calcular de un cuadrado con valores decimales
        // double areaCuadrado3 = calcularArea(10.2);

        // // Utilizando sobrecarga
        // int areaRectangulo2 = calcularArea(10, 20);

    }

    /* SOBRECARGA EN NÚMERO DE PARAMETROS */
    static double calcularArea(double lado) {
        // Calcula el área de un cuadrado
        return lado * lado;
    }

    static double calcularArea(double lado, boolean round) {
        // Calcula el área de un cuadrado
        return lado * lado;
    }
}
