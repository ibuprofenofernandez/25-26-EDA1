package reto002;

import utils.*;

public class Mundo {
    private Console console;
    private Ludoteca ludoteca;

    public Mundo() {
        console = new Console();
        ludoteca = new Ludoteca();
    }

    public void ejecutarSimulacion() {
        int opcion;
        do {
            mostrarMenu();
            opcion = console.readInt("Seleccione opción: ");
            procesarOpcion(opcion);
            console.readString("Presione ENTER para continuar...");
        } while (opcion != 0);
    }

    private void mostrarMenu() {
        console.clearScreen();
        console.writeln("========================================");
        console.writeln("        LUDOTECA - SIMULACIÓN");
        console.writeln("========================================");
        console.writeln("");
        console.writeln("1.  Simular llegada de niño");
        console.writeln("2.  Simular intento de inicio de juego");
        console.writeln("3.  Aisha se presenta y pide a los niños que se presenten");
        console.writeln("4.  Aisha pide que se presenten los niños mayores de 5 años");
        console.writeln("5.  Aisha pide que se presenten los niños cuyo nombre empieza por letra");
        console.writeln("6.  Aisha pide que se presenten los cinco primeros niños");
        console.writeln("7.  Aisha pide que se presenten los cinco últimos niños");
        console.writeln("8.  Aisha y Lydia dicen cuántos niños hay en cola");
        console.writeln("9.  Aisha dice la edad promedio de los niños en cola");
        console.writeln("10. Simular intento de inicio del juego de la rana");
        console.writeln("11. Paso de niños menores de 5 años a monitora Dalsy");
        console.writeln("12. Alarma contra incendios y protocolo de emergencia");
        console.writeln("--FUNCIONES DE SOPORTE:--");
        console.writeln("13. Mostrar monitoras y niños");
        console.writeln("14. Pedirle a Aisha que deje de jugar.");
        console.writeln("15. Pedirle a Aisha que nos diga cuántos niños hay.");
        console.writeln("");
        console.writeln("0.  Salir");
    }

    private void procesarOpcion(int opcion) {
        if (opcion == 1) {
            recibirNiño();
        } else if (opcion == 2) {
            empezarJuego();
        } else if (opcion == 13) {
            mostrarEstado();
        } else if (opcion == 14) {
            detenerJuego();
        } else if (opcion == 15) {
            contar();
        }
    }

    private void contar() {
        ludoteca.contar();
    }

    private void empezarJuego() {
        ludoteca.jugar();
    }

    private void detenerJuego(){
        ludoteca.detenerJuego();
    }

    private void mostrarEstado() {
        console.clearScreen();
        ludoteca.mostrarEstado();
    }

    private void recibirNiño() {
        Niño niño = new Niño(inventarNombre(), inventarEdad());
        niño.mostrarEstado();
        ludoteca.recibir(niño);
    }

    private int inventarEdad() {
        final int EDAD_MAXIMA = 10;
        return (int) (Math.random() * EDAD_MAXIMA + 1);
    }

    private String inventarNombre() {
        String nombres[] = {
                "Andrés", "Pablo", "Diego", "Aníbal", "Umut", "Javier", "Fernando",
                "Cayetano", "Iker", "Mario", "Adrián", "Paula", "Veronika", "Eduardo",
                "Hugo", "César", "Miguel", "Santiago", "Juan", "Daniel", "Álvaro",
                "Maura", "Neco", "Sergio", "Aurelio", "Jorge", "Raúl", "José Manuel",
                "José Luis", "Óscar", "Rubén", "Gabriel", "Iñaki", "Alejandro", "Andriuw"
        };
        return nombres[(int) (Math.random() * nombres.length)];
    }

    public static void main(String[] args) {
        new Mundo().ejecutarSimulacion();
    }
}
