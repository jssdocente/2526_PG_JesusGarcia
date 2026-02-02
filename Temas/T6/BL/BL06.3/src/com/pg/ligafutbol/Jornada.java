package com.pg.ligafutbol;

import java.util.Random;

public class Jornada {

    private static int NUM_PARTIDOS = 3;

    private Partido[] partidos = new Partido[NUM_PARTIDOS];
    private int numero_jornada = 0;

    private int idxUltimoPartido = -1;

    public Jornada(int numeroJornada) {
        this.numero_jornada = numeroJornada;
    }

    public Partido[] getPartidos() {
        return partidos;
    }

    public void addPartido(Partido partido) throws Exception {
        idxUltimoPartido += 1;
        if (idxUltimoPartido >= NUM_PARTIDOS)
            throw new Exception("Partido supera los partidos de la jornada");

        partidos[idxUltimoPartido] = partido;
    }

    public void addPartido(Equipo local, Equipo visitante) throws Exception {
        Partido partido = new Partido(local, visitante);
        this.addPartido(partido);
    }

    public int getTotalPartidos() {

        for (int i = 0; i < partidos.length; i++) {
            if (partidos[i] == null) {
                return i;
            }
        }

        return partidos.length;

    }

    public int getNumeroJornada() {
        return this.numero_jornada;
    }

    public void simularPartidos() {

        Random rnd = new Random();
        // Recorrer los partidos de la jornada

        // Para cada partido, generar un resultado (GolesL y GolesV)
        // Un Aleatorio (0-5)

        for (int i = 0; i < partidos.length; i++) {
            if (partidos[i] != null) {
                int golesL = rnd.nextInt(0, 5);
                int golesV = rnd.nextInt(0, 5);
                partidos[i].setResultado(golesL, golesV);
            }
        }

    }

    public void imprimirJornada() {

        System.out.printf("\n==== JORNADA %d =====\n", this.numero_jornada);

        for (Partido p : this.partidos) {
            if (p == null)
                continue;

            if (p.isJugado()) {
                System.out.printf("- %s %d - %d %s\n",
                        p.getEquipoLocal().getNombre(),
                        p.getGolesLocal(),
                        p.getGolesVisitante(),
                        p.getEquipoVisitante().getNombre());
            } else {
                System.out.printf("- %s  -  %s\n",
                        p.getEquipoLocal().getNombre(),
                        p.getEquipoVisitante().getNombre());
            }
        }

    }

}
