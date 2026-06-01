public class Pedido {

    String numeroPedido;
    String cliente;
    double totalAPagar;
    boolean cancelado;
    Pedido next;

    public Pedido(String numeroPedido, String cliente, double totalAPagar, boolean cancelado){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.totalAPagar = totalAPagar;
        this.cancelado = cancelado;
        this.next = null;
    }
}
