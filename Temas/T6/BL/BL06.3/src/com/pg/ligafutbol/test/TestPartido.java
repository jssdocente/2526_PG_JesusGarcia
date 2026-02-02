package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;
import com.pg.ligafutbol.Partido;

public class TestPartido {
    public static void main(String[] args) {
        System.out.println(">>> Test: Partido");
        Equipo e1 = new Equipo(1, "Betis");
        Equipo e2 = new Equipo(2, "Sevilla");
        Partido p = new Partido(e1, e2);
        assert !p.isJugado() : "Error: No debería estar jugado";
        p.setResultado(2, 1);
        assert p.isJugado() : "Error: Debería estar jugado";
        assert p.getGolesLocal() == 5 && p.getGolesVisitante() == 1 : "Error en goles";

        System.out.println("✅ Partido verificado.");
    }
}
