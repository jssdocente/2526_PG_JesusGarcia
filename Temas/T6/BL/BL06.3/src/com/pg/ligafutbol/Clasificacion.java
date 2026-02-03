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

    public void imprimirClasificacion() {

        System.out.printf("\n==== CLASIFICACIÓN LIGA =========\n");

        for (FilaClasificacion fila : equipos) {
            if (fila == null)
                continue;

            Equipo equipo = fila.getEquipo();

            System.out.printf("%5s - %s\n", equipo.getCodigo(), equipo.getNombre());
        }

    }

    public void ordenar() {

        int n = this.equipos.length;
        // Bucle externo para recorrer todo el array
        for (int i = 0; i < n - 1; i++) {
            // Bucle interno para comparar elementos adyacentes
            // n-i-1 evita comparar los elementos que ya están ordenados al final
            for (int j = 0; j < n - i - 1; j++) {
                if (this.equipos[j].getPuntos() > this.equipos[j + 1].getPuntos()) {
                    // Intercambio de valores usando una variable temporal
                    FilaClasificacion temp = this.equipos[j];
                    this.equipos[j] = this.equipos[j + 1];
                    this.equipos[j + 1] = temp;
                }
            }
        }
    }

}
