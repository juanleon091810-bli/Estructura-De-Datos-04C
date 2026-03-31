public class Vagon {

    String contenido;
    double pesoToneladas;
    String origen;
    String destino;

    Vagon next;

    public Vagon(){}

    public Vagon(String contenido, double pesoToneladas, String origen, String destino){
        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
        this.destino = destino;
        this.next = null;
    }
}
