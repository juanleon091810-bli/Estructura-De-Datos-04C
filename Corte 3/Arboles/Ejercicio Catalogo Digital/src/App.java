// La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave única. 
// Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. El sistema debe poder confirmar si un 
// ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.

// La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y anioPublicacion (int).
// El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo ordenado de menor a mayor 
// por ISBN para enviarlo a la sede central. También debe verificar si un ISBN específico ya existe en el catálogo antes de 
// registrar una donación.
// Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los libros en orden 
// ascendente de ISBN (imprime isbn - titulo - autor). Además, implementa existeISBN(long isbn) que retorne true 
// si el libro ya está registrado y false en caso contrario.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Registrar libro");
            System.out.println("2. Imprimir catálogo");
            System.out.println("3. Verificar ISBN");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ISBN: ");
                    long ISBN = sc.nextLong();
                    sc.nextLine(); // Consumir el salto de línea
                    if (biblioteca.existeISBN(ISBN)) {
                        break;
                    }
                    System.out.print("Ingrese título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese año de publicación: ");
                    int publicacion = sc.nextInt();
                    biblioteca.Registrar(ISBN, titulo, autor, publicacion);
                    break;
                case 2:
                    biblioteca.InOrder();
                    break;
                case 3:
                    System.out.print("Ingrese ISBN a verificar: ");
                    long isbnVerificar = sc.nextLong();
                    biblioteca.existeISBN(isbnVerificar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
