package reto002;

import utils.*;

public class Niño {

    private String nombre;
    private int edad;
    Console console;

    public Niño(String string, int int1) {
        this.nombre = string;
        this.edad = int1;
        console = new Console();
    }

    public void mostrarEstado() {
        console.write (nombre + " [" + edad + " años] / ");
    }

}
