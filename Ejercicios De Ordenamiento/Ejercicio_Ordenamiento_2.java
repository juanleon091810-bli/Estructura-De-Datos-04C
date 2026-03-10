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
        long []cajaLibros = new long[libros];
        for(int i = 0; i < libros; i++){
            System.out.println("Ingrese el codigo ISBN de cuatro numeros del libro " +(i+1) + " sin puntos ni comas (ej. 0000:");
            cajaLibros[i] = scanner.nextLong();
        }

        sort(cajaLibros);
        System.out.println(cajaLibros);

        scanner.close();
    }

    public static void sort(long[] arr) {
        
        int n = arr.length;
        for(int i = 1; i < n; ++i){
            long key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
                System.out.println(arr[j]);
            }
            arr[j+1] = key;
        }
    }
}
