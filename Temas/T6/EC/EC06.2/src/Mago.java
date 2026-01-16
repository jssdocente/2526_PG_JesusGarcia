import java.util.Random;

public class Mago extends Personaje {

    public Mago(String nombre) {
        super(nombre);
        this.rol = "Mago";
        this.salud = 130;
        this.nivel = 3;
    }

    public void atacar(Personaje enemigo) {

        Random rnd = new Random();
        int dañoProducido = rnd.nextInt(20, 30);

        enemigo.recibirDaño(dañoProducido);
        System.out.printf("%s ataca a %s y le quita %d de vida.\n", this.nombre, enemigo.getNombre(), dañoProducido);
    }

}
