package reto002;

import utils.Console;

public class Ludoteca {

    private Monitor lydia, aisha, dalsy;
    private Console console;

    public Ludoteca() {
        lydia = new Monitor("Lydia");
        aisha = new Monitor("Aisha");
        dalsy = new Monitor("Dalsy");
        console = new Console();
    }

    public void recibir(Niño niño) {
        lydia.recibir(niño);
    }

    public void mostrarEstado() {
        lydia.mostrarEstado();
        aisha.mostrarEstado();
        dalsy.mostrarEstado();
    }

    public void jugar() {
        String mensaje = "";
        if (aisha.estaJugando()) {
            mensaje = "Ya está jugando!";
        } else {
            lydia.entregar(aisha);
            aisha.jugar();
            mensaje = "Empieza el juego!";
            if (!aisha.estaJugando()) {
                aisha.entregar(lydia);
                mensaje = "No hay suficientes niños!";
            }
        }
        console.writeln(mensaje);
    }

    public void detenerJuego() {
        aisha.detenerJuego();
    }

    public void contar() {
        aisha.contar();
    }
}
