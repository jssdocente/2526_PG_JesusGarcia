public class Ej06 {
    public static void main(String[] args) throws Exception {

        // --- Datos del Torneo ---
        String pos1 = "1º";
        String equipo1 = "Dragones Rojos";
        int puntos1 = 45;

        String pos2 = "2º";
        String equipo2 = "Tiburones de la Costa";
        int puntos2 = 42;

        String pos3 = "3º";
        String equipo3 = "Águilas del Norte";
        int puntos3 = 38;

        String pos10 = "10º";
        String equipo10 = "Gatos Salvajes";
        int puntos10 = 21;

        // --- Plantilla de formato ---
        // | %-8s | %-24s | %8s |
        // %-8s: String, 8 caracteres de ancho, alineado a la IZQUIERDA (-).
        // %-24s: String, 24 caracteres, alineado a la IZQUIERDA.
        // %8s: String, 8 caracteres, alineado a la DERECHA (por defecto).
        // El mismo formato se usa para la cabecera y los datos para que todo encaje.

        System.out.println("--------------------------------------------");
        System.out.printf("| %-8s | %-24s | %8s |\n", "POSICIÓN", "EQUIPO", "PUNTOS");
        System.out.println("--------------------------------------------");
        System.out.printf("| %8s | %-24s | %8d |\n", pos1, equipo1, puntos1);
        System.out.printf("| %8s | %-24s | %8d |\n", pos2, equipo2, puntos2);
        System.out.printf("| %8s | %-24s | %8d |\n", pos3, equipo3, puntos3);
        System.out.printf("| %8s | %-24s | %8d |\n", pos10, equipo10, puntos10);
        System.out.println("--------------------------------------------");

    }
}
