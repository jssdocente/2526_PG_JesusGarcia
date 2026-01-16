public class App {
    public static void main(String[] args) throws Exception {

        Mago gandalf = new Mago("Gandalf");
        Heroe aragorn = new Heroe("Aragorn");
        Aldeano aldeano = new Aldeano("Frodo");

        // Batalla

        Personaje ganador = null;

        do {

            if (gandalf.estaVivo())
                gandalf.atacar(aragorn);

            if (aragorn.estaVivo())
                aragorn.atacar(gandalf);

            if (aldeano.estaVivo())
                aldeano.atacar(gandalf);

            System.out.printf("Gandalf: salud: %d\nAragorn: salud %s\n", gandalf.getSalud(), aragorn.getSalud());

        } while (gandalf.estaVivo() && aragorn.estaVivo());

        // Calcular el ganador
        if (gandalf.estaVivo())
            ganador = gandalf;
        else
            ganador = aldeano;

        // El gandor de la batalla es
        System.out.printf("El ganador de la batalla es: %s\n", ganador.getNombre());

    }

}
