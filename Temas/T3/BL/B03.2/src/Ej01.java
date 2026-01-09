import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) throws Exception {

        int hora = 0, minuto = 0, segundos = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la hora;");
        hora = teclado.nextInt();
        System.out.println("Introduzca el minuto;");
        minuto = teclado.nextInt();
        System.out.println("Introduzca el segundo;");
        segundos = teclado.nextInt();

        boolean esValida = true;

        boolean esHoraValida = (hora >= 0 && hora <= 23);
        boolean esMinutoValido = (minuto >= 0 && minuto <= 59);
        boolean esSegundosValido = (minuto >= 0 && minuto <= 59);

        if ((hora >= 0 && hora <= 23)
                && (minuto >= 0 && minuto <= 59)
                && (minuto >= 0 && minuto <= 59)) {

            esValida = true;
        } else {
            esValida = false;
        }

        if (esValida) {
            System.out.println("La hora es válida");
        } else {
            System.out.println("La hora no es válida");
        }

    }
}
