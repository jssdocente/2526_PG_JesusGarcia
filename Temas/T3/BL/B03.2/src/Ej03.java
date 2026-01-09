import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) throws Exception {

        int eval1 = 0, eval2 = 0, eval3 = 0;
        String evalRecuperar = "";
        double notaMedia = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Introduzca la nota:");

            switch (i) {
                case 1:
                    eval1 = teclado.nextInt();
                    if (eval1 < 5) {
                        evalRecuperar = "Primera Evaluación";
                    }
                    break;
                case 2:
                    eval2 = teclado.nextInt();
                    if (eval2 < 5) {
                        evalRecuperar = "Segunda Evaluación";
                    }
                    break;
                case 3:
                    eval3 = teclado.nextInt();
                    if (eval3 < 5) {
                        evalRecuperar = "Tercera Evaluación";
                    }
                    break;
                default:
                    break;
            }

            if (evalRecuperar != "") {
                break;
            }

        }

        if (evalRecuperar == "") {
            // No hay ninguna suspensa
            notaMedia = (eval1 + eval2 + eval3) / 3;
            System.out.printf("La nota media de las evaluaciones es: %.2f", notaMedia);

        } else {
            // Hay que recuperar alguna
            System.out.printf("Debe recuperar la %s", evalRecuperar);
        }

    }
}
