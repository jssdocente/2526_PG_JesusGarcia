public class Ej01 {
    public static void main(String[] args) throws Exception {

        // 1. Declaramos las tres variables de tipo String.
        String nombreCompleto = "Carlos Santana";
        String ciudadNacimiento = "Valencia";
        String comidaFavorita = "Paella";

        // 2. Mostramos la información por pantalla usando println.
        // El operador '+' se usa para concatenar (unir) el texto fijo con el valor de
        // la variable.
        System.out.println("--- Ficha Personal ---");
        System.out.println("Mi nombre es: " + nombreCompleto);
        System.out.println("Nací en: " + ciudadNacimiento);
        System.out.println("Mi comida favorita es: " + comidaFavorita);

    }
}
