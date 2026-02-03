package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.Liga;

public class TestLiga {

    public static void main(String[] args) throws Exception {

        System.out.println(">>> Test: Liga");

        // testGenerarCalendario();
        // testImprimirCalendario();
        testImprimirLiga();
        testSimulacionLiga();

        System.out.println("✅ Liga verificada.");
    }

    public static void testGenerarCalendario() throws Exception {

        // Configurar escenario
        Liga liga = new Liga();

        liga.generarCalendario();

    }

    public static void testImprimirCalendario() throws Exception {

        // Configurar escenario
        Liga liga = new Liga();
        liga.generarCalendario();

        liga.imprimirCalendario();

    }

    public static void testImprimirLiga() throws Exception {

        // Configurar escenario
        Liga liga = new Liga();

        liga.imprimrLiga();

    }

    private static Equipo[] crearEquipos() {

        Equipo[] equipos = new Equipo[Liga.TOTAL_EQUIPOS_LIGA];

        equipos[0] = new Equipo(1, "Atletico Madrid");
        equipos[1] = new Equipo(2, "Athetic Bilbao");
        equipos[2] = new Equipo(3, "Barcelona");
        equipos[3] = new Equipo(4, "Betis");
        equipos[4] = new Equipo(5, "R.Madrid");
        equipos[5] = new Equipo(6, "Sevilla");

        return equipos;

    }

    public static void testSimulacionLiga() throws Exception {
        System.out.println("\n>>> Test: Simulación de Liga Completa");

        Liga liga = new Liga();

        // 1. Generar Calendario
        liga.generarCalendario();

        // 2. Simular toda la temporada
        liga.simularJornadas();

        // 3. Imprimir Clasificación final
        liga.imprimirClasificacion();

        // No podemos hacer asserts de puntos exactos porque es aleatorio,
        // pero podemos verificar visualmente o comprobar que no sea todo 0.
    }

}
