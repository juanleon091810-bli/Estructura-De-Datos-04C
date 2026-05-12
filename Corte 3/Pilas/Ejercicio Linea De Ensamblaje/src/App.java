// Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. 
// Un sensor de visión artificial inspecciona cada pieza después de ser colocada.

// La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
// El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
// Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar la primera que 
// tenga esDefectuosa = true. El método debe imprimir 
// el nombre de todas las piezas "buenas" que tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fabrica fabrica = new Fabrica();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n[-[-[-[-[-[ Fábrica de Motores ]-]-]-]-]-]");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Ver pieza superior");
            System.out.println("3. Ver pila completa");
            System.out.println("4. Limpiar hasta defecto");
            System.out.println("0. Salir");
            System.out.println("---------------------------------------");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la pieza: ");
                    String nombrePieza = sc.nextLine();
                    System.out.print("Ingrese el número de serie: ");
                    String numeroSerie = sc.nextLine();
                    System.out.print("¿La pieza es defectuosa? (true/false): ");
                    boolean esDefectuosa = sc.nextBoolean();
                    Pieza nuevaPieza = new Pieza(nombrePieza, numeroSerie, esDefectuosa);
                    fabrica.push(nuevaPieza);
                    break;
                case 2:
                    System.out.println("Pieza superior:");
                    Pieza top = fabrica.peek();
                    if (top != null) {
                        System.out.println("Nombre: " + top.nombrePieza);
                        System.out.println("Número de serie: " + top.numeroSerie);
                        System.out.println("Es defectuosa: " + top.esDefectuosa);
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Pila completa:");
                    fabrica.print();
                    break;
                case 4:
                    fabrica.limpiarHastaDefecto();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
