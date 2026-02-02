package com.pg.ligafutbol;

import java.util.Arrays;

public class Liga {

    public static final int TOTAL_EQUIPOS_LIGA = 6;

    private Equipo[] equipos = new Equipo[TOTAL_EQUIPOS_LIGA];
    private Jornada[] jornadas = new Jornada[(TOTAL_EQUIPOS_LIGA - 1) * 2];
    private Clasificacion clasificacion = new Clasificacion();

    public Liga() throws Exception {

        // Agregar equipos
        equipos[0] = new Equipo(1, "Atletico Madrid");
        equipos[1] = new Equipo(2, "Athetic Bilbao");
        equipos[2] = new Equipo(3, "Barcelona");
        equipos[3] = new Equipo(4, "Betis");
        equipos[4] = new Equipo(5, "R.Madrid");
        equipos[5] = new Equipo(6, "Sevilla");

        // Agregar equipos clasificación
        for (Equipo eq : equipos) {
            clasificacion.addEquipo(eq);
        }
    }

    public void generarCalendario() throws Exception {

        int N = this.equipos.length;
        int NumJornadas = N - 1;
        int PartidosPorJornada = N / 2;

        Equipo[] copyEquipos = Arrays.copyOf(this.equipos, TOTAL_EQUIPOS_LIGA);

        // Creado las jornadas de la 1ª Vuelta
        for (int njorn = 1; njorn <= NumJornadas; njorn++) {
            System.out.printf("JORNADA %d\n", njorn);
            Jornada jornada = new Jornada(njorn);
            jornadas[njorn - 1] = jornada;

            for (int i = 0; i <= PartidosPorJornada - 1; i++) {
                Equipo local = copyEquipos[i];
                Equipo visitante = copyEquipos[N - 1 - i];
                jornada.addPartido(local, visitante);

                System.out.printf("%s vs  %s\n", local.getNombre(), visitante.getNombre());
            }

            // Rotación: El primer equipo (índice 0) se queda fijo.
            // El resto de los equipos rotan una posición.
            Equipo ultimo = copyEquipos[N - 1];

            for (int k = N - 1; k >= 2; k--) {
                copyEquipos[k] = copyEquipos[k - 1];
            }

            copyEquipos[1] = ultimo;
        }

        // Crear las jornadas de la 2ª vuelta
        for (int njorn = 0; njorn < this.jornadas.length / 2; njorn++) {
            // Coger la 1ª jornada y que sea la 1ª de la 2ª vuelta
            Jornada jVoltear = this.jornadas[njorn];

            int nuevoIdJornada = njorn + NumJornadas + 1;
            Jornada jornada = new Jornada(nuevoIdJornada);
            jornadas[nuevoIdJornada - 1] = jornada;

            System.out.printf("JORNADA %d\n", nuevoIdJornada);

            // Recorrer los partidos de la jornada, y dar la vuelta a los equipos.
            // --> local -> visitante, visitante -> local
            for (Partido partido : jVoltear.getPartidos()) {

                Equipo local = partido.getEquipoVisitante();
                Equipo visitante = partido.getEquipoLocal();

                Partido nuevoPartido = new Partido(local, visitante);
                jornada.addPartido(nuevoPartido);

                System.out.printf("%s vs  %s\n", local.getNombre(), visitante.getNombre());
            }

        }

    }

    public void imprimirCalendario() {

        // Recorrer cada una de las jornadas
        for (Jornada jornada : this.jornadas) {

            System.out.printf("\n==== JORNADA %d =========\n", jornada.getNumeroJornada());

            // Recorrer cada uno de los partidos
            for (Partido partido : jornada.getPartidos()) {

                Equipo local = partido.getEquipoLocal();
                Equipo visitante = partido.getEquipoVisitante();

                System.out.printf("%20s vs  %-20s\n", local.getNombre(), visitante.getNombre());
            }

        }

    }

    public void imprimrLiga() {

        System.out.printf("\n==== EQUIPOS DE LA LIGA =========\n");

        // Recorrer todos los equipos de la liga
        for (Equipo equipo : this.equipos) {

            System.out.printf("%5s - %s\n", equipo.getCodigo(), equipo.getNombre());
        }

    }

}
