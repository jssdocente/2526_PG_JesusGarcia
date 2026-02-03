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
        testActualizarClasificacion();
        testImprimirClasificacion();

        System.out.println("✅ Clasificación verificada.");

    }

    public static void testImprimirClasificacion() throws Exception {

        // Crear el escenario
        Clasificacion cl = new Clasificacion();

        Equipo e1 = new Equipo(1, "Valencia");
        Equipo e2 = new Equipo(2, "Getafe");

        Partido p1 = new Partido(e1, e2);
        p1.setResultado(2, 4);

        cl.actualizar(p1);
        cl.ordenar();

        // Actuar
        cl.imprimirClasificacion();

    }

    public static void testActualizarClasificacion() throws Exception {

        System.out.println(">>> Test: Actualizar Clasificacion (Escenario Completo)");

        // 1. Escenario: 3 Equipos
        Clasificacion cl = new Clasificacion();
        Equipo e1 = new Equipo(1, "Valencia");
        Equipo e2 = new Equipo(2, "Getafe");
        Equipo e3 = new Equipo(3, "Betis");

        cl.addEquipo(e1);
        cl.addEquipo(e2);
        cl.addEquipo(e3);

        // 2. Transacciones (Partidos)

        // P1: Valencia 2 - 0 Getafe (Victoria Local)
        Partido p1 = new Partido(e1, e2);
        p1.setResultado(2, 0);
        cl.actualizar(p1);

        // P2: Getafe 1 - 2 Betis (Victoria Visitante)
        Partido p2 = new Partido(e2, e3);
        p2.setResultado(1, 2);
        cl.actualizar(p2);

        // P3: Betis 1 - 1 Valencia (Empate)
        Partido p3 = new Partido(e3, e1);
        p3.setResultado(1, 1);
        cl.actualizar(p3);

        // 3. Verificaciones (Asserts)

        // -- VALENCIA (1 Ganado, 1 Empatado) -> 4 Ptos. Goles: 3F, 1C
        FilaClasificacion fE1 = cl.getEquipoClasificacion(e1);
        assert fE1.getPuntos() == 4 : "E1: Puntos incorrectos (Esperado 4)";
        assert fE1.getPartidosJugados() == 2 : "E1: PJ incorrectos";
        assert fE1.getGolesFavor() == 3 : "E1: GF incorrectos";
        assert fE1.getGolesContra() == 1 : "E1: GC incorrectos";

        // -- BETIS (1 Ganado, 1 Empatado) -> 4 Ptos. Goles: 3F, 2C
        FilaClasificacion fE3 = cl.getEquipoClasificacion(e3);
        assert fE3.getPuntos() == 4 : "E3: Puntos incorrectos (Esperado 4)";
        assert fE3.getGolesFavor() == 3 : "E3: GF incorrectos";
        assert fE3.getGolesContra() == 2 : "E3: GC incorrectos";

        // -- GETAFE (2 Perdidos) -> 0 Ptos. Goles: 1F, 4C
        FilaClasificacion fE2 = cl.getEquipoClasificacion(e2);
        assert fE2.getPuntos() == 0 : "E2: Puntos incorrectos (Esperado 0)";
        assert fE2.getGolesFavor() == 1 : "E2: GF incorrectos";
        assert fE2.getGolesContra() == 4 : "E2: GC incorrectos";

        System.out.println("✅ Actualización de Clasificación verificada correctamente.");
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