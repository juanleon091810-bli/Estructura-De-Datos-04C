public class Clasificacion {

    Jugador raiz;

    public Clasificacion() {
        this.raiz = null;
    }

    private Jugador insertar(Jugador nodo, int elo, String nombreUsuario, String pais, int partidasJugadas) {
        if (nodo == null) {
            return new Jugador(elo, nombreUsuario, pais, partidasJugadas);
        }
        if (elo < nodo.elo) {
            nodo.izquierda = insertar(nodo.izquierda, elo, nombreUsuario, pais, partidasJugadas);
        } else if (elo > nodo.elo) {
            nodo.derecha = insertar(nodo.derecha, elo, nombreUsuario, pais, partidasJugadas);
        } else {
            // Si el ELO ya existe, actualizamos los datos del jugador
            nodo.nombreUsuario = nombreUsuario;
            nodo.pais = pais;
            nodo.partidasJugadas = partidasJugadas;
        }
        return nodo;
    }

    public void insertar(int elo, String nombreUsuario, String pais, int partidasJugadas) {
        this.raiz = insertar(this.raiz, elo, nombreUsuario, pais, partidasJugadas);
    }

    private Jugador listarEnRango(Jugador nodo, int eloMin, int eloMax) {
        if (nodo == null) {
            return null;
        }
        if (nodo.elo > eloMin) {
            nodo.izquierda = listarEnRango(nodo.izquierda, eloMin, eloMax);
        }
        if (nodo.elo < eloMax) {
            nodo.derecha = listarEnRango(nodo.derecha, eloMin, eloMax);
        }
        if (nodo.elo >= eloMin && nodo.elo <= eloMax) {
            System.out.println("ELO: " + nodo.elo + ", Usuario: " + nodo.nombreUsuario + ", País: " + nodo.pais + ", Partidas Jugadas: " + nodo.partidasJugadas);
        }
        
        return nodo;
    }

    public void listarEnRango(int eloMin, int eloMax) {
        listarEnRango(this.raiz, eloMin, eloMax);
    }

    private Jugador buscar(Jugador nodo, int elo) {
        if (nodo == null) {
            return null;
        }
        if (elo < nodo.elo) {
            return buscar(nodo.izquierda, elo);
        } else if (elo > nodo.elo) {
            return buscar(nodo.derecha, elo);
        } else {
            return nodo;
        }
    }

    public Jugador buscar(int elo) {
        return buscar(raiz, elo);
    }

    
}