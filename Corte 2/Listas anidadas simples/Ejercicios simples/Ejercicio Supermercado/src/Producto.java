public class Producto {

    String nombre;
    int cantidad;
    int diasParaVencer;

    Producto next;

    public Producto(){}

    public Producto(String nombre, int cantidad, int diasParaVencer){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasParaVencer = diasParaVencer;
        this.next = null;
    }
}
