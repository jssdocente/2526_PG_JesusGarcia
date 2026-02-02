package com.pg.ligafutbol;

public class FilaClasificacion {

    private Equipo equipo;
    private int puntos, golesFavor, golesContra, partidosJugados;

    public FilaClasificacion(Equipo equipo) {
        this.equipo = equipo;
    }

    public void actualizarStats(int misGoles, int susGoles) {

        this.puntos += calculatePuntosResultado(misGoles, susGoles);
        this.golesFavor += misGoles;
        this.golesContra += susGoles;
        this.partidosJugados += 1;

    }

    private int calculatePuntosResultado(int golesL, int golesV) {

        if (golesL == golesV)
            return 1;
        if (golesL > golesV)
            return 3;

        return 0;

    }

    public int getPuntos() {
        return this.puntos;
    }

    public int getPartidosJugados() {
        return this.partidosJugados;
    }

    public int getGolesFavor() {
        return this.golesFavor;
    }

    public int getGolesContra() {
        return this.golesContra;
    }

}
