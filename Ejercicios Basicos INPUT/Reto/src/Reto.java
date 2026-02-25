//el usuario debe ingresar los precios de 5 
// productos que compro en el mercado uno por uno
//para calcular el total

import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        double[] precios = new double[5];
        double subtotal;
        double total;
        double precioMayor = 0;

        for (int i = 0; i < precios.length; i++) {
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            precios[i] = usuario.nextDouble();
        } 
        subtotal = precios[0] + precios[1] + precios[2] + precios[3] + precios[4];

        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > precioMayor) {
                precioMayor = precios[i];
            }
        }

        if (subtotal >= 20000) {
            System.out.println("¡FELICIDADES!, tienes un descuento de $2000");
            total = subtotal - 2000;
        } else {
            total = subtotal;
        }
        System.out.println("El total de la compra es: $" + total);
        System.out.println("El precio mayor es $" + precioMayor);

        usuario.close();
    }
}