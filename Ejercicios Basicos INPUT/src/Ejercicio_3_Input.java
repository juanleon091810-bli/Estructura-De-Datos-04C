//Pide al usuario su nombre y 4 notas de un curso. 
// Calcula el promedio y determina si aprobó (promedio >= 3.0).
//Datos de entrada:
//String nombre
//double nota1, nota2, nota3, nota4

import java.util.Scanner;

public class Ejercicio_3_Input {
    public static void main(String[] args) throws Exception {
        
        Scanner usuario = new Scanner(System.in);
        String nombre;
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
        double promedio;

        System.out.println("Ingrese su nombre: ");
        nombre = usuario.nextLine();
        for(int i = 1; i <= 4; i++) {
            System.out.println("Ingrese la nota " + i + ": ");
            switch (i) {
                case 1:
                    nota1 = usuario.nextDouble();
                    break;
                case 2:
                    nota2 = usuario.nextDouble();
                    break;
                case 3:
                    nota3 = usuario.nextDouble();
                    break;
                case 4:
                    nota4 = usuario.nextDouble();
                    break;
            }
        }

        promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        usuario.close();

            System.out.println("Boletin de calificaciones");
            System.out.println("Nombre: " + nombre);
            System.out.println("Promedio: " + promedio);
            if (promedio >= 3.0) {
                System.out.println("¡Aprobado!");
            } else {
                System.out.println("Reprobado.");
            }
    }
}