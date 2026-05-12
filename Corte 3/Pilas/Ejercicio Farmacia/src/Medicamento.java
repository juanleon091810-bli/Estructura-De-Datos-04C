public class Medicamento {
    String nombre;
    String lote;
    int diasParaVencer;

    Medicamento next;

    public Medicamento(String nombre, String lote, int diasParaVencer){
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
        this.next = null;
    }
}
