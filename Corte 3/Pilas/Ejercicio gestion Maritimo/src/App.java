// 1. Puerto Marítimo (Gestión de Contenedores)
// En un puerto de carga, los contenedores se apilan en columnas verticales dentro de los barcos o en el muelle. 
// Debido al espacio restringido, solo se puede acceder al contenedor que está en la cima.

// La Clase Contenedor (Nodo): Debe contener idCodigo (String), empresa (String), peso (double) y 
// tipoCarga (String).
// El Problema: El supervisor necesita un reporte rápido de cuánta carga hay de una empresa en particular 
// sin retirar los contenedores.
// Reto: Implementa un método contarPorEmpresa(String nombreEmpresa) que recorra la pila y devuelva 
// la cantidad total de contenedores que pertenecen a esa empresa.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        PilaContenedores muelle = new PilaContenedores();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n||==||==|| MENU DE OPCINES DEL MUELLE ||==||==||");
            System.out.println("1. Visualizar los contenedores del muelle");
            System.out.println("2. Agregar nuevo contenedor");
            System.out.println("3. Eliminar contenedor de la lista");
            System.out.println("4. Contar los contenedores por empresa");
            System.out.println("0: Salir");
            System.out.println("||==||==||==||==||==||==||==||==||");
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            System.out.println("||==||==||==||==||==||==||==||==||");

            switch (opcion) {
                case 1:
                    System.out.println("Visualizando el estado actual del muelle...");
                    muelle.print();
                    break;
                case 2:
                    System.out.println("ID: "); String id = sc.nextLine();
                    System.out.println("EMPRESA: "); String empresa = sc.nextLine();
                    System.out.println("PESO (t): "); Double peso = sc.nextDouble();
                    System.out.println("CARGA: "); String tipoCarga = sc.nextLine();

                    muelle.push(new Contenedor(id, empresa, peso, tipoCarga));
                    System.out.println("El contenedor se ha registrado correctamente. ");
                    break;

                case 3:
                       Contenedor retirado = muelle.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("El muelle está vacío.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el nombre de la empresa qeu desea buscar: ");
                    
                    String empresaBusqueda = sc.nextLine();
                    int total = muelle.contadorPorEmpresa(empresaBusqueda);
                    System.out.println("Resultado: Se encontraron " + total + " contenedores de la empresa " + empresaBusqueda);
                    break;
                
                    case 5:
                        System.out.println("Saliendo...");
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion !=0);
        sc.close();
    }
}
