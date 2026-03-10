// INSERTION SORT

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno 
// en el estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el 
// código ISBN (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez 
// llenado el arreglo, el algoritmo debe simular 
// el proceso de "insertar" 
// el elemento comparándolo con los que ya están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo 
// (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver cómo los elementos se desplazan para abrir 
// espacio al nuevo valor

import java.util.Scanner;

public class Ejercicio_Ordenamiento_2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("SEÑOR/A BIBLIOTECARIO/A! Ingrese la cantidad de libros recibidos:");
        int libros = scanner.nextInt();
        int []cajaLibros = new int[libros];
        for(int i = 0; i < libros; i++){
            System.out.println("Ingrese el codigo ISBN del libro " + (i+1) + " sin puntos ni comas (ej. 000):");
            cajaLibros[0] = scanner.nextInt();

            System.out.println("Arreglo actual:");
            sort(cajaLibros);

            System.out.print("[");
            for(int j = 0; j < cajaLibros.length; j++){
                System.out.print(cajaLibros[j]);
                if(j < cajaLibros.length - 1){
                System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        scanner.close();
    }

    public static void sort(int[] arr) {
        
        int n = arr.length;
        for(int i = 0; i < n; ++i){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
}
