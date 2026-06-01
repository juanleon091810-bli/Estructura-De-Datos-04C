// En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. 
// Cada vez que alguien envía un documento, 
// este se agrega al final de la cola de impresión. La impresora procesa los trabajos en el orden exacto 
// en que fueron recibidos.

// La Clase Documento (Nodo): Debe contener nombreArchivo (String), usuario (String), 
// numeroPaginas (int) y esColor (boolean).
// El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total 
// tiene la cola de impresión pendiente.
// Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos 
// los documentos en espera, sin alterar la cola.

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Impresora impresora = new Impresora();
        int opcion;

        do {
            System.out.println("\nMenú de Impresora:");
            System.out.println("1. Agregar documento a la cola");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Ver total de páginas en la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del archivo: ");
                    String nombreArchivo = sc.nextLine();
                    System.out.print("Ingrese el nombre del usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int numeroPaginas = sc.nextInt();
                    System.out.print("¿Es a color? (true/false): ");
                    boolean esColor = sc.nextBoolean();
                    Documento nuevoDocumento = new Documento(nombreArchivo, usuario, numeroPaginas, esColor);
                    impresora.agregarDocumento(nuevoDocumento);
                    break;
                case 2:
                    impresora.imprimirDocumento();
                    break;
                case 3:
                    impresora.calcularPaginasTotales();
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
