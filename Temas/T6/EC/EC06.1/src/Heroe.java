public class Heroe {

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

    public Heroe(String nombre, String rol) {
        nivel = 1;
        salud = 100;

        this.nombre = nombre;
        this.rol = rol;

    }

}
