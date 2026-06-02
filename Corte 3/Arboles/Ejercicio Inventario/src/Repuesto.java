public class Repuesto {
    int codigoRef;
    String descripcion;
    String marca;
    int stock;
    Repuesto left;
    Repuesto right;

    public Repuesto(int codigoRef, String descripcion, String marca, int stock) {
        this.codigoRef = codigoRef;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.left = null;
        this.right = null;
    }
}
