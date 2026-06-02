public class Nomina {

    Empleado raiz;
    int altura;
    int hojas;

    public Nomina() {
        this.raiz = null;
        this.altura = 0;
        this.hojas = 0;
    }

    private Empleado AgregarEmpleado(Empleado nodo, long cedula, String nombreCompleto, String cargo, double salario){
        if(raiz == null){
            return new Empleado(cedula, nombreCompleto, cargo, salario);
        }
        if (cedula < nodo.cedula) {
            nodo.izquierda = AgregarEmpleado(nodo.izquierda, cedula, nombreCompleto, cargo, salario);
        }
        else if (cedula > nodo.cedula) {
           nodo.derecha = AgregarEmpleado(nodo.derecha, cedula, nombreCompleto, cargo, salario);
        }
        else{
            System.out.println("el numero de cedula " + cedula + " ya ha sido registrado.");
        }
        return nodo;
    }

    public void AgregarEmpleado(long cedula, String nombreCompleto, String cargo, double salario){
        raiz = AgregarEmpleado(raiz, cedula, nombreCompleto, cargo, salario);
    }

    private Empleado Buscar(Empleado nodo, long cedula){
        if(nodo == null){return null;}
        if (cedula == nodo.cedula) {return nodo;}

        if (cedula < nodo.cedula) {
            return Buscar(nodo.izquierda, cedula);
        }
        else{
            return Buscar(nodo.derecha, cedula);
        }
    }

    public Empleado Buscar(long cedula){

        System.out.println("Empleado: " + cedula + 
        "\nNombre Completo: " + Buscar(raiz, cedula).nombreCompleto + 
         "\nCargo: " + Buscar(raiz, cedula).cargo + 
        "\nSalario: " + Buscar(raiz, cedula).salario);
        
        return Buscar(raiz, cedula);
    }

    private Empleado BuscarMinimo(Empleado nodo){
        if(nodo == null){return null;}
        if (nodo.izquierda == null) {return nodo;}
        return BuscarMinimo(nodo.izquierda);
    }

    public Empleado BuscarMinimo(){
        return BuscarMinimo(raiz);
    }

    private Empleado BuscarMaximo(Empleado nodo){
        if(nodo == null){return null;}
        if(nodo.derecha == null){return nodo;}
        return BuscarMaximo(nodo.derecha);
    }

    public Empleado BuscarMaximo(){
        return BuscarMaximo(raiz);
    }

    private int Altura(Empleado nodo){
        if(nodo == null){return 0;}
        int alturaIzquierda = Altura(nodo.izquierda);
        int alturaDerecha = Altura(nodo.derecha);
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public int Altura(){
        return Altura(raiz);
    }

    private int ContarHojas(Empleado nodo){
        if(nodo == null){return 0;}
        if(nodo.izquierda == null && nodo.derecha == null){return 1;}
        return ContarHojas(nodo.izquierda) + ContarHojas(nodo.derecha);
    }

    public int ContarHojas(){
        return ContarHojas(raiz);
    }
}
