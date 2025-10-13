package reto002;

import utils.*;

public class Niño {

    private String nombre;
    private int edad;
    private Niño siguiente;
    Console console;

    public Niño(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        siguiente = null;
        console = new Console();
    }

    public void mostrarEstado() {
        console.writeln("> " + nombre + " [" + edad + " años] / ");
    }

    public Niño siguiente() {
        return siguiente;
    }

    public void recibir(Niño niño) {
        siguiente = niño;
    }
    
}