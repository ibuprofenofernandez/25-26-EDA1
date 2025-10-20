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
        if (siguiente != null) {
            siguiente.mostrarEstado();
        }
    }

    public Niño siguiente() {
        return siguiente;
    }

    public void recibir(Niño niño) {
        if (siguiente == null) {
            siguiente = niño;
        } else {
            siguiente.recibir(niño);
        }
    }

    public void presentar() {
        console.writeln("> Soy " + nombre + " y tengo " + edad + " años");
        if (siguiente != null) {
            siguiente.presentar();
        }
    }

    public int getEdad() {
        return edad;
    }

    public int contar() {
        if (siguiente != null) {
            return siguiente.contar() + 1;
        } else {
            return 1;
        }
    }

    public void presentar(int edadMinima) {
        if (edad >= edadMinima) {
            console.writeln("> Soy " + nombre + " y tengo " + edad + " años");
        }
        if (siguiente != null) {
            siguiente.presentar(edadMinima);
        }
    }
}