//Pide al usuario dos números enteros a y b. Asigna b = a, 
//luego pide un nuevo valor para b. Imprime a y b después del 
//cambio y explica con un mensaje en consola por qué a no cambió

import java.util.Scanner;

public class Ejercicio_6_Input {
    public static void main(String[] args) {
        
        Scanner usuario = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Ingrese un numero entero para a: ");
        a = usuario.nextInt();
        System.out.println("Ingrese un numero entero para b: ");
        b = usuario.nextInt();
// Asignamos los valores iniciales de a y b antes de pedir un nuevo valor para b
        b = a;

        System.out.println("Ingrese un nuevo numero entero para b: ");
        b = usuario.nextInt();
        System.out.println("el valor de a es: " + a);
        System.out.println("el valor de b es: " + b);
        System.out.println("a no cambio porque se asigno el valor de a a b antes de pedir un nuevo valor para b");
        usuario.close();
    }
}
