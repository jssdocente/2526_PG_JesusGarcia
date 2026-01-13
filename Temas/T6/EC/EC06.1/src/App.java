public class App {
    public static void main(String[] args) throws Exception {

        Heroe gandalf = new Heroe("Gandalf", "Mago");
        Heroe aragorn = new Heroe("Aragorn", "Guerrero");

        gandalf.atacar(aragorn);
        aragorn.getSalud();
        aragorn.beberPocion();

        System.out.println("");

    }

}
