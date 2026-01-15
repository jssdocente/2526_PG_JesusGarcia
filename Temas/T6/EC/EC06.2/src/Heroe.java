public class Heroe {

    // Constante
    public static final int VALOR_ATAQUE = 20;
    /*
     * Un nombre.
     * Un nivel (empieza en 1).
     * Puntos de Salud (vida).
     * Un rol (ej: "Mago", "Guerrero").
     */

    /* ATRIBUTOS */
    private String nombre;
    private int nivel;
    private int salud;
    private String rol;

    private static int contadorHeroes = 0;

    public Heroe(String nombre, String rol) {
        nivel = 1;
        salud = 100;
        Heroe.contadorHeroes += 1;

        this.nombre = nombre;
        this.rol = rol;
    }

    public Heroe(String nombre) {
        nivel = 1;
        salud = 100;
        rol = "Aldeano";
        Heroe.contadorHeroes += 1;

        this.nombre = nombre;
    }

    // #region Propiedades
    public String getNombre() {
        return this.nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public int getSalud() {
        return this.salud;
    }

    public String getRol() {
        return this.rol;
    }

    public int getTotalCreados() {
        return Heroe.contadorHeroes;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private void setSalud(int salud) {
        this.salud = salud;

        if (this.salud > 100)
            this.salud = 100;

        if (this.salud < 0)
            this.salud = 0;
    }
    // #endregion

    // #region Propiedades_Calculadas

    public boolean estaVivo() {
        return this.salud > 0;
    }

    public boolean equals(Heroe otro) {
        // Esto es subjetivo
        if (this.nombre == otro.getNombre() && this.rol == otro.getRol()) {
            return true;
        }

        return false;
    }

    // #endregion

    public static void imprimirInfoTecnica() {
        System.out.printf("Total de heroes creados: %d", Heroe.contadorHeroes);
    }

    public void Presentarse() {
        System.out.printf("Hola, soy %s y soy un nivel %d y soy un %s\n",
                this.nombre, this.nivel, this.rol);
    }

    public void subirNivel() {
        this.nivel += 1;
        this.setSalud(this.salud + 10);
        System.out.printf("%s ha subido al nivel %d!\n", this.nombre, this.nivel);
    }

    public void sufrirDaño(int nivelDaño) {
        switch (nivelDaño) {
            case 3:
                this.setSalud(this.salud - 30);
                break;
            case 2:
                this.setSalud(this.salud - Heroe.VALOR_ATAQUE);
                break;
            case 1:
                this.setSalud(this.salud - 10);
                break;

            default:
                System.out.println("Dano no permitido");
                break;
        }
    }

    public void beberPocion() {
        this.setSalud(this.salud + 20);
    }

    public void atacar(Heroe objetivo) {
        objetivo.sufrirDaño(1);
    }

}
