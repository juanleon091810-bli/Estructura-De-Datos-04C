// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. 
// El personal introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar es el 
// primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer, debe ser 
// retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope sea un medicamento 
// seguro o la pila quede vacía.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        Farmacia farmacia = new Farmacia();
        int opcion;

        do {
            System.out.println("\n----- Menú de la Farmacia -----");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Validar despacho");
            System.out.println("3. Eliminar medicamento del tope");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del medicamento: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el lote del medicamento: ");
                    String lote = sc.nextLine();
                    System.out.print("Ingrese los días para vencer: ");
                    int diasParaVencer = sc.nextInt();
                    sc.nextLine();
                    farmacia.push(new Medicamento(nombre, lote, diasParaVencer));
                    break;
                case 2:
                    farmacia.validarDespacho();
                    break;
                case 3:
                    farmacia.pop();
                    System.out.println("El medicamento ha sido eliminado del tope existosamente.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }
}
