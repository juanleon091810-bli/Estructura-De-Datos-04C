public class Pieza {

    String nombrePieza;
    String numeroSerie;
    boolean esDefectuosa;

    Pieza next;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuosa){
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuosa;
        this.next = null;
    }
}
