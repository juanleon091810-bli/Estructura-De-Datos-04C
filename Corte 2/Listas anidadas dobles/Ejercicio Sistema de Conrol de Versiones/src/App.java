// Diseña un editor de texto muy simple que guarde el historial de cambios.

// La Clase Cambio (Nodo): Debe contener texto (String) y tipoOperacion (String - ej: "Escribir", "Borrar").
// El Problema: Cada vez que el usuario escribe algo, se agrega un nodo al final. El usuario puede deshacer 
// (retroceder al nodo anterior) y rehacer (avanzar al nodo siguiente).
// Reto: Implementa métodos deshacer() y rehacer() que muevan un puntero actual a través de la lista doble

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Opcion opcion = new Opcion();    
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\nOPCIONES DISPINIBLES:");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println( "0. Salir");
            opc = sc.nextInt();
        }while(opc != 0);
    }
}
