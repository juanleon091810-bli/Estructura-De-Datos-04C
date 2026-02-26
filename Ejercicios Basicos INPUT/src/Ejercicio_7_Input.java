// Pide al usuario 4 precios para llenar un arreglo precios[]. 
// Crea preciosAuditoria = precios (misma referencia). Pide al usuario 
// el índice y el nuevo precio para hacer una corrección desde preciosAuditoria. 
// Muestra ambos arreglos y verifica que el cambio se refleja en los dos.

import java.util.Scanner;

public class Ejercicio_7_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long precios[] = new long[4];
        long preciosAuditoria[] = precios;

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingrese el precio " + (i + 1) + ": ");
            precios[i] = scanner.nextLong();
        }
        System.out.println("Los precios originales son: ");
        for(int i = 0; i < precios.length; i++){
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }
        System.out.println("Ingrese el índice del precio a corregir (0-3): ");
        int indice = scanner.nextInt();
        System.out.println("Ingrese el nuevo precio: ");
        long nuevoPrecio = scanner.nextLong();
        preciosAuditoria[indice] = nuevoPrecio;
        System.out.println("Los precios corregidos son: ");
        for(int i = 0; i < precios.length; i++){
            System.out.println("Precio " + (i + 1) + ": " + precios[i]);
        }
        scanner.close();
    }
}
