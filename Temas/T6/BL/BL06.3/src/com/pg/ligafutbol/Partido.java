package com.pg.ligafutbol;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal, golesVisitante;
    private boolean esJugado = false;

    public Partido(Equipo local, Equipo visitante) {
        this.equipoLocal = local;
        this.equipoVisitante = visitante;
    }

    public void setResultado(int golesL, int golesV) {
        this.golesLocal = golesL;
        this.golesVisitante = golesV;
        this.esJugado = true;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean isJugado() {
        return this.esJugado;
    }

}
