// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. 
// Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión 
// en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.

// La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones 
// físicamente (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) 
// y calcule la suma total de cargaToneladas de todos los camiones estacionados.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Callejon callejon = new Callejon();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\n·········GESTION DEL CALLEJON DE CARGA·········");
            System.out.println("1. Agregar camión");
            System.out.println("2. Retirar camión");
            System.out.println("3. Mostrar camión en la entrada del callejón");
            System.out.println("4. Calcular carga total en el callejón");
            System.out.println("0. Salir");
            System.out.println("································");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("································");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la placa del camión: ");
                    String placa = sc.nextLine();
                    System.out.print("Ingrese el nombre del conductor: ");
                    String conductor = sc.nextLine();
                    System.out.print("Ingrese la carga en toneladas: ");
                    double cargaToneladas = sc.nextDouble();
                    sc.nextLine();

                    Camion newCamion = new Camion(placa, conductor, cargaToneladas);
                    callejon.push(newCamion);
                    break;
                case 2:
                    callejon.pop();
                    break;
                case 3:
                    Camion topCamion = callejon.peek();
                    if (topCamion != null) {
                        System.out.println("Camión en la entrada del callejón:");
                        System.out.println("Placa: [" + topCamion.placa + "]");
                        System.out.println("Conductor: [" + topCamion.conductor + "]");
                        System.out.println("Peso de la carga: [" + topCamion.cargaToneladas + "]");
                    }
                    break;
                case 4:
                    callejon.sumaCargas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
            }
        }while(opcion != 0);
        sc.close();
    }
}
