public class Cola {

     Vagon cabeza;

    public Cola(){
        this.cabeza = null;
    }

    public void agregarVagon(Vagon newVagon){
        if(cabeza == null){
            cabeza = newVagon;   
        }else{
            Vagon actual = cabeza;
            while(actual.next != null){
                actual = actual.next;
            }
            actual.next = newVagon;
        }
    }

    public double calcularPesoTotal(){
        double pesoTotal = 0;
        Vagon actual = cabeza;
        while(actual != null){
            pesoTotal += actual.pesoToneladas;
            actual = actual.next;
        }
        return pesoTotal;
    }
}
