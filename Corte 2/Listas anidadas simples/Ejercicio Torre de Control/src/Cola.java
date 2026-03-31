public class Cola {

    Vuelo cabeza;

    public Cola(){
        this.cabeza = null;
    }

    public void agregarVuelo(Vuelo newVuelo){
        if(cabeza == null){
            cabeza = newVuelo;
        }
        else{
            if (newVuelo.combustibleRestante < 10) {
                newVuelo.next = cabeza;
                cabeza  = newVuelo;
            }
            else{
                Vuelo actual = cabeza;
                while (actual.next != null) {
                    actual = actual.next;
                }
                actual.next = newVuelo;
            }
        }
    }

    public void reportarEmergencia(String numeroVuelo){
        if(cabeza == null){
            System.out.println("No hay vuelos en la cola.");
            return;
        }
        if(cabeza.numeroVuelo.equals(numeroVuelo)){
            System.out.println("El vuelo " + numeroVuelo + " ya está en la cabeza de la cola.");
            return;
        }
        Vuelo actual = cabeza;
        Vuelo anterior = null;
        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.next;
        }
        if (actual == null) {
            System.out.println("El vuelo " + numeroVuelo + " no se encontró en la cola.");
            return;
        }
        if (anterior != null) {
            anterior.next = actual.next;
            actual.next = cabeza;
            cabeza = actual;
            System.out.println("El vuelo " + numeroVuelo + " ha sido movido al inicio de la cola por emergencia.");
        }
    }
}
