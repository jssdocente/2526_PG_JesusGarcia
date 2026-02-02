package com.pg.ligafutbol;

public class Clasificacion {

    private FilaClasificacion equipos[] = new FilaClasificacion[Liga.TOTAL_EQUIPOS_LIGA];

    private int idxUltimoEquipo = -1;

    public Clasificacion() {
    }

    public void addEquipo(Equipo equipo) throws Exception {
        idxUltimoEquipo += 1;
        if (idxUltimoEquipo >= 6)
            throw new Exception("Ya están todos los equipos en la clasificación");

        FilaClasificacion fila = new FilaClasificacion(equipo);
        equipos[idxUltimoEquipo] = fila;
    }

}
