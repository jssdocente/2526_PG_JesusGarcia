package com.pg.ligafutbol;

public class Equipo {

    private String nombre;
    private int codigo;

    public Equipo(int codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
