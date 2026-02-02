public class Dron {

    public static final int TECHO_DE_VUELO = 120;

    /* Atributos */
    protected String codigo;
    protected TipoDron tipo;
    protected int bateria;
    protected double altura;

    public Dron(String codigo, TipoDron tipo, int bateria, double altura) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.bateria = bateria;
        this.altura = altura;
    }

    public Dron(String codigo) {
        this(codigo, TipoDron.REPARTO, 100, 0);
    }

    public Dron() {
        tipo = TipoDron.CARRERAS;
    }

    public void setAltura(double altura) {
        if (altura > Dron.TECHO_DE_VUELO)
            altura = 100;

        this.altura = altura;
    }

    @Override
    public String toString() {
        // Codigo tipo bateria y Altura
        return "[(" + this.codigo + ") " + this.tipo + " " + this.bateria + "mA, " + this.altura + "m]";
    }

}
