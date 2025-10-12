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

    public void recibir(Niño niño) {
        if (siguiente == null) {
            siguiente = niño;
        } else {
            siguiente.recibir(niño);
        }
    }

    public int contar() {
        if (siguiente == null) {
            return 1;
        } else {
            return 1 + siguiente.contar();
        }
    }

    public Niño siguiente() {
        return siguiente;
    }
}
