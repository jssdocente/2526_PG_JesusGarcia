public class DronPesado extends Dron {

    private int cargaKg;

    public DronPesado(String codigo, TipoDron tipo, int bateria, double altura) {
        super(codigo, tipo, bateria, altura);
    }

    public DronPesado(String codigo, int cargaKg) {
        super(codigo);
        this.cargaKg = cargaKg;
    }
}
