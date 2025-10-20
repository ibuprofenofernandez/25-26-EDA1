package reto002;

import utils.*;

public class Monitor {

    private String nombre;
    private Niño primerNiño;
    Console console;
    private boolean jugando;
    private int numeroNiños;

    public Monitor(String nombre) {
        this.nombre = nombre;
        primerNiño = null;
        numeroNiños = 0;
        jugando = false;
        console = new Console();
    }

    public void recibir(Niño niño) {
        if (primerNiño == null) {
            primerNiño = niño;
        } else {
            primerNiño.recibir(niño);
        }
        contar();
    }

    public void contar() {
        if (primerNiño == null) {
            numeroNiños = 0;
        } else {
            numeroNiños = primerNiño.contar();
        }
        console.writeln("Hay " + numeroNiños + " niños");
    }

    public void mostrarEstado() {
        console.writeln(nombre);
        console.writeln("Vigilando a " + numeroNiños + " niños");
        if (primerNiño != null) {
            primerNiño.mostrarEstado();
        }
        console.writeln();
        console.writeln("=".repeat(20));
    }

    public boolean estaJugando() {
        return jugando == true;
    }

    public void entregar(Monitor otroMonitor) {
        otroMonitor.recibir(primerNiño);
        primerNiño = null;
    }

    public boolean puedeJugar() {
        return !estaJugando() && numeroNiños >= 5;
    }

    public void jugar() {
        if (puedeJugar()) {
            jugando = true;
            console.writeln(nombre + " empieza a jugar!!!");
        } else {
            jugando = false;
            console.writeln(nombre + " no puede empezar a jugar!!!");
        }
    }

    public void detenerJuego() {
        jugando = false;
    }
}
