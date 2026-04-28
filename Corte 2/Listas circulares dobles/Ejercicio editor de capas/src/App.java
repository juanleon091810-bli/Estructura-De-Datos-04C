// Los editores gráficos organizan el diseño en capas. El usuario navega a la 
// capa superior (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa. 
// La estructura es circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, 
// alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). 
// mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: 
// crea 4 capas, activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Editor editor = new Editor();
        int opcion;

        do {
            System.out.println("\n====Menu de opciones de capas====");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Cambiar visibilidad");
            System.out.println("5. Eliminar capa");
            System.out.println("6. Mostrar todas las capas");
            System.out.println("7. Ejecutar simulacion");
            System.out.println("0. salir");
            System.out.println("===============");
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
            System.out.println("===============");

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese el nombre de la capa: ");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Ingrese el estado de visibilidad de la capa (true, false): ");
                    boolean visibilidad = sc.nextBoolean();
                    sc.nextLine();
                    System.out.println("Ingrese el tipo de capa (texto, fondo, objeto): ");
                    String tipo = sc.nextLine();
                    Capa nuevaCapa = new Capa(nombre, visibilidad, tipo);
                    editor.agregarCapa(nuevaCapa);

                    break;

                case 2:

                    editor.subirCapa(editor.capaActiva);
                    break;

                case 3:

                    editor.bajarCapa(editor.capaActiva);
                    break;

                    case 4:
                        editor.toggleVisibilidad(editor.capaActiva.nombre);
                        break;

                    case 5: 
                        editor.eliminarCapa(editor.capaActiva);
                        break;

                    case 6:
                        editor.mostrarCapas(editor);
                        break;

                    case 7:
                        Capa capa1 = new Capa("Texto Principal", true, "texto");
                        editor.agregarCapa(capa1);
                        Capa capa2 = new Capa("Fondo Azul", true, "fondo");
                        editor.agregarCapa(capa2);
                        Capa capa3 = new Capa("Logo Empresa", false, "objeto");
                        editor.agregarCapa(capa3);
                        Capa capa4 = new Capa("Texto Secundario", true, "texto");
                        editor.agregarCapa(capa4);
                        break;

                    case 0:
                        System.out.println("Saliendo...");

                default:
                    System.out.println("Opcion invalidad. Intentelo nuevamente.");
                    break;
        }
        } while (opcion != 0);
        sc.close();
    }
}
