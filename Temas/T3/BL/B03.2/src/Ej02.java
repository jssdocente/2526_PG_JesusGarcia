import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) throws Exception {

        String mesNombre = "";
        int mesDias = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el número del mes:");
        int mesNumero = teclado.nextInt();
        boolean mesValido = false;

        if (mesNumero >= 0 && mesNumero <= 12) {
            mesValido = true;
        } else {
            System.out.println("El mes no es válido");
        }

        if (mesValido) {

            switch (mesNumero) {
                case 1:
                    mesNombre = "Enero";
                    mesDias = 31;
                    break;
                case 2:
                    mesNombre = "Febrero";
                    mesDias = 28;
                    break;
                case 3:
                    mesNombre = "Marzo";
                    mesDias = 31;
                    break;
                case 5:
                    mesNombre = "Mayo";
                case 7:
                    mesNombre = "Julio";
                case 8:
                    mesNombre = "Agosto";
                case 10:
                    mesNombre = "Octubre";
                case 12:
                    mesNombre = "Diciembre";
                    break;

                case 4:
                    mesNombre = "Abril";
                    mesDias = 30;
                case 6:
                    mesNombre = "Junio";
                    mesDias = 30;
                case 9:
                    mesNombre = "Septiembre";
                    mesDias = 30;
                case 11:
                    mesNombre = "Noviembre";
                    mesDias = 30;
                    break;

                default:
                    System.out.println("Este mes no existe");
                    break;
            }

            System.out.printf("El mes %s y número %d tiene %d días", mesNombre, mesNumero, mesDias);

        } else {
            System.out.printf("El mes número %d no existe", mesNumero);
        }

    }
}
