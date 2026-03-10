//SELECTION SORT

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar 
// quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron 
// (ej. 5 a 10). Luego, debe pedir el tiempo 
// en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) 
// en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
// adicionalmente, mostrar un mensaje claro 
// indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;
public class Ejercicio_Ordenamiento_1
{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de corredores de la carrera: ");
        int num = scanner.nextInt();
        Double []corredores = new Double[num];

        for(int i = 0; i <= (num-1); i++){
            System.out.println("Ingrese el tiempo del corredor " +  (i+1) + " con decimales incluidos :");
            corredores[i] = scanner.nextDouble();
        }
        System.out.println("Listado de tiempos de cada corredor registrado:");
        System.out.println(corredores);
        scanner.close();
        System.out.println("PODIO DE CORREDORES");
        sort(corredores);
        System.out.println("PRIMER LUGAR: " + corredores[0]);
        System.out.println("SEFUNDO LUGAR: " + corredores[1]);
        System.out.println("TERCER LUGAR: " + corredores[2]);
    }

    public static void sort(Double[] arr){

        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int indMin = i;
            for(int j = i+1; j < n; j++){
                if (arr[j] > indMin) {
                 indMin = j;   
                }
            }
            double temp = arr[indMin];
            arr[indMin] = arr[i];
            arr[i] = temp;
        }
    }
}

