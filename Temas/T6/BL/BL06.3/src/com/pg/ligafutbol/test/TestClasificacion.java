// TestClasificacion.java
package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Clasificacion;
import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.FilaClasificacion;
import com.pg.ligafutbol.Partido;

public class TestClasificacion {
    public static void main(String[] args) throws Exception {

        System.out.println(">>> Test: Clasificacion (Stats)");

        // testFilaClasificacion();
        // testActualizarClasificacion();
        testImprimirClasificacion();

        System.out.println("✅ Clasificación verificada.");

    }

    public static void testImprimirClasificacion() throws Exception {

        // Crear el escenario
        Clasificacion cl = new Clasificacion();

        Equipo e1 = new Equipo(1, "Valencia");
        Equipo e2 = new Equipo(2, "Getafe");
        Equipo e3 = new Equipo(3, "B");
        Equipo e4 = new Equipo(4, "C");
        Equipo e5 = new Equipo(5, "D");
        Equipo e6 = new Equipo(6, "D");

        cl.addEquipo(e1);
        cl.addEquipo(e2);
        cl.addEquipo(e3);
        cl.addEquipo(e4);
        cl.addEquipo(e5);
        cl.addEquipo(e6);

        Partido p1 = new Partido(e1, e2);
        p1.setResultado(2, 4);

        cl.actualizar(p1);
        cl.ordenar();

        // Actuar
        cl.imprimirClasificacion();

    }

    public static void testActualizarClasificacion() throws Exception {

        // Crear el escenario
        Clasificacion cl = new Clasificacion();

        Equipo e1 = new Equipo(1, "Valencia");
        Equipo e2 = new Equipo(2, "Getafe");

        cl.addEquipo(e1);
        cl.addEquipo(e2);

        Partido p1 = new Partido(e1, e2);
        p1.setResultado(4, 2);

        // Actuar
        cl.actualizar(p1);

        // Assert
        FilaClasificacion clEquipo = cl.getEquipoClasificacion(e1);

        assert clEquipo.getPuntos() == 3 : "E1: Error puntos totales";
        assert clEquipo.getGolesFavor() == 3 : "E1: Error goles favor";
        assert clEquipo.getGolesContra() == 2 : "E1: Error goles contra";
        assert clEquipo.getPartidosJugados() == 1 : "E1: Error partidos jugados";

        clEquipo = cl.getEquipoClasificacion(e2);

        assert clEquipo.getPuntos() == 0 : "E2: Error puntos totales";
        assert clEquipo.getGolesFavor() == 2 : "E2: Error goles favor";
        assert clEquipo.getGolesContra() == 3 : "E2: Error goles contra";
        assert clEquipo.getPartidosJugados() == 1 : "E2: Error partidos jugados";

    }

    public static void testFilaClasificacion() {
        System.out.println(">>> Test: FilaClasificacion (Stats)");
        Equipo e1 = new Equipo(1, "Valencia");

        Equipo e2 = new Equipo(2, "Getafe");
        Equipo e3 = new Equipo(3, "R.Socidad");

        FilaClasificacion fila = new FilaClasificacion(e1);

        Partido p1 = new Partido(e1, e2);
        Partido p2 = new Partido(e1, e3);
        Partido p3 = new Partido(e1, e2);

        p1.setResultado(2, 0);
        fila.actualizarStats(p1.getGolesLocal(), p1.getGolesVisitante()); // Gana
        assert fila.getPuntos() == 3 : "Error puntos gana";

        p2.setResultado(1, 1);
        fila.actualizarStats(p2.getGolesLocal(), p2.getGolesVisitante()); // Empata
        assert fila.getPuntos() == 4 : "Error puntos gana+empate";

        p3.setResultado(2, 4);
        fila.actualizarStats(p3.getGolesLocal(), p3.getGolesVisitante()); // Pierde
        assert fila.getPuntos() == 4 : "Error puntos gana+empate+pierde";

        // Partidos Jugados
        assert fila.getPartidosJugados() == 3 : "Error partidos jugados";

        assert fila.getGolesFavor() == 5 : "Error goles a favor";

        // Partidos Jugados
        assert fila.getGolesContra() == 5 : "Error goles en contra";

        System.out.println("✅ FilaClasificación verificada.");
    }
}