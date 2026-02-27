// Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia 
// real en notasRespaldo[] copiando elemento por elemento. Modifica notas[0] 
// con un valor que el usuario ingrese. 
// Muestra ambos arreglos y verifica que notasRespaldo no cambió.
// Datos de entrada: double × 3 notas, double nuevo valor para notas[0]

import java.util.Scanner;

public class Ejercicio_8_Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double[3];
        double notasRespaldo[] = new double[3];
        for (int i = 0; i < notas.length; i++){
            System.out.println("ingrese la nota " + (i+1) + ":");
            notas[i] = scanner.nextDouble();
            notasRespaldo[i] = notas[i];
        }
        System.out.println("Las notas originales son: ");
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + ":" + notas[i]);
        }
        System.out.println("Las notas respaldadas son: ");
        for (int i = 0; i < notasRespaldo.length; i++){
            System.out.println("Nota " + (i+1) + ":" + notasRespaldo[i]);
        }
        System.out.println("Ingrese un nuevo valor para la nota 1:");
        double nuevoValor = scanner.nextDouble();
        notas[0] = nuevoValor;
        System.out.println("Las notas modificadas son: ");
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + ":" + notas[i]);
        }
        System.out.println("Las notas respaldadas siguen siendo: ");
        for (int i = 0; i < notasRespaldo.length; i++){
            System.out.println("Nota " + (i+1) + ":" + notasRespaldo[i]);
        }   
        scanner.close();
    }
}
