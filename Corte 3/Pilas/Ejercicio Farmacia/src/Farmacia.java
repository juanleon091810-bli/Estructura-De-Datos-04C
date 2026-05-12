public class Farmacia {
    private Medicamento top;
    private int size;

    public Farmacia(){
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(Medicamento newMed){
        newMed.next = top;
        top = newMed;
        size++;
    }

    public Medicamento pop(){
        if(isEmpty()){
            return null;
        }
        Medicamento temp = top;
        top = top.next;
        temp.next = null;
        size--;
        return temp;
    }

    public void validarDespacho(){
        while(!isEmpty() && top.diasParaVencer < 10){
            System.out.println("El medicamento " + top.nombre + " del lote " + top.lote + " ha sido retirado por estar a punto de vencer.");
            pop();
        }
        if(isEmpty()){
            System.out.println("No hay medicamentos disponibles para despachar.");
        } else {
            System.out.println("El medicamento " + top.nombre + " del lote " + top.lote + " es seguro para despachar.");
        }
    }

    public int getSize(){
        return size;
    }

    public Medicamento peek(){
        return top;
    }
}
