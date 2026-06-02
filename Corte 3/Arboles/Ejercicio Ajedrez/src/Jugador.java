public class Jugador {

    int elo;
    String nombreUsuario;
    String pais;
    int partidasJugadas;

    Jugador derecha;
    Jugador izquierda;

    public Jugador(int elo, String nombreUsuario, String pais, int partidasJugadas) {
        this.elo = elo;
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.partidasJugadas = partidasJugadas;
        this.derecha = null;
        this.izquierda = null;
    }
}
