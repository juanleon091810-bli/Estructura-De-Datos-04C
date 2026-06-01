public class SalaDeEspera {

    Paciente frente;
    Paciente fin;
    int totalPacientes;

    public SalaDeEspera() {
        this.frente = null;
        this.fin = null;
        this.totalPacientes = 0;
    }

    public boolean IsEmpty(){
        return this.frente == null;
    }

    public int size(){
        return this.totalPacientes;
    }

    public SalaDeEspera peek(){
        if(IsEmpty()){
            System.out.println("La sala de espera esta vacia");
            return null;
        }
        else{
            return null;
        }
    }

    public void enqueue(Paciente newPaciente){
        if(IsEmpty()){
            this.frente = newPaciente;
            this.fin = newPaciente;
        }
        else{
            frente.siguiente = newPaciente;
            this.fin = newPaciente;
        }
        totalPacientes++;
    }

    public Paciente dequeue(){
        if(IsEmpty()){
            System.out.println("La sala de espera esta vacia");
            return null;
        }
        else{
            Paciente pacienteAtendido = this.frente;
            this.frente = this.frente.siguiente;
            totalPacientes--;
            return pacienteAtendido;
        }
    }

    public void atenderTodos(){
        while(!IsEmpty()){
            Paciente pacienteAtendido = dequeue();
            System.out.println("Paciente atendido: " + pacienteAtendido.nombreCompleto + 
            "\nCedula: " + pacienteAtendido.cedula + 
            "\nEdad: " + pacienteAtendido.edad + 
            "\nSintoma Principal: " + pacienteAtendido.sintomaPrincipal);
        }
        System.out.println("Total de pacientes atendidos: " + totalPacientes);
    }
}
