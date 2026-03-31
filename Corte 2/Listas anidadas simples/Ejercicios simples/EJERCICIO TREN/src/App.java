// Diseña un sistema para gestionar los vagones de un tren de carga internacional.

// La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), origen (String) y destino (String).
// El Problema: El tren sale de una estación y se le van enganchando vagones al final.
// Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cola tren = new Cola();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("\n============================");
            System.out.println("MENU PRINCIPAL");
            System.out.println("=============================");
            System.out.println("1. Agregar Vagon");
            System.out.println("2. Calcular Peso Total");
            System.out.println("0. Salir");
            System.out.println("=============================");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println("=============================");
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el contenido del vagon: ");
                    String contenido = scanner.nextLine(); 
                    System.out.print("Ingrese el peso en toneladas: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el origen: ");
                    String origen = scanner.nextLine();
                    System.out.print("Ingrese el destino: ");
                    String destino = scanner.nextLine();
                    Vagon newVagon = new Vagon(contenido, peso, origen, destino);
                    tren.agregarVagon(newVagon);
                    System.out.println("================================");
                    System.out.println("Vagon agregado exitosamente.");
                    System.out.println("================================");

                    break;

                    case 2:
                    double pesoTotal = tren.calcularPesoTotal();
                    System.out.println("================================");
                    System.out.println("El peso total de la carga es: " + pesoTotal + " toneladas.");
                    System.out.println("================================");

                    break;

                    case 0:
                    System.out.println("Saliendo del programa...");
            
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }
}
