public class Fabrica {

    Pedido frente;
    Pedido fin;
    int totalDespachados;
    int totalCancelados;
    
    public Fabrica(){
        this.frente = null;
        this.fin = null;
        this.totalDespachados = 0;
        this.totalCancelados = 0;
    }

    public void agregarPedido(String numeroPedido, String cliente, double totalAPagar, boolean cancelado){
        Pedido nuevoPedido = new Pedido(numeroPedido, cliente, totalAPagar, cancelado);
        if(frente == null){
            frente = nuevoPedido;
            fin = nuevoPedido;
        }else{
            fin.next = nuevoPedido;
            fin = nuevoPedido;
        }
    }

    public boolean IsEmpty(){
        return frente == null;
    }

    public void procesarPedidos(){
        while(!IsEmpty()){
            Pedido pedidoActual = frente;
            if(pedidoActual.cancelado){
                totalCancelados++;
                System.out.println("Pedido " + pedidoActual.numeroPedido + " cancelado. Descartando...");
            }else{
                totalDespachados++;
                System.out.println("Despachando Pedido: " + pedidoActual.numeroPedido + 
                "\nCliente: " + pedidoActual.cliente + "\nTotal a Pagar: $" + pedidoActual.totalAPagar);
            }
            frente = frente.next;
        }
        fin = null;
        System.out.println("Total Despachados: " + totalDespachados);
        System.out.println("Total Cancelados: " + totalCancelados);
    }

    public void mostrarPedidos(){
        Pedido actual = frente;
        while(actual != null){
            System.out.println("Pedido: " + actual.numeroPedido + "\nCliente: " + 
            actual.cliente + "\nTotal a Pagar: $" + actual.totalAPagar + 
            "\nCancelado: " + actual.cancelado);
            actual = actual.next;
        }
    }

    public void vaciarPedidos(){
        frente = null;
        fin = null;
        totalDespachados = 0;
        totalCancelados = 0;
    }

    public Pedido peek(){
        if(!IsEmpty()){
            return frente;
        }
        return null;
    }
}
