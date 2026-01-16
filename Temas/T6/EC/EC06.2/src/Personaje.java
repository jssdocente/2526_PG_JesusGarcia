import java.util.Random;

public class Personaje {

    /*
     * Un nombre.
     * Un nivel (empieza en 1).
     * Puntos de Salud (vida).
     * Un rol (ej: "Mago", "Guerrero").
     */

    /* ATRIBUTOS */
    protected String nombre;
    protected int nivel;
    protected int salud;
    protected String rol;

    public Personaje(String nombre) {
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

    public boolean equals(Personaje otro) {
        // Esto es subjetivo
        if (this.nombre == otro.getNombre() && this.rol == otro.getRol()) {
            return true;
        }

        return false;
    }

    // #endregion
    public void Presentarse() {
        System.out.printf("Hola, soy %s y soy un nivel %d y soy un %s\n",
                this.nombre, this.nivel, this.rol);
    }

    public void subirNivel() {
        this.nivel += 1;
        this.setSalud(this.salud + 10);
        System.out.printf("%s ha subido al nivel %d!\n", this.nombre, this.nivel);
    }

    public void recibirDaño(int daño) {

        if (daño > 100)
            daño = 100;

        this.setSalud(this.salud - daño);
    }

    public void beberPocion() {
        this.setSalud(this.salud + 20);
    }

}