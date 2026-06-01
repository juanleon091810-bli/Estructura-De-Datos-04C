// En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados
// en una fila de atención. 
// Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. 
// Al momento de llamar a un paciente, el sistema debe mostrar su información completa.

// La Clase Paciente (Nodo): Debe contener cedula (String), nombreCompleto (String), 
// edad (int) y sintomaPrincipal (String).
// El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes 
// atendidos y la lista completa en orden de atención.
// Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, 
// imprima su información al momento de ser atendido e imprima al final el total de pacientes procesados.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        SalaDeEspera salaDeEspera = new SalaDeEspera();
        int opcion;

        do {
            System.out.println("1. Agregar paciente a la sala de espera");
            System.out.println("2. Atender pacientes");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cedula del paciente: ");
                    String cedula = sc.nextLine();
                    System.out.print("Ingrese el nombre completo del paciente: ");
                    String nombreCompleto = sc.nextLine();
                    System.out.print("Ingrese la edad del paciente: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese el sintoma principal del paciente: ");
                    String sintomaPrincipal = sc.nextLine();

                    Paciente newPaciente = new Paciente(cedula, nombreCompleto, edad, sintomaPrincipal);
                    salaDeEspera.enqueue(newPaciente);
                    break;

                case 2:
                    salaDeEspera.atenderTodos();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
