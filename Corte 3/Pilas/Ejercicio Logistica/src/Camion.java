public class Camion {
    String placa;
    String conductor;
    double cargaToneladas;

    Camion next;

    public Camion(String placa, String conductor, double cargaToneladas){
        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;
        this.next = null;
    }
}
