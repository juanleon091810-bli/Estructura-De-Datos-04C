// Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben 
// colocarse  al principio para ser vendidos primero.

// La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
// El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista 
// (prioridad de venta). Si vence en más tiempo, se pone al final.
// Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Stock stock = new Stock();
        int opcion;

        do {
            System.out.println("\n#######################");
            System.out.println("MENU INICIAL");
            System.out.println("########################");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos cerca de vencer");
            System.out.println("0. Salir");
            System.out.println("########################");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            System.out.println("########################");
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese los días para vencer: ");
                    int diasParaVencer = scanner.nextInt();
                    Producto newProducto = new Producto(nombre, cantidad, diasParaVencer);
                    stock.agregarProducto(newProducto);
                    break;
                case 2:
                    stock.prodCercaVencer();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
