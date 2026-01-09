package Simulacro;

public class Ej01 {

    public static void main(String[] args) {

        System.out.println("INFORME DE VENTAS");
        dibujarLinea(20, '=');
        System.out.println("INFORME DE VENTAS");
        dibujarLinea(30, '=');

    }

    public static void dibujarLinea(int longitud, char caracter) {

        // 1º Opción. Imprimiendo sin salto de linea, y en la última posición Salto de
        // linea.

        for (int i = 1; i <= longitud; i++) {
            if (i == longitud)
                System.out.printf("%s\n", caracter);
            else
                System.out.print(caracter);
        }

        for (int i = 1; i <= longitud; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        // 2º Opción. Concatenar el String
        String cadena = "";
        for (int i = 1; i <= longitud; i++) {
            cadena = cadena + caracter;
        }

        System.out.println(cadena);

    }

}
