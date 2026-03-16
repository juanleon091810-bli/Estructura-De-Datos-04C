// Objetivo: Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.
// ¿Qué debes hacer?
// 1. Clase: Crea una clase Producto con: id (int), nombre (String), precio (double) y stock (int).
// 2. Entrada de Datos: Pide al usuario que ingrese los datos de 5 productos por teclado y guárdalos en un arreglo
// Producto[] .
// 3. Ordenamiento: Usa Shell Sort para ordenar los productos de menor a mayor según su id .
// 4. Búsqueda: Pide un id al usuario y búscalo usando Búsqueda Binaria

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[5];

        // Entrada de datos
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese los datos del producto " + (i + 1));
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea
            productos[i] = new Producto(id, nombre, precio, stock);
        }

        // Ordenamiento con Shell Sort
        shellSort(productos);

        // Búsqueda Binaria
        System.out.print("Ingrese el ID a buscar: ");
        int idBuscado = scanner.nextInt();
        int indice = busquedaBinaria(productos, idBuscado);
        if (indice != -1) {
            System.out.println("Producto encontrado:");
            System.out.println("ID: " + productos[indice].getId());
            System.out.println("Nombre: " + productos[indice].getNombre());
            System.out.println("Precio: " + productos[indice].getPrecio());
            System.out.println("Stock: " + productos[indice].getStock());
        } else {
            System.out.println("Producto no encontrado.");
        }

        scanner.close();
    }

    // Método para ordenar con Shell Sort
    public static void shellSort(Producto[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Producto temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].getId() > temp.getId(); j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    // Método para búsqueda binaria
    public static int busquedaBinaria(Producto[] arr, int id) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].getId() == id) {
                return mid;
            } else if (arr[mid].getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

