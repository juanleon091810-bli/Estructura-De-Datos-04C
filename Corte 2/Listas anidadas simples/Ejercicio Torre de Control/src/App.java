// Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

// La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), combustibleRestante (int) 
// y pasajeros (int). El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta 
// menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
// Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un vuelo en la cola y lo mueva al principio.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cola cola = new Cola();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===============================");
            System.out.println("MENU DE OPCIONES");
            System.out.println("================================");
            System.out.println("1. Agregar vuelo a la cola");
            System.out.println("2. Reportar emergencia");
            System.out.println("0. Salir");
            System.out.println("================================");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            System.out.println("===============================");
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de vuelo: ");
                    String numeroVuelo = sc.nextLine();
                    System.out.print("Ingrese la aerolínea: ");
                    String aerolinea = sc.nextLine();
                    System.out.print("Ingrese el combustible restante: ");
                    int combustibleRestante = sc.nextInt();
                    System.out.print("Ingrese el número de pasajeros: ");
                    int pasajeros = sc.nextInt();
                    sc.nextLine(); 
                    Vuelo newVuelo = new Vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);
                    cola.agregarVuelo(newVuelo);
                    System.out.println("Vuelo agregado a la cola.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de vuelo para reportar emergencia: ");
                    String vueloEmergencia = sc.nextLine();
                    cola.reportarEmergencia(vueloEmergencia);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
