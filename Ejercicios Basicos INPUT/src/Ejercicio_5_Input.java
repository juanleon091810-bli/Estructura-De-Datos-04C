//Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.

import java.util.Scanner;;

public class Ejercicio_5_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double peso, altura, imc;

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su peso en kg: ");
        peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        scanner.close();

        System.out.println("Hola " + nombre + ", tu IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }
}
