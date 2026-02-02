import java.util.Random;

public class Cafetera {

    public static final int TAMAÑO_MINIMO = 1200;
    public static final int TAMAÑO_MAXIMO = 3000;
    public static final int CANTIDAD_RESTO_MINIMA = 3000;

    private static int lastIdGeneranted = 0;
    private static int cantidadDesperdiciada = 0;

    private int id;
    private int cantidadActual;
    private int capacidadMaxima;

    public Cafetera() {
        this.id = Cafetera.lastIdGeneranted + 1;

        this.setCapacidad(1000);
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.setCapacidad(capacidadMaxima);
    }

    public Cafetera(int capacidadMaxima, int contenido) {
        this.setCapacidad(capacidadMaxima);
    }

    private void setCapacidad(int capacidadMaxima) {

        if (capacidadMaxima > TAMAÑO_MAXIMO)
            this.capacidadMaxima = TAMAÑO_MAXIMO;
        else if (capacidadMaxima < TAMAÑO_MINIMO)
            this.capacidadMaxima = TAMAÑO_MINIMO;
        else
            this.capacidadMaxima = capacidadMaxima;
    }

    public void agregarCafe(int cantidad) {
        if ((this.cantidadActual + cantidad) > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
            return;
        }

        this.cantidadActual += cantidad;
    }

    public void vaciarCafetera() {

        cantidadDesperdiciada += this.cantidadActual;
        this.cantidadActual = 0;
    }

    public void servirTaza(TipoTaza tipo) {

        this.cantidadActual = this.cantidadActual - tipo.Capacidad();
        if (this.cantidadActual <= CANTIDAD_RESTO_MINIMA) {
            Cafetera.cantidadDesperdiciada += this.cantidadActual;
        }

    }

    public Cafetera masLlena(Cafetera c1, Cafetera c2) {
        if (c1.cantidadActual >= c2.cantidadActual)
            return c1;

        return c2;

    }

    public void imprimir() {
        System.out.println(this.toString());
    }

    public int generateNewId() {
        Random rnd = new Random();
        return rnd.nextInt(1, 100000);
    }

    @Override
    public String toString() {
        return "[ Cafetera: 2 | Capacidad: 3000ml | Cafe: 475ml ]";
    }
}
