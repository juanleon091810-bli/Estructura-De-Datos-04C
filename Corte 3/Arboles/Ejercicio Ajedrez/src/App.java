// Una plataforma de ajedrez en línea gestiona el ranking ELO de sus jugadores en un BST. 
// A medida que los jugadores completan partidas, su ELO se actualiza y se reinsertan en el árbol. 
// El director del torneo necesita obtener la lista de jugadores que clasifican a la siguiente ronda, 
// es decir, todos aquellos cuyo ELO se encuentre dentro de un rango específico.

// La Clase Jugador (Nodo): Debe contener elo (int, clave del BST), nombreUsuario (String), 
// pais (String) y partidasJugadas (int).
// El Problema: Para la ronda de clasificación, el director fija un rango mínimo y máximo de 
// ELO (por ejemplo, entre 1800 y 2200). Todos los jugadores en ese rango deben ser listados de 
// menor a mayor ELO para armar los emparejamientos.
// Reto: Implementa el método listarEnRango(int eloMin, int eloMax) que recorra el árbol e imprima 
// los datos de todos los jugadores cuyo elo esté dentro del rango [eloMin, eloMax] en orden ascendente. 
// Usa la propiedad del BST para podar: si el nodo actual es menor que eloMin, solo explora el subárbol derecho; 
// si es mayor que eloMax, solo explora el izquierdo.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Clasificacion clasificacion = new Clasificacion();
        int opcion;

        do {
            System.out.println("--- Plataforma de Ajedrez ---");
            System.out.println("1. Insertar jugador");
            System.out.println("2. Listar jugadores en rango");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ELO: ");
                    int elo = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese nombre de usuario: ");
                    String nombreUsuario = sc.nextLine();
                    System.out.print("Ingrese país: ");
                    String pais = sc.nextLine();
                    System.out.print("Ingrese partidas jugadas: ");
                    int partidasJugadas = sc.nextInt();
                    clasificacion.insertar(elo, nombreUsuario, pais, partidasJugadas);
                    break;
                case 2:
                    System.out.print("Ingrese ELO mínimo: ");
                    int eloMin = sc.nextInt();
                    System.out.print("Ingrese ELO máximo: ");
                    int eloMax = sc.nextInt();
                    clasificacion.listarEnRango(eloMin, eloMax);
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
