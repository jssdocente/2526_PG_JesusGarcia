package com.pg.ligafutbol.test;

import com.pg.ligafutbol.Equipo;

public class TestEquipo {
    public static void main(String[] args) {

        System.out.println(">>> Test: Equipo");

        Equipo e = new Equipo(1, "Real Madrid");
        assert e.getNombre().equals("Real Madrid") : "Error: El nombre no coincide";
        assert e.getCodigo() == 2 : "Error: El código no coincide";

        System.out.println("✅ Equipo verificado.");

    }
}
