import java.util.ArrayList;

public class Tablero {
    int casillas;
    ArrayList<Ficha> jugadores;

    public Tablero(int casillas){
        this.casillas = casillas;
        this.jugadores = new ArrayList<Ficha>();
    }

    public void agregarJugador(String color, int carasDado){
        jugadores.add(new Ficha(color, carasDado));
    }

    public String mostrarJugadores(){
        String str = "";
        for (Ficha jugador : jugadores) {
            str += jugador.infoFicha() + "\n\n";
        }
        return str;
    }

    public String statusJuego(){
        String str = "============= STATUS DE JUEGO =============\n\n";
        str += "~ Cantidad de casillas del tablero: " + casillas;
        str += "\n\n~ Jugadores:\n\n" + mostrarJugadores();
        str += "===========================================";
        return str;
    }

}
