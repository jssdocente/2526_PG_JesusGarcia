// TestClasificacion.java
package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.FilaClasificacion;
import com.pg.ligafutbol.Partido;

public class TestClasificacion {
    public static void main(String[] args) {

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