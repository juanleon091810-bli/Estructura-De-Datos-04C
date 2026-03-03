// Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente 
// por su número de cédula o ID.

// El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe 
// encontrar sus datos de la manera más 
// rápida posible (en pocos pasos).
// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están 
// ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso

import java.util.Scanner;

public class Ejercicio_Array_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int[] clientes = new int[1000];
        // Llenaremos el array con números de cédula de clientes (simulados)
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = 500 + i; // Simulando cédulas desde 500 hasta 1499
        }

        System.out.print("Ingrese el número de cédula del cliente: ");
        int cedula = scanner.nextInt();

        int index = busquedaBinaria(clientes, cedula);
        if (index != -1) {
            System.out.println("Cliente encontrado en el índice: " + index);
        } else {
            System.out.println("Cliente no encontrado.");
        }
        scanner.close();
    }

    public static int busquedaBinaria(int[] array, int objetivo) {
        int izquierda = 0;
        int derecha = array.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            
            if (array[medio] == objetivo) {
                return medio;
            } else if (array[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
}
