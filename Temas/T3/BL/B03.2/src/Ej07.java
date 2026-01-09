import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int año = teclado.nextInt();

        boolean esBisiesto = false;

        if (año % 100 != 0 && año % 400 == 0) {
            esBisiesto = true;
        } else if (año % 100 != 0) {
            esBisiesto = false;
        } else if (año % 4 == 0) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }

        if (esBisiesto)
            System.out.println("El año %d es BISIESTO");
        else
            System.out.println("El año %d es NO ES BISIESTO");

    }
}
