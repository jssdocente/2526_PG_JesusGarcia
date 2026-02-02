public enum TipoTaza {
    SHORT(200),
    TALL(300),
    GRANDE(450),
    VENTI(675),
    TRENTA(900);

    private final int ml;

    TipoTaza(int ml) {
        this.ml = ml;
    }

    public int Capacidad() {
        return this.ml;
    }
}