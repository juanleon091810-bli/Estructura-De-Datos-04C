//Pide al usuario los datos de su perfil: 
//nombre, edad, ciudad, correo y si acepta términos 
//y condiciones. Muestra un resumen indicando el tipo de dato que se usó para cada campo

import java.util.Scanner;

public class Ejercicio_4_Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nombre, ciudad, correo;
        int edad;
        boolean aceptaTerminos;

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        System.out.println("Ingrese la ciudad donde se ubica: ");
        ciudad = scanner.next();
        System.out.println("Ingrese su correo electronico: ");
        correo = scanner.next();
        System.out.println("¿Dese aceptar terminos y condiciones?: 1: Si, 2: No ");
        int terminos = scanner.nextInt();

        if (terminos == 1) {
            aceptaTerminos = true;
        } else {
            aceptaTerminos = false;
        }
        scanner.close();

        System.out.println("USUARIO CREADO EXITOSAMENTE:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Correo: " + correo);
        System.out.println("Acepta términos y condiciones: " + aceptaTerminos);
        
    }
}
