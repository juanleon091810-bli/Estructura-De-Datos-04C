// SESLECTION VS INSERTION

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de 
// operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. 
// El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos 
// hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

import java.util.Scanner;

public class Ejercicio_Ordenamiento_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 6 numeros enteros desordenados:");
        int[] numeros = new int[6];
        for(int i = 0; i < 6; i++){
            numeros[i] = scanner.nextInt();
        }

        int[] copiaNumeros = numeros.clone();

        System.out.println("Arreglo original:");
        for (int numero: numeros) {
            System.out.println(numero);
        }
        System.out.println("Aplicando Selección...");
        selection(numeros);
        System.out.println("Arreglo ordenado con Selección:");
        for (int numero: numeros) {
            System.out.println(numero);
        }
        System.out.println("Aplicando Inserción...");
        insertion(copiaNumeros);
        System.out.println("Arreglo ordenado con Inserción:");
        for (int numero: copiaNumeros) {
            System.out.println(numero);
        }

        scanner.close();
    }

    public static void selection(int[] arr) {

    int cambios = 0;

    for (int i = 0; i < arr.length - 1; i++) {
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        if (min != i) {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            cambios++; // contamos el swap
        }
        }

        System.out.println("Cantidad de cambios: " + cambios);
    }

  public static void insertion(int[] arr) {

    int cambios = 0;

    for (int i = 1; i < arr.length; i++) {

        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
            cambios++; // contamos cada movimiento
        }
        arr[j + 1] = key;
    }

    System.out.println("Cantidad de cambios: " + cambios);
}
}
