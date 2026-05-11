public class PilaContenedores {

    private Contenedor top;
    private int size;

    public PilaContenedores(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(Contenedor newContenedor){
        newContenedor.next = top;
        top = newContenedor;
        size++;
    }

    public int getSize(){
        return size;
    }

    public Contenedor pop(){
        if (!isEmpty()) {
            Contenedor temp = top;
            top = top.next;
            size--;
            temp.next = null;
            return temp;
        }
        else{
            System.out.println("La pila ya se encuentra vacia en ese momento.");
            return null;
        }
    }

    public Contenedor peek(){
        return top;
    }

    public void print(){
        if(isEmpty()){
            System.out.println( "La pila se encuentra vacia");
        }
        else{
            Contenedor actual = top;
            System.out.println("||=||=||ESTADO Del MUELLE (de top a base)||=||=||");

            while(actual != null){
                if (actual == top) {
                    
                }
            }
        }
    }
}
