import java.util.Random;

public class Aldeano extends Personaje {

    public Aldeano(String nombre) {
        super(nombre);
        this.rol = "Aldeano";
        this.salud = 50;
        this.nivel = 1;
    }

    public void atacar(Personaje enemigo) {

        Random rnd = new Random();
        int dañoProducido = rnd.nextInt(5, 10);

        enemigo.recibirDaño(dañoProducido);
        System.out.printf("%s ataca a %s y le quita %d de vida.\n", this.nombre, enemigo.getNombre(), dañoProducido);
    }

}
