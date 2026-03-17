// Objetivo: Gestionar las notas de un grupo, encontrar los valores extremos y ordenar la lista.
// ¿Qué debes hacer?
// 1. Entrada: Pide al usuario 5 notas (números decimales) por teclado.
// 2. Estadísticas: Recorre el arreglo para encontrar cuál es la nota más alta y cuál la más baja del grupo.
// 3. Ordenamiento: Ordena las notas de menor a mayor usando Selección (Selection Sort)

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas notas deseas ingresar?");
        double[] notas = new double[scanner.nextInt()]; 
        // Cambia el tamaño del arreglo según la cantidad de notas que quieras ingresar

        // Entrada de notas
        for(int i = 0; i < notas.length; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\nNotas registradas:");
        for(double nota : notas) {
            System.out.println("Nota del estudiante: " + nota);
        }

        // Encontrar extremos
        encontrarExtremos(notas);

        scanner.close();
    }

    public static void encontrarExtremos(double[] notas) {
        double max = notas[0];
        double min = notas[0];

        for(double nota : notas) {
            if(nota > max) {
                max = nota;
            }
            if(nota < min) {
                min = nota;
            }
        }

        System.out.println("\nNota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}
