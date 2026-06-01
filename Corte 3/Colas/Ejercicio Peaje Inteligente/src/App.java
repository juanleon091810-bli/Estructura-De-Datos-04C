// En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. 
// El sistema registra automáticamente cada vehículo al entrar al carril. El cajero cobra en el orden estricto de llegada.

// La Clase Vehiculo (Nodo): Debe contener placa (String), tipoVehiculo (String), tarifa (double) y esExento (boolean).
// El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
// Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, 
// acumule la tarifa solo de los que tengan esExento = false e imprima el total recaudado al finalizar.

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Peaje colaPeaje = new Peaje();
        int opcion;

        do{
            System.out.println("1. Ingresar vehículo al peaje");
            System.out.println("2. Ver tamaño de la cola");
            System.out.println("3. Ver vehículo al frente");
            System.out.println("4. Retirar vehículo del peaje");
            System.out.println("Ingrese una opcion: \n");
            System.out.println("0. Cerrar turno");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    sc.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese la placa del vehículo: ");
                    String placa = sc.nextLine();
                    System.out.println("Ingrese el tipo de vehículo: ");
                    String tipoVehiculo = sc.nextLine();
                    System.out.println("Ingrese la tarifa del vehículo: ");
                    double tarifa = sc.nextDouble();
                    System.out.println("¿El vehículo es exento de pago? (true/false): ");
                    boolean esExento = sc.nextBoolean();
                    Vehiculo nuevoVehiculo = new Vehiculo(placa, tipoVehiculo, tarifa, esExento);
                    colaPeaje.enqueue(nuevoVehiculo);
                    break;
                case 2:
                    System.out.println("Tamaño de la cola: " + colaPeaje.getsize());
                    break;
                case 3:
                    Vehiculo vehiculoFrente = colaPeaje.peek();
                    if(vehiculoFrente != null){
                        System.out.println("Vehículo al frente: " + 
                        vehiculoFrente.placa + " - " + vehiculoFrente.tipoVehiculo);
                    }
                    break;
                case 4:
                    colaPeaje.dequeue();
                    break;
                case 0:
                    colaPeaje.cerrarTurno();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while(opcion != 0);
        sc.close();
    }
}
