import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el número de horas trabajadas:");
        int numHoras = teclado.nextInt();
        int horasBase = numHoras;
        int horasExtra = 0;

        if (horasBase > 150) {
            horasExtra = horasBase - 150;
            horasBase = horasBase - 150;
        }

        double sueldoBase = horasBase * 10;
        double sueldoExtra = horasExtra * 20;

        double suelddo = sueldoBase + sueldoExtra;

        System.out.printf("El sueldo es %.2f€ para el númoer de horas: %d", suelddo, numHoras);

    }
}
