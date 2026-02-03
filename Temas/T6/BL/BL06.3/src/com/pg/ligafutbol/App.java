package com.pg.ligafutbol;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("******************************************");
        System.out.println("******* LIGA DE FUTBOL SIMULADOR *********");
        System.out.println("******************************************");

        // 1. Crear la liga
        Liga liga = new Liga();

        System.out.println("\n>> Equipos participantes:");
        liga.imprimrLiga();

        // 2. Generar el calendario
        System.out.println("\n>> Generando calendario...");
        liga.generarCalendario();
        liga.imprimirCalendario();

        // 3. Simular la temporada
        System.out.println("\n>> Simulando partidos de la temporada...");
        liga.simularJornadas();

        // 4. Mostrar la clasificación final
        System.out.println("\n>> Clasificación Final:");
        liga.imprimirClasificacion();

        System.out.println("\n✅ Simulación finalizada correctamente.");
    }
}
