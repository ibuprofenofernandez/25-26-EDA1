package reto002;

import utils.*;

public class Monitor {

    private String nombre;
    private Niño[] niños;
    private int numeroNiños;
    private final int LIMITE_NIÑOS = 20;
    Console console;
    private boolean jugando;

    public Monitor(String nombre) {
        this.nombre = nombre;
        niños = new Niño[20];
        numeroNiños = 0;
        jugando = false;
        console = new Console();
    }

    public void recibeNiño(Niño niño) {
        assert (numeroNiños < LIMITE_NIÑOS) : "No caben mas!!!";
        niños[numeroNiños] = niño;
        numeroNiños++;
    }

    public void mostrarEstado() {
        console.writeln(nombre);
        console.writeln("Vigilando a " + numeroNiños + " niños");
        for (int i = 0; i < numeroNiños; i++) {
            niños[i].mostrarEstado();
        }
        console.writeln();
        console.writeln("=".repeat(20));
    }

    public boolean estaJugando() {
        return jugando == true;
    }

    public void entregaNiño(Monitor otroMonitor) {
        assert (numeroNiños > 0);
        Niño niño = sacarNiño();
        otroMonitor.recibeNiño(niño);
    }

    private Niño sacarNiño() {
        assert (numeroNiños > 0);
        numeroNiños--;
        return niños[numeroNiños];
    }
}
