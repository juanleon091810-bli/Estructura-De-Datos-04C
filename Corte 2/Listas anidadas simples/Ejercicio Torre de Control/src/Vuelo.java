public class Vuelo {

    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;

    Vuelo next;

    public Vuelo(){}

    public Vuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros){
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.next = null;
    }
}
