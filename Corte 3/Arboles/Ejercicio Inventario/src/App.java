// Un taller mecánico almacena los repuestos de su inventario en un BST organizado por código de referencia 
// (un número entero único). Cuando un repuesto se agota, su nodo queda como hoja (no tiene hijos) 
// porque no ha sido reemplazado por variantes. El administrador quiere saber cuántos repuestos son "únicos" 
// (sin variantes relacionadas) y cuál es el recorrido completo del inventario en PreOrden para realizar una 
// copia de seguridad del árbol.

// La Clase Repuesto (Nodo): Debe contener codigoRef (int, clave del BST), descripcion (String), marca (String) y stock (int).
// El Problema: El administrador necesita dos reportes: el primero lista todos los repuestos en PreOrden (para poder 
// reconstruir el árbol en otro sistema con el mismo orden de inserción), y el segundo informa cuántos repuestos 
// son hojas del árbol (sin variantes relacionadas).
// Reto: Implementa backupPreOrden() que imprima todos los repuestos en recorrido PreOrden con el formato [codigoRef] 
// descripcion - marca (stock uds). Implementa también reporteRepuestosUnicos() que use contarHojas() e imprima un mensaje 
// indicando cuántos repuestos no tienen variantes relacionadas en el catálogo.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("...:...: Menú de Inventario de Repuestos :...:...");
            System.out.println("1. Agregar Repuesto");
            System.out.println("2. Buscar Repuesto");
            System.out.println("3. Reporte de Repuestos Únicos");
            System.out.println("4. Backup PreOrden");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese código de referencia: ");
                    int codigoRef = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Ingrese marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese stock: ");
                    int stock = sc.nextInt();
                    inventario.AgregarRepuesto(codigoRef, descripcion, marca, stock);
                    break;
                case 2:
                    System.out.print("Ingrese código de referencia a buscar: ");
                    int codigoBuscar = sc.nextInt();
                    Repuesto encontrado = inventario.BuscarRepuesto(codigoBuscar);
                    if (encontrado != null) {
                        System.out.println("Repuesto encontrado: [" + encontrado.codigoRef + "] " + encontrado.descripcion + " - " + encontrado.marca + " (" + encontrado.stock + " uds)");
                    } else {
                        System.out.println("Repuesto no encontrado.");
                    }
                    break;
                case 3:
                    inventario.ReporteRepuestosUnicos();
                    break;
                case 4:
                    System.out.println("Backup PreOrden del Inventario:");
                    inventario.BackupPreOrden();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }
}
