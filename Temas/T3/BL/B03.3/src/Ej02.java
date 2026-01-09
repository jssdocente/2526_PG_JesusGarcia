public class Ej02 {

    public static void main(String[] args) throws Exception {
        int a = 5, b = 10;

        // System.out.printf("Valor de a (antes): %s\n", a);
        // System.out.printf("Valor de b (antes): %s\n", b);

        // // Llamo a intercambiar con el valor de a y b
        // intercambiar(a, b);

        // System.out.printf("Valor de a: %s\n", a);
        // System.out.printf("Valor de b: %s\n", b);

        Persona carlos = new Persona();
        carlos.nombre = "Carlos";

        Persona manuel = new Persona();
        manuel.nombre = "Manuel";

        System.out.printf("Carlos se llama (antes): %s\n", carlos.nombre);
        System.out.printf("Maneul se llama (antes): %s\n", manuel.nombre);

        // Llamo a intercambiar con el valor de a y b
        intercambiarPersona(carlos, manuel);

        System.out.printf("Carlos se llama: %s\n", carlos.nombre);
        System.out.printf("Manuel se llama: %s\n", manuel.nombre);

    }

    public static void intercambiar(int x, int y) {
        int auxiliar = x;

        x = y;
        y = auxiliar;
    }

    public static void intercambiarPersona(Persona x, Persona y) {

        String auxiliar = x.nombre;

        x.nombre = y.nombre;
        y.nombre = auxiliar;
    }

}

class Persona {
    String nombre;
}
