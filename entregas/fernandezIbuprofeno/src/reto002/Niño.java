package reto002;

import utils.*;

public class Niño {

    private String nombre;
    private int edad;
    Console console;

    public Niño(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        console = new Console();
    }

    public void mostrarEstado() {
        console.writeln("> " + nombre + " [" + edad + " años] / ");
    }
}
