package reto002;

import utils.*;

public class Niño {

    private String nombre;
    private int edad;
    private Niño siguienteNiño;
    Console console;

    public Niño(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        siguienteNiño = null;
        console = new Console();
    }

    public void mostrarEstado() {
        console.writeln("> " + nombre + " [" + edad + " años] / ");
        if (siguienteNiño != null) {
            siguienteNiño.mostrarEstado();
        }
    }

    public void recibir(Niño niño) {
        if (siguienteNiño == null) {
            siguienteNiño = niño;
        } else {
            siguienteNiño.recibir(niño);
        }
    }

    public int contar() {
        if (siguienteNiño == null) {
            return 1;
        } else {
            return 1 + siguienteNiño.contar();
        }
    }
}
