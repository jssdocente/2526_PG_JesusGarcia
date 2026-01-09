import java.util.Scanner;

public class Ej05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Ejercicio 5: Número a Letra ---");
        System.out.print("Introduce un número entero del 0 al 10: ");

        int numero = teclado.nextInt();

        String nombreEnLetras;

        // 5. Usar la estructura switch para asignar el nombre
        switch (numero) {
            case 0:
                nombreEnLetras = "Cero";
                break;
            case 1:
                nombreEnLetras = "Uno";
                break;
            case 2:
                nombreEnLetras = "Dos";
                break;
            case 3:
                nombreEnLetras = "Tres";
                break;
            case 4:
                nombreEnLetras = "Cuatro";
                break;
            case 5:
                nombreEnLetras = "Cinco";
                break;
            case 6:
                nombreEnLetras = "Seis";
                break;
            case 7:
                nombreEnLetras = "Siete";
                break;
            case 8:
                nombreEnLetras = "Ocho";
                break;
            case 9:
                nombreEnLetras = "Nueve";
                break;
            case 10:
                nombreEnLetras = "Diez";
                break;
            default:
                // Bloque 'default' para cualquier número fuera del rango 0-10
                nombreEnLetras = "Número no válido";
                break;
        }

        // 6. Mostrar el resultado por pantalla
        System.out.println("El número que introdujiste es: " + nombreEnLetras + ".");

        // 7. Cerrar el objeto Scanner
        teclado.close();
    }
}
