public class Stock {

    Producto inicio;

    public Stock(){
        this.inicio = null;
    }

    public void agregarProducto(Producto newProducto){
        if(inicio == null){
            inicio = newProducto;
        } else {
            if(newProducto.diasParaVencer < 3){
                newProducto.next = inicio;
                inicio = newProducto;
            } else {
                Producto actual = inicio;
                while(actual.next != null){
                    actual = actual.next;
                }
                actual.next = newProducto;
            }
        }
    }

    public void prodCercaVencer(){
        Producto actual = inicio;
        while(actual != null){
            if(actual.diasParaVencer < 5){
                System.out.println("\nProducto: " + actual.nombre + 
                "\nCantidad: " + actual.cantidad + "\nDías para vencer: " + actual.diasParaVencer);
            }
            actual = actual.next;
        }
    }
}
