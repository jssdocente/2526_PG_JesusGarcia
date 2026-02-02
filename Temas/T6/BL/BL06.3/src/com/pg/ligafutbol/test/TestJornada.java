package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.Jornada;
import com.pg.ligafutbol.Partido;

public class TestJornada {
    public static void main(String[] args) throws Exception {

        System.out.println(">>> Test: Jornada");

        // testTotalPartidos();
        // testSimular();
        testImprimirJornada();

        System.out.println("✅ Jornada verificada.");
    }

    private static void testTotalPartidos() throws Exception {

        // AAA

        // Construir el escenario
        Jornada jornada = new Jornada(1);

        Equipo e1 = new Equipo(1, "Betis");
        Equipo e2 = new Equipo(2, "Sevilla");

        // Prueba método addPartido
        assert jornada.getTotalPartidos() == 0 : "Error: Longitud incorrecta";

        jornada.addPartido(new Partido(e1, e2));
        jornada.addPartido(new Partido(e2, e1));

        assert jornada.getTotalPartidos() == 2 : "Error: Longitud incorrecta";

        jornada.addPartido(new Partido(e2, e1));
        assert jornada.getTotalPartidos() == 3 : "Error: Longitud incorrecta";

    }

    private static void testSimular() throws Exception {

        // Escenario
        Jornada jornada = new Jornada(1);

        Equipo e1 = new Equipo(1, "Betis");
        Equipo e2 = new Equipo(2, "Sevilla");

        jornada.addPartido(new Partido(e1, e2));
        jornada.addPartido(new Partido(e2, e1));

        // Ejecutando lo que queremos hacer
        jornada.simularPartidos();

        // Comprobar que el método funciona bien
        for (Partido p : jornada.getPartidos()) {
            if (p == null)
                continue;

            // Si se ha jugado
            assert p.isJugado() : "SimularPartido: Debe estar jugado";

            // Si tiene un resultado
            assert p.getGolesLocal() >= 0 : "SimularPartido: GolesL no tiene valor válido";
            assert p.getGolesVisitante() >= 0 : "SimularPartido: GolesV no tiene valor válido";
        }

    }

    private static void testImprimirJornada() throws Exception {

        Jornada jornada = new Jornada(1);

        Equipo e1 = new Equipo(1, "Betis");
        Equipo e2 = new Equipo(2, "Sevilla");

        jornada.addPartido(new Partido(e1, e2));
        jornada.addPartido(new Partido(e2, e1));

        // Antes de jugar
        jornada.imprimirJornada();

        jornada.simularPartidos();

        // Despues de jugar
        jornada.imprimirJornada();

    }

}