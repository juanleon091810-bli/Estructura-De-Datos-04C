public class Cambio {
    String texto;
    String tipoOperacion;
    Cambio next;
    Cambio prev;

    public Cambio(){}

    public Cambio(String texto, String tipoOperacion){
        this.texto = texto;
        this.tipoOperacion = tipoOperacion;
        this.next = null;
        this.prev = null;
    }
}
