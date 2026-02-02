package com.pg.ligafutbol;

public class Clasificacion {

    private FilaClasificacion equipos[] = new FilaClasificacion[Liga.TOTAL_EQUIPOS_LIGA];

    private int idxUltimoEquipo = -1;

    public Clasificacion() {
    }

    public FilaClasificacion getEquipoClasificacion(Equipo equipo) {

        for (FilaClasificacion fila : equipos) {
            if (fila.getEquipo().getCodigo() == equipo.getCodigo()) {
                return fila;
            }
        }

        return null;
    }

    public void addEquipo(Equipo equipo) throws Exception {
        idxUltimoEquipo += 1;
        if (idxUltimoEquipo >= 6)
            throw new Exception("Ya están todos los equipos en la clasificación");

        FilaClasificacion fila = new FilaClasificacion(equipo);
        equipos[idxUltimoEquipo] = fila;
    }

    public void actualizar(Partido partido) {

        // 1. Obtener equipo local y equipo visitante
        Equipo local = partido.getEquipoLocal();
        Equipo visitante = partido.getEquipoVisitante();

        // Buscar la FilaClasificación el equipo Local
        for (FilaClasificacion fila : equipos) {
            if (fila.getEquipo().getCodigo() == local.getCodigo()) {
                fila.actualizarStats(partido.getGolesLocal(), partido.getGolesVisitante());
                break;
            }
        }

        // Buscar la FilaClasificación el equipo Visitante
        for (FilaClasificacion fila : equipos) {
            if (fila.getEquipo().getCodigo() == visitante.getCodigo()) {
                fila.actualizarStats(partido.getGolesVisitante(), partido.getGolesLocal());
                break;
            }
        }

    }

}
