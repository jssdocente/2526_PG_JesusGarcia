import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) throws Exception {

        String mesNombre = "";
        int mesDias = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el número del mes:");
        int mesNumero = teclado.nextInt();
        boolean mesValido = false;

        //Comprobaciones
        boolean dniEsCorrecto, nssEsCorrecto, direccionEsCorrecta;

        //Comproba DNI
        if (!dniEsCorrecto) {
            System.out.println("El dni no es correcto");
            return;
        }

         if (!nssEscorrecto) {
            System.out.println("El NSS no es correcto");
            return;
        }

        if (!direccionEsCorrecta) {
            System.out.println("La direccion no es correcto");
            return;
        }

        if (mesNumero >= 0 && mesNumero <= 12) {
            mesValido = true;
        }

        if (!mesValido) {
            System.out.println("El mes no es válido");
            return;
        }

        // Está todo correcto ==> realizar la acción principal del código
        if (nssEsCorrecto && dniEsCorrecto && direccionEsCorrecta) {
        
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

    }
}
