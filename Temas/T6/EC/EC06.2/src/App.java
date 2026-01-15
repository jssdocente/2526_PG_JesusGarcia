public class App {
    public static void main(String[] args) throws Exception {

        Heroe gandalf = new Heroe("Gandalf", "Mago");
        Heroe aragorn = new Heroe("Aragorn", "Guerrero");

        // Batalla

        Heroe ganador = null;

        do {

            if (gandalf.estaVivo())
                gandalf.atacar(aragorn);

            if (aragorn.estaVivo())
                aragorn.atacar(gandalf);

            System.out.printf("Gandalf: salud: %d\nAragorn: salud %s\n", gandalf.getSalud(), aragorn.getSalud());

        } while (gandalf.estaVivo() && aragorn.estaVivo());

        // Calcular el ganador
        if (gandalf.estaVivo())
            ganador = gandalf;
        else
            ganador = aragorn;

        // El gandor de la batalla es
        System.out.printf("El ganador de la batalla es: %s\n", ganador.getNombre());

    }

}
