package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.Liga;

public class TestLiga {

    public static void main(String[] args) throws Exception {

        System.out.println(">>> Test: Liga");

        // testGenerarCalendario();
        // testImprimirCalendario();
        testImprimirLiga();

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

}
