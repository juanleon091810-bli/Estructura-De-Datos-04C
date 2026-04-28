public class Historial {

    Comando head;
    Comando tail;
    Comando cursor;

    public Historial(){
        this.head= null;
        this.tail = null;
        this.cursor = null;
    }

    public void agregarComando(Comando nuevo){
        if(this.head == null){
            head = nuevo;
            tail = nuevo;
            nuevo.next = nuevo;
            nuevo.prev = nuevo;
        }
        else{
            nuevo.prev = tail;
            nuevo.next = head;
            tail.next = nuevo;
            head.prev = nuevo;
            tail = nuevo;
        }
        System.out.println("\n====Comando agregado correctamente al historial====");
    }

    public void arriba(Comando siguiente){
        siguiente = cursor;
        if(siguiente != null){
            System.out.println("Comando actual >> " + siguiente);
            siguiente = siguiente.prev;
        }
    }
    // pasa al nodo anterior

    public void abajo(Comando anterior){
        anterior = cursor;
        if(anterior != null){
            System.out.println("Comando actual >> " + anterior);
            anterior = anterior.next;
        }
    }
    // pasa al nodo mas reciente

    public void mostrarCursor(){
        Comando actual = head;
        if (head == null) {
            System.out.println("No hay comandos para mostrar dentro del historial");
        }
        else{
            do {
           System.out.println("\nComando actual >> " + actual); 
           actual = actual.next;
        } while (actual != head);
        }
    }

    public void eliminarActual(Comando actual){
      
        if(actual != null){
            actual.next.prev = actual.next;
            actual.prev.next = actual.prev;
        }
        if (actual == head) {
            head = actual.next;
        }
        else if (actual == tail) {
            tail = actual.prev;
        }

        System.out.println("\n====Comando eliminado correctamente====");
    }
}
