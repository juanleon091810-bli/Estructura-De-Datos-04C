public class Peaje {

    Vehiculo frente;
    Vehiculo fin;
    int size;

    public Peaje(){
        this.frente = null;
        this.fin = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(Vehiculo nuevoVehiculo){
        if(isEmpty()){
            frente = nuevoVehiculo;
            fin = nuevoVehiculo;
        }else{
            fin.next = nuevoVehiculo;
            fin = nuevoVehiculo;
        }
        size++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("El carril del peaje esta vacio.");
        }
        else{
            frente = frente.next;
            size--;
        }
    }

    public int getsize(){
        return this.size;
    }

    public Vehiculo peek(){
        if(isEmpty()){
            dequeue();
            return null;
        }
        return frente;
    }

    public void cerrarTurno(){
        double totalRecaudado = 0;
        while(!isEmpty()){
            Vehiculo vehiculoActual = peek();
            if(!vehiculoActual.esExento){
                totalRecaudado += vehiculoActual.tarifa;
            }
            dequeue();
        }
        System.out.println("Total recaudado: " + totalRecaudado);
    }
}
