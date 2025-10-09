package reto002;

public class Ludoteca {

    private Monitor lydia, aisha, dalsy;

    public Ludoteca() {
        lydia = new Monitor("Lydia");
        aisha = new Monitor("Aisha");
        dalsy = new Monitor("Dalsy");
    }

    public void recibirNiño(Niño niño) {
        lydia.recibeNiño(niño);

        if(!aisha.estaJugando()){
            lydia.entregaNiño(aisha);
        }

    }

    public void mostrarEstado() {
        lydia.mostrarEstado();
        aisha.mostrarEstado();
        dalsy.mostrarEstado();
    }

}
