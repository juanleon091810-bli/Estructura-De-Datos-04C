// Una empresa de logística administra a sus empleados en un BST organizado por número de cédula. 
// El área de RRHH consulta frecuentemente el empleado con el menor y el mayor número de cédula para 
// procesar los extremos de la nómina. También necesita conocer la altura del árbol para auditar si la 
// estructura sigue siendo eficiente después de muchas incorporaciones.

// La Clase Empleado (Nodo): Debe contener cedula (long, clave del BST), nombreCompleto (String), cargo (String) 
// y salario (double).
// El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el registro) 
// y al de cédula más alta (el más reciente), y también reportar la altura actual del árbol para verificar que 
// las búsquedas siguen siendo eficientes.
// Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol izquierdo 
// o derecho respectivamente hasta llegar a una hoja e impriman los datos del empleado encontrado. 
// Implementa también reporteEficiencia() que imprima la altura actual del árbol y el número total de hojas (contarHojas()).

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Nomina nomina = new Nomina();
        int opcion;

        do {
            System.out.println("\n--- Menu de Nomina ---");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Buscar Empleado por Cedula");
            System.out.println("3. Buscar Empleado con Cedula Minima");
            System.out.println("4. Buscar Empleado con Cedula Maxima");
            System.out.println("5. Reporte de Eficiencia");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cedula: ");
                    long cedula = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Ingrese nombre completo: ");
                    String nombreCompleto = sc.nextLine();
                    System.out.print("Ingrese cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Ingrese salario: ");
                    double salario = sc.nextDouble();
                    nomina.AgregarEmpleado(cedula, nombreCompleto, cargo, salario);
                    break;
                case 2: 
                    System.out.print("Ingrese cedula a buscar: ");
                    long cedulaBuscar = sc.nextLong();
                    Empleado buscado = nomina.Buscar(cedulaBuscar);

                    break;
                case 3: 
                    Empleado minimo = nomina.BuscarMinimo();
                    if (minimo != null) {
                        System.out.println("Empleado con Cedula Minima:");
                        System.out.println("Cedula: " + minimo.cedula);
                        System.out.println("Nombre Completo: " + minimo.nombreCompleto);
                        System.out.println("Cargo: " + minimo.cargo);
                        System.out.println("Salario: " + minimo.salario);
                    } else {
                        System.out.println("No hay empleados registrados.");
                    }
                    break;

                case 4: 
                    Empleado maximo = nomina.BuscarMaximo();
                    if (maximo != null) {
                        System.out.println("Empleado con Cedula Maxima:");
                        System.out.println("Cedula: " + maximo.cedula);
                        System.out.println("Nombre Completo: " + maximo.nombreCompleto);
                        System.out.println("Cargo: " + maximo.cargo);
                        System.out.println("Salario: " + maximo.salario);
                    } else {
                        System.out.println("No hay empleados registrados.");
                    }
                    break;

                case 5: 
                    System.out.println("Altura del Arbol: " + nomina.Altura());
                    System.out.println("Numero de Hojas: " + nomina.ContarHojas());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
                }
        }while(opcion != 0);
        sc.close();
    }
}