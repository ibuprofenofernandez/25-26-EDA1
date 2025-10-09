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

    public void recibirNiño(Niño niño) {
        lydia.recibeNiño(niño);

        if (!aisha.estaJugando()) {
            lydia.entregaNiño(aisha);
        }

    }

    public void mostrarEstado() {
        lydia.mostrarEstado();
        aisha.mostrarEstado();
        dalsy.mostrarEstado();
    }

    public void empezarJuego() {
        if (aisha.puedeJugar()) {
            aisha.empezarJuego();
        } else {
            console.writeln("No se puede jugar porque " + (aisha.puedeJugar() ? "ya está jugando!" : "faltan niños!"));
        }
    }

}
