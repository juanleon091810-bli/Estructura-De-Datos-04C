public class Fabrica {

    private Pieza top;
    private int size;
    
    public Fabrica(){
        this.top = null;
    }

    public void push(Pieza newPieza){
        newPieza.next = top;
        top = newPieza;
        size++;
    }

    public void pop(){
        if(top != null){
            top = top.next;
            size--;
        }
    }

    public int getSize(){
        return size;
    }

    public Pieza peek(){
        return top;
    }

    public void print(){
        Pieza current = top;
        while(current != null){
            System.out.println("Nombre: " + current.nombrePieza);
            System.out.println("Número de serie: " + current.numeroSerie);
            System.out.println("Es defectuosa: " + current.esDefectuosa);
            System.out.println("---------------------------------------");
            current = current.next;
        }
    }

    public void limpiarHastaDefecto(){
        if(top == null){
            System.out.println("La pila está vacía.");
            return;
        }

        Pieza actual;
        while(top != null){
            actual = top;
            if(actual.esDefectuosa){
                System.out.println("Pieza defectuosa encontrada: " + actual.nombrePieza);
                break;
            } else {
                System.out.println("Pieza buena retirada: " + actual.nombrePieza);
                pop();
            }
        }
    }
}
