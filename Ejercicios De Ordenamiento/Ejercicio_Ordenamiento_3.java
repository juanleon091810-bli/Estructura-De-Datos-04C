//SHELL SORT

// Contexto: Una empresa de logística maneja paquetes con diferentes 
// pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el peso de N paquetes 
// (se recomienda probar con al menos 10 para notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de N/2.
// El estudiante debe explicar en comentarios por qué este 
// método es generalmente más rápido que la inserción simple al 
// trabajar con elementos que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final 
// ordenado después de aplicar todas las fases de reducción de saltos.

import java.util.Scanner;

public class Ejercicio_Ordenamiento_3 {

    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de paquetes:");
    int paquetes = scanner.nextInt();
    double []pesoPaquetes = new double[paquetes];
    for(int i = 0; i < paquetes; i++){
        System.out.println("Ingrese el peso del paquete " +(i+1) + " (ej. 2.5):");
        pesoPaquetes[i] = scanner.nextDouble();
        }
    System.out.println("Arreglo original:");
    for (double peso : pesoPaquetes) {
        System.out.print(peso + "KG, ");
    }
    System.out.println();

    sort(pesoPaquetes);

    System.out.println("Arreglo ordenado:");
    for (double peso : pesoPaquetes) {
        System.out.print(peso + "KG, ");
    }
    scanner.close();

// Shell es mas eficiente ya que divide el grado de elementos a ordenar haciendolo mas rapido y 
// optimo en comparacion a otros algoritmos como insersion o seleccion

}

//Creamos la funcion Shell para ordenar el arreglo de pesos

    public static void sort(double[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
