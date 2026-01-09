import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {

        // 1. Inicializar el objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // 2. Pedir al usuario que ingrese un número en letras
        System.out.print("Introduce un número del 0 al 10 en letras (Ej: 'cinco'): ");

        // 3. Leer la palabra y convertirla inmediatamente a minúsculas
        // Esto asegura que "Uno", "uno", y "UNO" sean tratadas igual.
        String numeroEnLetras = teclado.next().toLowerCase();

        // 4. Inicializar una variable para almacenar el número en cifra
        int numeroEnCifra = -1; // Usamos -1 como valor por defecto/error

        // 5. Usar la estructura switch para asignar el número en cifra
        switch (numeroEnLetras) {
            case "cero":
                numeroEnCifra = 0;
                break;
            case "uno":
                numeroEnCifra = 1;
                break;
            case "dos":
                numeroEnCifra = 2;
                break;
            case "tres":
                numeroEnCifra = 3;
                break;
            case "cuatro":
                numeroEnCifra = 4;
                break;
            case "cinco":
                numeroEnCifra = 5;
                break;
            case "seis":
                numeroEnCifra = 6;
                break;
            case "siete":
                numeroEnCifra = 7;
                break;
            case "ocho":
                numeroEnCifra = 8;
                break;
            case "nueve":
                numeroEnCifra = 9;
                break;
            case "diez":
                numeroEnCifra = 10;
                break;
            default:
                // Si la palabra no coincide con ningún caso, -1 permanece
                break;
        }

        // 6. Mostrar el resultado por pantalla
        if (numeroEnCifra != -1) {
            System.out.printf("La palabra '%s' corresponde al número: %d", numeroEnLetras, numeroEnCifra);
        } else {
            System.out.println("Entrada no válida. Por favor, introduzca un número del 0 al 10 en letras.");
        }

        // 7. Cerrar el objeto Scanner
        teclado.close();
    }
}
