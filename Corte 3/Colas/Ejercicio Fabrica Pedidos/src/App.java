// Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. 
// El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. 
// Si un pedido ya fue cancelado por el cliente, debe ser descartado automáticamente al momento de ser procesado.

// La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado (boolean).
// El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser 
// despachados, pero registrados en un conteo.
// Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = true, 
// lo descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. Al 
// finalizar, muestra el total despachado y el total cancelado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Fabrica fabrica = new Fabrica();
        int opcion;

        do{

            System.out.println("1. Agregar Pedido");
            System.out.println("2. Procesar Pedidos");
            System.out.println("3. Mostrar Pedidos");
            System.out.println("4. Vaciar Pedidos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch(opcion){
                case 1:
                    System.out.print("Número de Pedido: ");
                    String numeroPedido = sc.nextLine();
                    System.out.print("Cliente: ");
                    String cliente = sc.nextLine();
                    System.out.print("Total a Pagar: ");
                    double totalAPagar = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("¿El pedido está cancelado? (true/false): ");
                    boolean cancelado = sc.nextBoolean();
                    fabrica.agregarPedido(numeroPedido, cliente, totalAPagar, cancelado);
                    break;
                case 2:
                    fabrica.procesarPedidos();
                    break;
                case 3:
                    fabrica.mostrarPedidos();
                    break;
                case 4:
                    fabrica.vaciarPedidos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while(opcion != 0);
        sc.close();
    }
}
