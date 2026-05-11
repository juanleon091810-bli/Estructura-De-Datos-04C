public class Contenedor {

    int idCodigo;
    String empresa;
    Double peso;
    String tipoCarga;

    Contenedor next;

    public Contenedor(int idCodigo, String empresa, Double peso, String tipoCarga){
        this.idCodigo = idCodigo;
        this.empresa = empresa;
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.next = null;
    }
}
