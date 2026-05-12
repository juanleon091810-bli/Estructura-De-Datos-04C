public class Contenedor {

    String idCodigo;
    String empresa;
    Double peso;
    String tipoCarga;

    Contenedor next;

    public Contenedor(String idCodigo, String empresa, Double peso, String tipoCarga){
        this.idCodigo = idCodigo;
        this.empresa = empresa;
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.next = null;
    }
}
