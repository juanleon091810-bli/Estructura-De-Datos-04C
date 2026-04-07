// Crea un reproductor de música simplificado que gestione una lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int opc;
        
        do {
            System.out.println("\n=====================");
            System.out.println("MENU DE OPCIONES");
            System.out.println("=====================");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar playlist");
            System.out.println("3. Duración total de la playlist");
            System.out.println("0. Salir");
            System.out.println("======================");
            System.out.println("Seleccione una opcion");
            opc = sc.nextInt();
            sc.nextLine();
            System.out.println("======================");


            switch (opc) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duracion en segundos: ");
                    int duracionS = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    Cancion newCancion = new Cancion(titulo, artista, duracionS, genero);
                    playlist.agregarCancion(newCancion);
                    break;
                case 2:
                    playlist.mostrarPlaylist();
                    break;
                case 3:
                    System.out.println(playlist.duracionTotal());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opc != 0);
        sc.close();
    }
}
