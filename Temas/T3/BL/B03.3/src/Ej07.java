public class Ej07 {

    public static void main(String[] args) throws Exception {

    }

    public static String obtenerCalificacion(int nota) {

        String evaluacion = "";

        if (nota < 5) {
            evaluacion = "Suspenso";
        } else if (nota < 7) {
            evaluacion = "Aprobado";
        } else if (nota < 9) {
            evaluacion = "Notable";
        } else if (nota <= 10) {
            evaluacion = "Sobresaliente";
        } else {
            evaluacion = "Nota no válida";
        }

        return evaluacion;

    }

    public static String obtenerCalificacionReturnTemprano(int nota) {

        if (nota < 5) {
            return "Suspenso";
        }

        if (nota < 7) {
            return "Aprobado";
        }

        if (nota < 9) {
            return "Notable";
        }

        if (nota <= 10) {
            return "Sobresaliente";
        }

        return "No válida";

    }
}
