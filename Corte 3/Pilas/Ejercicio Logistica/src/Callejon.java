public class Callejon {
    private Camion top;
    private int size;

    public Callejon(){
        this.top = null;
        this.size = 0;
    }

    public void push(Camion newCamion){
        newCamion.next = top;
        top = newCamion;
        size++;
    }

    public void pop(){
        if (top == null) {
            System.out.println("La pila de camiones se encuentra vacia.");
        }
        else{
            top = top.next;
            size--;
        }
    }

    public void print(){
        Camion temp = top;
        if (temp != null) {
            System.out.println("Placa: [" + temp.placa + "]");
            System.out.println("Conductor: [" + temp.conductor + "]");
            System.out.println("Peso de la carga: [" + temp.cargaToneladas + "]");
        }
    }

    public double sumaCargas(){
        Camion actual = top;
        double suma = 0;

        do{
            suma += actual.cargaToneladas;
            actual = actual.next; 
        }while (actual != null);
        System.out.println("La carga total de todos los camiones es de " + suma + " toneladas.");
        return suma;
    }

    public int getSize(){
        return size;
    }

    public Camion getTop(){
        return top;
    }

    public Camion peek(){
        if (top == null) {
            System.out.println("La pila de camiones se encuentra vacia.");
            return null;
        }
        else{
            return top;
        }
    }
}
